package Menu_Visao;

import Controladores.Recurso_Controlador;
import Utilitarios.Tratamento_erro;

public class Menu_Recurso {
    public void serviceChoice(){
        System.out.println("1: Adicionar recurso");
        System.out.println("2: Editar recurso");
        int choice = Tratamento_erro.checkInt();
        serviceCheck(choice);

    }

    public void serviceCheck(int choice)
    {
        switch (choice)
        {
            case 1:
                Recurso_Controlador resource = new Recurso_Controlador();
                resource.selectResource();
                break;

            case 2:
                break;
        }
    }

}
