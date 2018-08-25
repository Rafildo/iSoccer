package Controladores;

import java.util.Scanner;

public class Administrador_Controlador {

    public boolean adminCheck(String login, String password)
    {
        if (login.equals("Rafael") && password.equals("123"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void adminManage(boolean check)
    {
        if (check)
        {
            System.out.println("Logado com sucesso!");
        }
        else
        {
            Scanner input = new Scanner(System.in);
            while(!check)
            {
                System.out.println("Usuário ou senha inválidos");
                System.out.println("Usuário: ");
                String newuser = input.nextLine();
                System.out.println("Senha: ");
                String newpassword = input.nextLine();
                check = adminCheck(newuser,newpassword);
            }
            System.out.println("Logado com sucesso!");
        }
    }
}
