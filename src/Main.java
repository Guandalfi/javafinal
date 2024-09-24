public class Main {
    public static void main(String[] args) throws Exception {
        //Criar clientes e suas respectivas contas(corrente e poupança)
        //Realizar operações de depósito, saque e transferência entre as contas.
        //Exibir o saldo atualizado de cada conta.
        //Listar todas as contas cadastradas no banco.

        Banco banco = new Banco();  

        ContaCorrente contaCorrente = new ContaCorrente(1, 100, new Cliente("Carlos", "123456789"), 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 200, new Cliente("Maria", "123456789"));

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);    

        contaCorrente.depositar(100);
        contaPoupanca.depositar(500);

        contaCorrente.sacar(50);
        contaPoupanca.sacar(100);

        contaPoupanca.calculaRendimentos(0.50);

        contaPoupanca.getSaldo();
        contaCorrente.getSaldo();

        contaCorrente.transaferir(contaPoupanca, 50);

        banco.listaContas();

    }
}
