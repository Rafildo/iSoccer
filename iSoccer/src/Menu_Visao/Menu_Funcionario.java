package Menu_Visao;

import Controladores.Funcionario_Controlador;
import Utilitarios.Tratamento_erro;

import java.util.Scanner;

public class Menu_Funcionario {

    public void serviceChoice()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Adicionar funcionário");
        System.out.println("2: Editar funcionário");
        int choice = Tratamento_erro.checkInt();
        serviceCheck(choice);
    }

    public void serviceCheck(int choice)
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
