import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorPedidos = 1;
    private int numeroPedido;
    private String cliente;
    private List<Prato> listaDePratos;
    private double total;

    public Pedido(String cliente) {
        this.numeroPedido = contadorPedidos++;
        this.cliente = cliente;
        this.listaDePratos = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarPrato(Prato prato) {
        listaDePratos.add(prato);
        total += prato.getPreco();
    }

    public void removerPrato(Prato prato) {
        if (listaDePratos.remove(prato)) {
            total -= prato.getPreco();
        }
    }

    public double calcularTotal() {
        return total;
    }

    public void visualizarPedido() {
        System.out.println("\nPedido #" + numeroPedido + " - Cliente: " + cliente);
        for (Prato prato : listaDePratos) {
            System.out.println("- " + prato);
        }
        System.out.println("Total: R$ " + String.format("%.2f", total));
    }
}
