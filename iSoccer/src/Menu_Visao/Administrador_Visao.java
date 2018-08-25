package Menu_Visao;

import Controladores.Administrador_Controlador;
import Pessoas.Administrador;

import java.util.Scanner;

public class Administrador_Visao {

    public void userInput()
    {
        Administrador admin = new Administrador(null,null);
        Administrador_Controlador admincontroller = new Administrador_Controlador();
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao iSoccer!");
        System.out.println("Login: ");
        admin.setLogin(input.nextLine());
        System.out.println("Senha: ");
        admin.setPassword(input.nextLine());
        admincontroller.adminManage(admincontroller.adminCheck(admin.getLogin(),admin.getPassword()));
    }
}
