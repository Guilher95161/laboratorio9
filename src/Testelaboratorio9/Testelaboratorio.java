package Testelaboratorio9;

import laboratorio9.*;

public class Testelaboratorio {
    public static void main(String[] args) {
        Funcionario p1 = new Funcionario("Arnaldo", 1000.0);
        Gerente g2 = new Gerente("Beta", 2000.0, "B", "123");
        Secretaria s3 = new Secretaria("Joana", 1500.0, 1);
        Telefonista t1 = new Telefonista("Teles", 1300.0, 1);
        Funcionario p2= new Funcionario("Jorfe",1000.0);
        System.out.println("P1 "+p1.getSalario());
        System.out.println("P2 "+p2.getSalario());
        p2.calculaBonificao();
        System.out.println(Funcionario.getValeRefeicaoDiario());
        Funcionario.reajustaValeRefeicaoDiario(10);
        System.out.println(Funcionario.getValeRefeicaoDiario());
        System.out.println(p1.mostraDados());
        System.out.println(p2.mostraDados());
        System.out.println(g2.mostraDados());
        g2.calculaBonificao();
        System.out.println(g2.mostraDados());
        System.out.println(s3.mostraDados());
        System.out.println(t1.mostraDados());
    }
}
