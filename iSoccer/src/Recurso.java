import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Recurso {

    public static boolean var = false;
    public static void selectResource()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Transporte");
        System.out.println("2: Centro de treinamento");
        System.out.println("3: Estádio");
        System.out.println("4: Voltar");
        int choice = Menu.checkInt();
        while(!var) {
            switch (choice) {
                case 1:
                    Onibus.Menu();
                    break;

                case 2:
                    Centro_treinamento.Menu();
                    break;

                case 3:
                    Estadio.Menu();
                    break;

                case 4:
                    var = true;
                    break;
            }
        }
    }
}