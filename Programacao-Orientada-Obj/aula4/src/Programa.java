import entities.Veterinario;

public class Programa { public static void main(String[] args) {

    Veterinario v1 = new Veterinario();

    Veterinario v2 = new Veterinario(
            "Roberto","Matias", "CRV-12555", 3600.40);

    double salario = 2500.25;

    //v1.nome = "Joana";
    //v1.sobrenome = "Ribeiro";
    //v1.registro = "CRV55214";
    //v1.salario = 2600.50;
}

}
