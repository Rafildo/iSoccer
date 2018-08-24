import java.util.Scanner;

public class Recurso_Controlador {

    Recurso resource = new Recurso(null,null,false);
    Centro_Treinamento centre = new Centro_Treinamento(null,null,0,false);
    Estadio stadium = new Estadio(null,null,0,0,0,false);
    Onibus bus = new Onibus(null,null,false);

    public void selectResource()
    {
        System.out.println("1: Transporte");
        System.out.println("2: Centro de treinamento");
        System.out.println("3: Estádio");
        System.out.println("4: Voltar");
        int choice = Tratamento_erro.checkInt();
        switch (choice) {
            case 1:
                getResourceCommonData();
                resource.addResource(new Onibus("Ônibus",resource.getName(),resource.isAvailability()));
                break;

            case 2:
                getResourceCommonData();
                Centro_Treinamento_Controlador centrecontroller = new Centro_Treinamento_Controlador();
                centrecontroller.manageCentre();
                resource.addResource(new Centro_Treinamento("Centro de treinamento",resource.getName(),
                        centre.getDormitories(),resource.isAvailability()));
                break;

            case 3:
                getResourceCommonData();
                Estadio_Controlador stadiumcontroller = new Estadio_Controlador();
                stadiumcontroller.manageStadium();
                resource.addResource(new Estadio("Estádio",resource.getName(),stadium.getCheerers(),
                        stadium.getSnackbars(),stadium.getSnackbars(),resource.isAvailability()));
                break;
        }
    }

    public void getResourceCommonData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome/Código do recurso:");
        resource.setName(input.nextLine());
        System.out.println("Disponível (Sim ou Não):");
        String available = input.nextLine();
        if (available.equals("Sim"))
        {
            resource.setAvailability(true);
        }
        else if (available.equals("Não"))
        {
            resource.setAvailability(false);
        }
    }
}
