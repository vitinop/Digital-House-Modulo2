import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Program{
public static void main(String[] args){
    Cachorro c1 = new Cachorro(1,"Rojão",5);
    System.out.println(c1);
    c1.emitirSom();
    c1.correr();

    Cavalo cav1 = new Cavalo(1,"Alasão",3);
    System.out.println(cav1);
    cav1.emitirSom();
    cav1.correr();

    Preguica pre1=new Preguica(1,"Soninho",2);
    System.out.println(pre1);
    pre1.subirArvores();
    pre1.emitirSom();
}
}