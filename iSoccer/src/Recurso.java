import java.util.ArrayList;
import java.util.Scanner;

public class Recurso {

    private String type;
    private String name;
    private boolean availability;

    private ArrayList<Recurso> resources = new ArrayList<>();

    public ArrayList<Recurso> getResources() {
        return resources;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Recurso(String type, String name, boolean availability)
    {
        this.type = type;
        this.name = name;
        this.availability = availability;
    }

    public void addResource(Recurso res)
    {
        resources.add(res);
    }

    public String isAvailable() {
        if (isAvailability()) {
            return "Disponível";
        } else {
            return "Não disponível";
        }
    }
    public String toString()
    {
        String values = "";
        for (Recurso list : resources)
        {
            values += list.toString() + " ";
            values += "\n";
        }
        return values;
    }
}