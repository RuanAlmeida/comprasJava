import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double saldo;
    private double limite;
    private List<Compra> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }


    public boolean lancaCompra(Compra compra){
        if (this.saldo > compra.getValor());{



        }
        return false;
    }


    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
}
