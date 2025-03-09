import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Livro livro;
    private Membro membro;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        livro = new Livro("Java Básico", "Autor X", "1111");
        membro = new Membro("João", 1, "joao@email.com");
    }

    @Test
    void testAdicionarLivro() {
        biblioteca.adicionarLivro(livro);
        List<Livro> livros = biblioteca.getLivros();
        assertTrue(livros.contains(livro), "O livro deveria estar na biblioteca");
    }

    @Test
    void testRemoverLivro() {
        biblioteca.adicionarLivro(livro);
        biblioteca.removerLivro(livro);
        List<Livro> livros = biblioteca.getLivros();
        assertFalse(livros.contains(livro), "O livro deveria ter sido removido");
    }

    @Test
    void testRegistrarMembro() {
        biblioteca.registrarMembro(membro);
        List<Membro> membros = biblioteca.getMembros();
        assertTrue(membros.contains(membro), "O membro deveria estar registrado");
    }

    @Test
    void testRegistrarEmprestimo() {
        biblioteca.adicionarLivro(livro);
        biblioteca.registrarMembro(membro);
        biblioteca.registrarEmprestimo(livro, membro);

        List<Emprestimo> emprestimos = biblioteca.getEmprestimos();
        assertEquals(1, emprestimos.size(), "Deveria haver um empréstimo registrado");
    }

    @Test
    void testDevolverLivro() {
        biblioteca.adicionarLivro(livro);
        biblioteca.registrarMembro(membro);
        biblioteca.registrarEmprestimo(livro, membro);

        Emprestimo emprestimo = biblioteca.getEmprestimos().get(0);
        biblioteca.devolverLivro(emprestimo);

        List<Emprestimo> emprestimos = biblioteca.getEmprestimos();
        assertTrue(emprestimos.isEmpty(), "O livro deveria ter sido devolvido");
    }
}
