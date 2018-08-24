import java.util.*;

public class Menu {
    static String employeeType,name,email,cpf,phone;
    static Double salary;
    static Funcionarios employee = new Funcionarios(employeeType,name,email,cpf,phone,salary);
    static Socio_torcedor torcedor = new Socio_torcedor(null,null,null,null,null,
            0.0, null,false);
    static boolean isLogged = false;

    public static int checkInt()
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {
                return input.nextInt();
            }
            catch (InputMismatchException e)
            {
                input.next();
                System.out.println("Por favor digite um inteiro!");
            }
        }
    }
    public static void displayMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao iSoccer!");
        if (!isLogged) {
            System.out.println("Login: ");
            String login = input.nextLine();
            System.out.println("Senha: ");
            String password = input.nextLine();
            Administrador admin = new Administrador(login, password);
            if (login.equals(admin.getLogin()) && password.equals(admin.getPassword())) {
                isLogged = true;
                System.out.println("Administrador logado com sucesso!");
                }
            else
            {
                System.out.println("Usuário ou senha inválidos");
            }

        } else {
            System.out.println("1: Adicionar funcionário");
            System.out.println("2: Adicionar sócio-torcedor");
            System.out.println("3: Editar sócio-torcedor");
            System.out.println("4: Adicionar/Verificar recurso");
            System.out.println("5: Relatórios");

            int choice = checkInt();

            switch (choice) {
                case 1:
                    employee.setEmployeeType();
                    break;

                case 2:
                    torcedor.getCheerer();
                    break;


                case 3:
                    torcedor.editContributionValue();
                    break;

                    case 4:
                    Recurso.selectResource();
                    break;

                case 5:
                    Relatorios.Menu();
                    break;
            }
        }
    }
}

