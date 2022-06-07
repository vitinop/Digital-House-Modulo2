package entities;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private int id;
    private String OriginCountry;
    private boolean danger;



    public Container(int id, String originCountry, boolean danger) {
        this.id = id;
        this.OriginCountry = originCountry;
        this.danger = danger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginCountry() {
        return this.OriginCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.OriginCountry = originCountry;
    }

    public boolean isDanger() {
        return danger;
    }

    public void setDanger(boolean danger) {
        this.danger = danger;
    }
}
