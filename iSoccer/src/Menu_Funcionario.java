import java.util.Scanner;

public class Menu_Funcionario {

    public void Service_choice()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Adicionar funcionário");
        System.out.println("2: Editar funcionário");
        int choice = input.nextInt();
        Service_check(choice);
    }

    public void Service_check(int choice)
    {
        switch (choice)
        {
            case 1:
                Funcionario_Controlador employee = new Funcionario_Controlador();
                employee.setEmployeeType();
                break;

            case 2:
                break;
        }
    }
}
