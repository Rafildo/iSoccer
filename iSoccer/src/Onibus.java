import java.util.ArrayList;
import java.util.Scanner;

public class Onibus extends Recurso{
    public ArrayList<Onibus> bus = new ArrayList<>();

    public Onibus(String type,String name, boolean availability)
    {
        super(type,name,availability);
    }

    public String toString()
    {
        return ("Código do Ônibus: " + this.getName() + System.lineSeparator() +
        "Disponiblidade: " + this.isAvailable() + System.lineSeparator());
    }

}