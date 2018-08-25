package Utilitarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_erro {

    public static int checkInt() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Por favor digite um inteiro!");
            }
        }
    }
    public static double checkDouble()
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {
                return input.nextDouble();
            }
            catch (InputMismatchException e)
            {
                input.next();
                System.out.println("Por favor digite um double!");
            }
        }
    }
}