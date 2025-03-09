import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();

        // Adicionando pratos ao cardápio
        cardapio.adicionarPrato(new Prato("Pizza", 30.0, "Massa fina com queijo e tomate"));
        cardapio.adicionarPrato(new Prato("Hamburguer", 20.0, "Pão, carne e salada"));
        cardapio.adicionarPrato(new Prato("Salada", 15.0, "Alface, tomate e cenoura"));

        while (true) {
            System.out.println("\n==== Restaurante ====");
            System.out.println("1. Exibir Cardápio");
            System.out.println("2. Fazer Pedido");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            if (opcao == 1) {
                cardapio.exibirCardapio();
            } else if (opcao == 2) {
                System.out.print("Nome do Cliente: ");
                String nomeCliente = scanner.nextLine();
                Pedido pedido = new Pedido(nomeCliente);

                while (true) {
                    System.out.print("Digite o nome do prato (ou 'fim' para finalizar): ");
                    String nomePrato = scanner.nextLine();
                    if (nomePrato.equalsIgnoreCase("fim")) break;

                    Prato prato = cardapio.buscarPratoPorNome(nomePrato);
                    if (prato != null) {
                        pedido.adicionarPrato(prato);
                        System.out.println("✅ " + prato.getNome() + " adicionado ao pedido.");
                    } else {
                        System.out.println("❌ Prato não encontrado.");
                    }
                }

                pedido.visualizarPedido();
            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }
}
