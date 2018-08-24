import java.util.ArrayList;
import java.util.Scanner;

public class Centro_treinamento {
    public static ArrayList<Centro_treinamento> centre = new ArrayList<>();
    public String centrename;
    public int dormitories;
    public boolean availability;

    public String getCentrename() {
        return centrename;
    }

    public void setCentrename(String centrename) {
        this.centrename = centrename;
    }

    public int getDormitories() {
        return dormitories;
    }

    public void setDormitories(int dormitories) {
        this.dormitories = dormitories;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Centro_treinamento(String centrename, int dormitories, boolean availability)
    {
        this.centrename = centrename;
        this.dormitories = dormitories;
        this.availability = availability;
    }

    public static void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Adicionar centro de treinamento");
        System.out.println("2: Verificar disponibilidade");
        System.out.println("3: Ver número de dormitórios");
        System.out.println("4: Voltar ao menu");

        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                addCentre();
                break;

            case 2:
                checkAvailability();
                break;

            case 3:
                findDormitories();
                break;

            case 4:
                Recurso.selectResource();
        }
    }

    public static void addCentre()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do centro de treinamento:");
        String centrename =  input.nextLine();
        System.out.println("Número de dormitórios:");
        int dormitories = Menu.checkInt();
        input.nextLine();
        System.out.println("Disponível? (Sim ou Não)");
        String availability = input.nextLine();
        if (availability.equals("Sim"))
        {
            centre.add(new Centro_treinamento(centrename,dormitories,true));
        }
        else if (availability.equals("Não"))
        {
            centre.add(new Centro_treinamento(centrename,dormitories,false));
        }
    }

    public static void findDormitories()
    {
        Scanner input = new Scanner(System.in);

        if (centre.isEmpty())
        {
            System.out.println("Não há recursos disponíveis");
        }
        else
        {
            System.out.println("Centro a ser procurado:");
            String nome = input.nextLine();

            for (int i = 0; i < centre.size(); i++)
            {
                if (centre.get(i).getCentrename().equals(nome))
                {
                    System.out.println(centre.get(i).getDormitories());
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
        if (!centre.isEmpty())
        {
            for (Centro_treinamento list : centre)
            {
                if (list.availability)
                {
                    i++;
                }
            }
            System.out.print("Centros disponíveis:");
            System.out.println(i);
        }
        else
        {
            System.out.println("Não há recursos disponíveis");
        }
    }

}