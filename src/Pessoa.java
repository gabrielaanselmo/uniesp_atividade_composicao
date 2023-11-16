public abstract class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private Telefone telefone;

    public Pessoa(String nome, String dataNascimento, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    // método adicional para exemplificar herança e encapsulamento
    public String informacoesBasicas() {
        return "Nome: " + this.nome + ", Data de Nascimento: " + this.dataNascimento;
    }
}
