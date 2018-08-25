public class Principal {
    private static boolean var = false;

    public static void main(String [] args)
    {
        while(!var)
        {
            Menu_Geral menu = new Menu_Geral();
            menu.displayMenu();
        }
    }
}
