public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }

    public void calculaRendimentos(double taxa) {
        this.saldo = saldo * taxa;
    }       
}