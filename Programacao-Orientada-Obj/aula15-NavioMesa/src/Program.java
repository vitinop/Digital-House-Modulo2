import entities.Container;
import entities.Porto;
public class Program {
    public static void main(String[] args) {

        Container c1 = new Container(1,"EUA",false);
        Container c2 = new Container(2,"RUS",false);
        Container c3 = new Container(3,"POR",true);
        Container c4 = new Container(4,"FRA",true);
        Container c5 = new Container(5,"UNKNOWN",true);
        Container c6 = new Container(6,"UNKNOWN",true);
        Container c7 = new Container(7,"UNKNOWN",false);

        Porto porto = new Porto(1, "porto das montanhas");

        porto.adicionarContainer(c1);
        porto.adicionarContainer(c2);
        porto.adicionarContainer(c3);
        porto.adicionarContainer(c4);
        porto.adicionarContainer(c5);
        porto.adicionarContainer(c6);
        porto.adicionarContainer(c7);

        System.out.println("");
        System.out.println("Container perigoso: ");
        porto.mostrarContainerPerigoso();
        System.out.println("");
        System.out.println("Total de containers perigosos: "+porto.quantidadeContainersPerigosos());
        ;

    }
}
