package laboratorio9;

public class Funcionario {
    private String nome;
    private double salario;
    private static double valeRefeicaoDiario = 15.0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void reajustaValeRefeicaoDiario(double reajuste) {
        valeRefeicaoDiario += reajuste;
    }

    public static double getValeRefeicaoDiario() {
        return valeRefeicaoDiario;
    }

    public void calculaBonificao() {
        this.setSalario(this.salario+(this.salario/10));
    }

    public String mostraDados() {
        return "----------"+"\n"+"Nome: " + nome + "\n" + "Salario: " + salario +"\n"+ "Bonificação: " + salario / 10;
    }
}
