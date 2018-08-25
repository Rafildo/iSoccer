package Menu_Visao;

import Controladores.Socio_Torcedor_Controlador;
import Pessoas.Socio_Torcedor;
import Utilitarios.Tratamento_erro;

import java.util.ArrayList;

public class Menu_Socio_Torcedor {
    private ArrayList<Socio_Torcedor> list = new ArrayList<>();
    Socio_Torcedor_Controlador cheerer = new Socio_Torcedor_Controlador();
    Socio_Torcedor che = new Socio_Torcedor(null,null,null,null,null,
            0.0,null,false);

    public void serviceChoice()
    {
        System.out.println("1: Adicionar sócio torcedor");
        System.out.println("2: Editar sócio torcedor");
        int choice = Tratamento_erro.checkInt();
        serviceCheck(choice);

    }

    public void serviceCheck(int choice)
    {
        switch (choice)
        {
            case 1:
                cheerer.addCheerer();
                break;

            case 2:
               // cheerer.editContributionValue();
                break;
        }

    }

}
