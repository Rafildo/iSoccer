import java.util.ArrayList;
import java.util.Scanner;

public class Estadio {
    public static ArrayList<Estadio> stadium = new ArrayList<>();
    public String stadiumname;
    public int cheerers;
    public int snackbars;
    public boolean availability;

    public String getStadiumname() {
        return stadiumname;
    }

    public void setStadiumname(String stadiumname) {
        this.stadiumname = stadiumname;
    }

    public int getCheerers() {
        return cheerers;
    }

    public void setCheerers(int cheerers) {
        this.cheerers = cheerers;
    }

    public int getSnackbars() {
        return snackbars;
    }

    public void setSnackbars(int snackbars) {
        this.snackbars = snackbars;
    }

    public String isAvailability() {
        if (this.availability)
        {
            return "Disponível";
        }
        else
        {
            return "Não disponível";
        }
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Estadio(String stadiumname, int cheerers, int snackbars, boolean availability )
    {
        this.stadiumname = stadiumname;
        this.cheerers = cheerers;
        this.snackbars = snackbars;
        this.availability = availability;
    }

    public static void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Adicionar estádio");
        System.out.println("2: Verificar estádio");
        System.out.println("3: Verificar disponibilidade");
        System.out.println("4: Voltar ao menu");

        int choice = Menu.checkInt();

        switch (choice)
        {
            case 1:
                addStadium();
                break;

            case 2:
                findStadium();
                break;

            case 3:
                checkAvailability();
                break;

            case 4:
                Recurso.selectResource();
                break;
        }

    }

    public static void addStadium()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do estádio");
        String stadiumname = input.nextLine();
        System.out.println("Número de torcedores");
        int cheerers = Menu.checkInt();
        System.out.println("Lanchonetes");
        int snackbars = Menu.checkInt();
        input.nextLine();
        System.out.println("Disponível para uso? (Sim ou Não)");
        String availability = input.nextLine();
        if (availability.equals("Sim"))
        {
            stadium.add(new Estadio(stadiumname,cheerers,snackbars,true));
        }
        else if(availability.equals("Não"))
        {
            stadium.add(new Estadio(stadiumname,cheerers,snackbars,false));
        }
        else
        {
            while(true)
            {
                System.out.println("Por favor digite Sim ou Não!");
                availability = input.nextLine();
                if (availability.equals("Sim"))
                {
                    stadium.add(new Estadio(stadiumname,cheerers,snackbars,true));
                }
                else if(availability.equals("Não"))
                {
                    stadium.add(new Estadio(stadiumname,cheerers,snackbars,false));
                }
                break;
            }
        }

    }

    public String toString()
    {
        return("Nome do estádio: " + this.getStadiumname() + System.lineSeparator() +
                "Número de torcedores: " + this.getCheerers() + System.lineSeparator() +
                "Lanchonetes: " + this.getSnackbars() + System.lineSeparator() +
                "Disponibilidade: " + this.isAvailability() + System.lineSeparator());
    }

    public static void findStadium()
    {
        Scanner input = new Scanner(System.in);

        if (stadium.isEmpty())
        {
            System.out.println("Não há recursos disponíveis");
        }
        else
        {
            System.out.println("Estádio a ser procurado");
            String nome = input.nextLine();
            for (int i = 0; i < stadium.size(); i++)
            {
                if (stadium.get(i).getStadiumname().equals(nome))
                {
                    System.out.println(stadium);
                }
                else
                {
                    System.out.println("Não encontrado");
                }
            }
        }
    }

    public static void checkAvailability()
    {
        int i = 0;
        if (!stadium.isEmpty())
        {
            for (Estadio list : stadium)
            {
                if (list.availability)
                {
                    i++;
                }
            }
            System.out.print("Estádios disponíveis:");
            System.out.println(i);
        }
        else
        {
            System.out.println("Não há recursos disponíveis");
        }
    }

}
