public class Conta {
    public int numero;
    public double saldo;
    public Cliente cliente;


    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }


    public void depositar(double valor) {
        if (valor <= 0)  {
            System.out.println("Digite um valor valido!!");
        } else {            
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        }
    }


    public void sacar(double valor) {
        if (this.saldo - valor < 0) {
            System.out.println("Valor maior que em conta!! Digite novamente");
        } else {
            this.saldo -= valor;
            System.out.println("Feito saque com sucesso");
        }
    }


    public void transaferir(Conta destino, double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Realizado transferencia com sucesso!!");
        } else {
            System.out.println("Valor digite invalido!! Digite outro valor");
        }
    }


    public double getSaldo() {
        return this.saldo;
    }


    public int getNumero() {
        return this.numero;
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    
    public String toString() {
        String informacoes = "Conta: " + this.numero + " Nome: " + this.cliente.nome + " Saldo: " + this.saldo;
        return informacoes;
    }
}
