import java.util.ArrayList;
import java.util.Scanner;

public class Onibus{
    public static ArrayList<Onibus> bus = new ArrayList<>();
    public String buscode;
    public boolean availability;

    public Onibus(String buscode, boolean availability)
    {
        this.buscode = buscode;
        this.availability = availability;
    }
    public static void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Adicionar transporte");
        System.out.println("2: Verificar transporte");
        System.out.println("3: Verificar disponibilidade");
        System.out.println("4: Voltar ao menu");
        int choice = Menu.checkInt();

            switch (choice) {
                case 1:
                    addBus();
                    break;

                case 2:
                    findBus();
                    break;

                case 3:
                    checkAvailability();
                    break;

                case 4:
                    Recurso.selectResource();
                    break;
            }
    }

    public static void addBus()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Codigo do onibus:");
        String buscode = input.nextLine();
        System.out.println("Disponível para uso? (Sim ou Não)");
        String availability = input.nextLine();
        if (availability.equals("Sim")) {
            bus.add(new Onibus(buscode,true));
        }
        else if (availability.equals("Não"))
        {
            bus.add(new Onibus(buscode,false));
        }
        else
        {
            while(true)
            {
                System.out.println("Por favor digite Sim ou Não!");
                availability = input.nextLine();
                if (availability.equals("Sim")) {
                    bus.add(new Onibus(buscode,true));
                }
                else if (availability.equals("Não"))
                {
                    bus.add(new Onibus(buscode,false));
                }
                break;
            }
        }
    }

    public static void findBus()
    {
        if (bus.isEmpty())
        {
            System.out.println("Não há recursos disponíveis");
        }
        else {
            for (Onibus list : bus) {
                    System.out.print("Ônibus : ");
                    System.out.println(list.buscode);
            }
        }
    }

    public static void checkAvailability()
    {
        int i = 0;
        if (!bus.isEmpty()) {
            for (Onibus list : bus) {
                if (list.availability) {
                    i++;
                }
            }
        }
        else
        {
            System.out.println("Não há recursos disponíveis");
        }
        System.out.print("Ônibus disponíveis:");
        System.out.println(i);
    }
}
