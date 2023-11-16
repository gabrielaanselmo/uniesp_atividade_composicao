public class Profissao {
    private String nomeProfissao;
    private String nivel;

    public Profissao(String nomeProfissao, String nivel) {
        this.nomeProfissao = nomeProfissao;
        this.nivel = nivel;
    }

    public String getNomeProfissao() {
        return nomeProfissao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNomeProfissao(String nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
