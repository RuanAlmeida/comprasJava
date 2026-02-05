import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variaveis abaixo:
        Scanner leitor = new Scanner(System.in);
        int limite;
        String compra;
        int valorCompra;
        int numeroDigitado;
        int sair;
        ArrayList<String> listaCompras = new ArrayList<>();


        // inicio do programa - definição de limites
        System.out.println("Digite o limite do cartão: ");
        limite = leitor.nextInt();



        // inicio do for para compras
        for (int i = 0; i < 100; i++) {

            // compras
            System.out.println("Digite o que deseja comprar: ");
            compra = leitor.next();

            System.out.println("Digite o valor da compra: ");
            valorCompra = leitor.nextInt();
            limite -= valorCompra;

            System.out.println("compra realizada");

            // continuar ou sair:
            System.out.println("Digite 0 paa sair ou 1 para continuar comprando: ");
            numeroDigitado = leitor.nextInt();
            if (numeroDigitado == 1) {
                System.out.println("Continuando as compras");
            } else {
                sair = 100;
            }
        }


        Cartao compra1 = new Cartao();
        compra1.setValorCompra(leitor.nextInt());


    }
}
