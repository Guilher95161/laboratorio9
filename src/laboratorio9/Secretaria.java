package laboratorio9;
public class Secretaria extends Funcionario {
    private int ramal;

    public Secretaria(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public String mostraDados() {
        return super.mostraDados() + "\n" + "Ramal: " + ramal;
    }
}
