package laboratorio9;
public class Gerente extends Funcionario {
    private String usuario;
    private String senha;

    public Gerente(String nome, double salario, String usuario, String senha) {
        super(nome, salario);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void calculaBonificao() {
        super.setSalario(super.getSalario()+(super.getSalario/10) )+ 500);
    }

    @Override
    public String mostraDados() {
        return "--------"+"\n"+"Nome: " + super.getNome() + "\n" + "Salário:" + super.getSalario() + "\n"+"Usuario: " + usuario + "\n"
                + "Bonificação: " + 500;
    }
}
