import Modelos.Compra;
import Modelos.Cartao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        Cartao cartao = new Cartao(limite);


        // codigo prinicpal loop com while

        int sair = 1;

        while (sair != 1){

            System.out.println("Digite a descrição da compra: ");
            String descrição = leitura.next();

        System.out.println("Digite o valor da compra: ");
        double valor = leitura.nextDouble();

        Compra compra = new Compra(valor, descrição);
        boolean compraRealizada = cartao.lancaCompra(compra);

        if (compraRealizada){
            System.out.println("Compra realizada!");
            System.out.println("Digite 0 para sair ou 1 para continuar comprando");

            sair = leitura.nextInt();
        }
        }

    }
}
