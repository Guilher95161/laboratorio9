package laboratorio9;
public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;

    public Telefonista(String nome, double salario, int estacaoDeTrabalho) {
        super(nome, salario);
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

    public String mostraDados() {
        return super.mostraDados() + "\n" + "Estação de Trabalho: " + estacaoDeTrabalho;
    }
}
