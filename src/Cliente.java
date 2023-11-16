public class Cliente extends Pessoa {
    private String codigo;    // atributo próprio do Cliente
    private Profissao profissao; // exemplo de composição

    public Cliente(String nome, String dataNascimento, Endereco endereco, Telefone telefone, String codigo, Profissao profissao) {
        super(nome, dataNascimento, endereco, telefone);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public void cadastrar() {
        System.out.println("Cliente " + super.informacoesBasicas() + " cadastrado com sucesso.");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
