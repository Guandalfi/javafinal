public class Banco {
    Conta[] contas; 
    int quantidadedeContas = 0;

    public int adicionarConta(Conta conta) {
        //TODO adicionar conta nova em posicao se disponivel
        //TODO bloquear em cinco contas

        if(this.quantidadedeContas == 5) {
            System.out.println("Total de contas atingindo !!");
            return 0;
        }
        
        contas[quantidadedeContas] = conta;
        quantidadedeContas++;

        return 0;
    }

    public Conta encontrarConta(int numero) {
        for (int i = 0; i < contas.length; i++) {
            if (this.contas[i].numero == numero) {
                return contas[i];
            }
        }
        return null;
    }

    public void listaContas() {
        //TODO Lista contas cadastradas, se não tiver nenhuma retorna mensagem de aviso.
    }
}
