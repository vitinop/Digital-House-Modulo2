import entities.Container;
public class Program {
    public static void main(String[] args) {

        Container c1 = new Container(1,"EUA",false);
        Container c2 = new Container(2,"RUS",false);
        Container c3 = new Container(3,"POR",true);
        Container c4 = new Container(4,"FRA",true);
        Container c5 = new Container(5,"UNKNOWN",true);
        Container c6 = new Container(6,"UNKNOWN",true);
        Container c7 = new Container(7,"UNKNOWN",false);
    }
}
