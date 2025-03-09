import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testAdicionarPrato() {
        Pedido pedido = new Pedido("Carlos");
        Prato pizza = new Prato("Pizza", 30.0, "Queijo e tomate");

        pedido.adicionarPrato(pizza);

        assertEquals(30.0, pedido.calcularTotal());
    }

    @Test
    public void testRemoverPrato() {
        Pedido pedido = new Pedido("Ana");
        Prato hamburguer = new Prato("Hamburguer", 20.0, "Pão e carne");

        pedido.adicionarPrato(hamburguer);
        pedido.removerPrato(hamburguer);

        assertEquals(0.0, pedido.calcularTotal());
    }
}
