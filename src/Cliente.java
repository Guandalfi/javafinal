public class Cliente {
    public String nome;
    public String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
}
