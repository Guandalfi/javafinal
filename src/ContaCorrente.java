public class ContaCorrente extends Conta {
    public double limite;
    public ContaCorrente(int numero, double saldo, Cliente cliente, double limite) {
        super(numero, saldo, cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo - valor < 0) {
            if((this.saldo - valor) < (this.limite * -1)) {
            System.out.println("Valor maior que em conta!! Digite novamente");
            }
            else {
                this.saldo -= valor;
                System.out.println("Feito saque com sucesso");    
            }
        } else {
            this.saldo -= valor;
            System.out.println("Feito saque com sucesso");
        }
    }
}