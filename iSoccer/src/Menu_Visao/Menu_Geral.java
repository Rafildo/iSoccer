package Menu_Visao;

import java.util.Scanner;

public class Menu_Geral {

    private static boolean isLogged = false;
    public void displayMenu()
    {
        if (!isLogged) {
            Administrador_Visao adminview = new Administrador_Visao();
            adminview.userInput();
            isLogged = true;
        }
        else
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Categorias:");
            System.out.println("1: Funcionário");
            System.out.println("2: Sócio-torcedor");
            System.out.println("3: Recurso");
            System.out.println("4: Relatório");

            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    Menu_Funcionario employeemenu = new Menu_Funcionario();
                    employeemenu.serviceChoice();
                    break;

                case 2:
                    Menu_Socio_Torcedor cheerermenu = new Menu_Socio_Torcedor();
                    cheerermenu.serviceChoice();
                    break;

                case 3:
                    Menu_Recurso resourcemenu = new Menu_Recurso();
                    resourcemenu.serviceChoice();
                    break;

                case 4:
                    Relatorios relatoriosmenu = new Relatorios();
                    relatoriosmenu.Menu();
                    break;
            }
        }
    }
}
