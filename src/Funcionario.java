public class Funcionario extends Pessoa {
    private int matricula; // atributo próprio do Funcionario
    private Cargo cargo;   // exemplo de composição

    public Funcionario(String nome, String dataNascimento, Endereco endereco, Telefone telefone, int matricula, Cargo cargo) {
        super(nome, dataNascimento, endereco, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public void cadastrar() {
        System.out.println("Funcionário " + super.informacoesBasicas() + " cadastrado com sucesso.");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
