import java.util.Scanner;

public class Centro_Treinamento_Controlador {
    Centro_Treinamento centre =  new Centro_Treinamento(null,null,0,false);

    public void manageCentre()
    {
        System.out.println("Número de dormitórios:");
        centre.setDormitories(Tratamento_erro.checkInt());
    }

}
