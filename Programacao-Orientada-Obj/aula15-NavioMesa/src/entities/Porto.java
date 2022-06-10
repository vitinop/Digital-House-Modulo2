package entities;
import java.util.ArrayList;
import java.util.List;

public class Porto {
    //    Atributos
    private int id;
    private String portName;
    private List <Container> containersList = new ArrayList<>();

    public Porto(int id, String portName) {
        this.id = id;
        this.portName = portName;
    }
    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public List<Container> getContainersList() {
        return containersList;
    }

    public void setContainersList(List<Container> containersList) {
        this.containersList = containersList;
    }


    //    Métodos costumizados
    public void adicionarContainer(Container c) {
        containersList.add(c);
    }

    public void mostrarContainerPerigoso() {

        for (Container cont : containersList) {
            if (cont.isDanger()) {
                System.out.println(
                        "ID: " + cont.getId() +
                                " - País de Origem: " + cont.getOriginCountry()
                );
            }
        }
    }

    public int quantidadeContainersPerigosos () {
        int contadorContainer = 0;
        for (Container cont : containersList) {
            if (cont.isDanger()) {
               contadorContainer++;
            }
        }
        return contadorContainer;
    }

}
