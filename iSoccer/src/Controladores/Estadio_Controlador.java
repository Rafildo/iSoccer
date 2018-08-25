package Controladores;

import Recursos.Estadio;
import Utilitarios.Tratamento_erro;

public class Estadio_Controlador {
    Estadio stadium = new Estadio(null,null,0,0,0,false);

    public void manageStadium()
    {
        System.out.println("Número de torcedores:");
        stadium.setCheerers(Tratamento_erro.checkInt());
        System.out.println("Número de lanchonetes:");
        stadium.setSnackbars(Tratamento_erro.checkInt());
        System.out.println("Número de banheiros:");
        stadium.setToilets(Tratamento_erro.checkInt());
    }
}
