import entities.Empregado;
import entities.Vendedor;

public class Program {

    public static void main(String[] args) {

//        Vendedor v1 = new Vendedor(01,"Fulano","20111",
//        2200.0,525.0);
//        v1.setComissao(3);
//        v1.setTotalVendas(25.0);
//
//        System.out.println("Vendedor 1 instanciado(a): ");
//        System.out.println(v1);

        System.out.println("Instância do primeiro empregado");
        Empregado emp1 = new Empregado(2,"Patrick","10100",
                1500.0,220.0);
        System.out.println(emp1);

        System.out.println("Instância do segundo empregado");
        Empregado emp2 = new Empregado(3,"Mirella","10100",
                1800.0,290.0);
        System.out.println(emp2);

        System.out.println("");
        System.out.println("");

        // Testando o Objeto Emp1 com o Emp2
        if (emp1.equals(emp2)) {
            System.out.println(emp1.toString() + "\nÉ o mesmo empregado que\n" +
                    emp2.toString());
        } else {
            System.out.println(emp1.toString() + "\nNão é o mesmo empregado que\n" +
                    emp2.toString());
        }

    }
}
