import java.util.ArrayList;
import java.util.Scanner;

public class Recurso {

    private String type;
    private String name;
    private boolean availability;

    private ArrayList<Recurso> resources = new ArrayList<>();
    Centro_Treinamento centre = new Centro_Treinamento(null,null,0,false);
    Estadio stadium = new Estadio(null,null,0,0,0,false);
    Onibus bus = new Onibus(null,null,false);

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
    public Recurso selectResource()
    {
        System.out.println("1: Transporte");
        System.out.println("2: Centro de treinamento");
        System.out.println("3: Estádio");
        System.out.println("4: Voltar");
        int choice = Tratamento_erro.checkInt();
        switch (choice) {
            case 1:
                getResourceCommonData();
                resources.add(new Onibus("Ônibus",getName(),isAvailability()));
                break;

            case 2:
                getResourceCommonData();
                Centro_Treinamento_Controlador centrecontroller = new Centro_Treinamento_Controlador();
                centrecontroller.manageCentre();
                resources.add(new Centro_Treinamento("Centro de treinamento",getName(),centre.getDormitories(),isAvailability()));
                break;

            case 3:
                getResourceCommonData();
                Estadio_Controlador stadiumcontroller = new Estadio_Controlador();
                stadiumcontroller.manageStadium();
                resources.add(new Estadio("Estádio",getName(),stadium.getCheerers(),stadium.getSnackbars(),stadium.getSnackbars(),availability));
                break;
        }
        return resources.get(resources.size()-1);
    }

    public void getResourceCommonData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome/Código do recurso:");
        setName(input.nextLine());
        System.out.println("Disponível (Sim ou Não):");
        String available = input.nextLine();
        if (available.equals("Sim"))
        {
            setAvailability(true);
        }
        else if (available.equals("Não"))
        {
            setAvailability(false);
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