package entities;
import java.util.ArrayList;
import java.util.List;

public class Porto {

    private int id;
    private String portName;
    private List<Container> containersList = new ArrayList<>();

    public Porto(int id, String portName) {
        this.id = id;
        this.portName = portName;
    }

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
}
