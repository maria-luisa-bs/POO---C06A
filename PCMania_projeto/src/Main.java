import br.inatel.cliente.Cliente;
import br.inatel.computador.Computador;
import br.inatel.estoque.Estoque;
import br.inatel.processarpedido.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // fazendo a leitura de entrada do cliente
        Scanner teclado = new Scanner(System.in);

        // criando o cliente
        Cliente cliente = new Cliente("Tiago", "12345678900");

        // computadores disponíveis
        Computador[] computadors = Estoque.getComputadors();

        // opção que o cliente pode escolher
        int op;

        // fazendo um loop do menu para o cliente
        do{
            System.out.println("Bem-vindo(a) a loja PCMania!");
            System.out.println("Aqui na PCMania você encontra diferentes modelos de computador, nos indique qual modelo você deseja comprar:");

            System.out.println("Modelo 1: Apple");
            System.out.println("Modelo 2: Samsung");
            System.out.println("Modelo 3: Dell");

            System.out.println("Caso não queira comprar mais nenhum modelo de computador, selecione a opção '0'!");

            op = teclado.nextInt();

            // fazendo uma estrutura de decisão
            switch (op)
            {
                case 1:
                    cliente.comprarComputador(computadors[0]);
                    System.out.println("Computador modelo Dell foi adicionado ao seu carrinho!");
                    break;
                case 2:
                    cliente.comprarComputador(computadors[1]);
                    System.out.println("Computador modelo Apple foi adicionado ao seu carrinho!");
                    break;
                case 3:
                    cliente.comprarComputador(computadors[2]);
                    System.out.println("Computador modelo Samsung foi adicionado ao seu carrinho!");
                    break;
                case 0:
                    System.out.println("Compra finalizada com sucesso, agradeçemos a preferência!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }while(op != 0);
        // o loop do-while continua enquanto o cliente não selecionar 0

        // chamando o metodo da classe cliente para exibir as informações da compra efetuada
        cliente.informacaoCliente();

        // metedo halper/utilitario
        ProcessarPedido.pedido(cliente.getComputadores());
    }
}
