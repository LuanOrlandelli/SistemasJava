import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato> pratosDisponiveis;

    public Cardapio() {
        this.pratosDisponiveis = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratosDisponiveis.add(prato);
    }

    public void removerPrato(String nome) {
        pratosDisponiveis.removeIf(prato -> prato.getNome().equalsIgnoreCase(nome));
    }

    public void exibirCardapio() {
        System.out.println("\n📜 Cardápio:");
        for (Prato prato : pratosDisponiveis) {
            System.out.println(prato);
        }
    }

    public Prato buscarPratoPorNome(String nome) {
        for (Prato prato : pratosDisponiveis) {
            if (prato.getNome().equalsIgnoreCase(nome)) {
                return prato;
            }
        }
        return null;
    }
}
