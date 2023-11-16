public class Main {
    public static void main(String[] args) {
        Endereco enderecoFuncionario = new Endereco("Av. Paulista", 1000, "Bela Vista", "São Paulo", "SP");
        Telefone telefoneFuncionario = new Telefone("11", "99999-9999");
        Cargo cargoFuncionario = new Cargo("Gerente", 5000);
        Funcionario funcionario = new Funcionario("João", "1980-01-01", enderecoFuncionario, telefoneFuncionario, 123, cargoFuncionario);

        Endereco enderecoCliente = new Endereco("Rua das Flores", 500, "Jardim", "Rio de Janeiro", "RJ");
        Telefone telefoneCliente = new Telefone("21", "88888-8888");
        Profissao profissaoCliente = new Profissao("Engenheiro", "Sênior");
        Cliente cliente = new Cliente("Maria", "1990-02-02", enderecoCliente, telefoneCliente, "C456", profissaoCliente);

        funcionario.cadastrar();
        cliente.cadastrar();
    }
}