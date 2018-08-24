import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Socio_torcedor extends Menu {
    static ArrayList <Socio_torcedor> torcedor = new ArrayList<>();
    static ArrayList<String> inTime = new ArrayList<>();
    static ArrayList<String> notInTime = new ArrayList<>();

    public static String name;
    public static String email;
    public static String cpf;
    public static String phone;
    public static String address;
    public static Double contribution;
    public static String type;
    public static boolean status;

    public Socio_torcedor(String name, String email, String cpf, String phone, String address, Double contribution,
                          String type, boolean status)
    {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
        this.contribution = contribution;
        this.type = type;
        this.status = status;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Socio_torcedor.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Socio_torcedor.email = email;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        Socio_torcedor.cpf = cpf;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        Socio_torcedor.phone = phone;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Socio_torcedor.address = address;
    }

    public static Double getContribution() {
        return contribution;
    }

    public static void setContribution(Double contribution) {
        Socio_torcedor.contribution = contribution;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Socio_torcedor.type = type;
    }

    public static String isStatus() {
        if (status)
        {
            return "Adimplente";
        }
        else
        {
            return "Inadimplente";
        }
    }

    public static void setStatus(boolean status) {
        Socio_torcedor.status = status;
    }

    public void getCheerer()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        String name = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("CPF:");
        String cpf = input.nextLine();
        System.out.println("Telefone:");
        String phone = input.nextLine();
        System.out.println("Endereço:");
        String address = input.nextLine();
        System.out.println("Valor da contribuição:");
        Double contribution = checkContribution();
        input.nextLine();
        System.out.println("Status do pagamento: (1 para adimplente ou 0 para inadimplente)");
        int option = checkInt();
        if (option == 1)
        {
            status = true;
            inTime.add(name);
        }
        else if(option == 0)
        {
            status = false;
            notInTime.add(name);
        }
        else
        {
           while(true)
           {
               System.out.println("Por favor digite 0 ou 1");
               option = checkInt();

               if (option == 1 || (option == 0))
               {
                   if (option == 1)
                   {
                       status = true;
                       inTime.add(name);
                   }
                   else if (option == 0)
                   {
                      status = false;
                      notInTime.add(name);
                   }
                   break;
               }
           }
        }
       torcedor.add(new Socio_torcedor(name,email,cpf,phone,address,contribution,checkType(contribution),status));
    }

    public Double checkContribution()
    {
        if (contribution != 50 && contribution != 110 && contribution != 180)
        {
            while(true)
            {
                System.out.println("Por favor escolha 50,110 ou 180");
                contribution = Funcionarios.checkDouble();
                if (contribution == 50 || contribution == 110 || contribution == 180)
                {
                    return contribution;
                }
            }
        }
        else
        {
            return contribution;
        }
    }

    public String checkType(Double contribution)
    {
        if (contribution == 50)
        {
            type = "Júnior";
        }
        else if(contribution == 110)
        {
            type = "Sênior";
        }
        else if(contribution == 180)
        {
            type = "Elite";
        }
        else
        {
            while(true)
            {
                System.out.println("Por favor escolha 50,110 ou 180");
                setContribution(Funcionarios.checkDouble());
                if (getContribution()== 50)
                {
                    type = "Júnior";
                }
                else if(getContribution() == 110)
                {
                    type = "Sênior";
                }
                else if(getContribution() == 180)
                {
                    type = "Elite";
                }
                break;

            }
        }
        return type;
    }

    public String toString()
    {
        return("Nome: " + this.getName() + System.lineSeparator() +
        "Email: " + this.getEmail() + System.lineSeparator() +
        "CPF: " + this.getPhone() + System.lineSeparator() +
        "Endereço: " + this.getAddress() + System.lineSeparator() +
        "Contribuição: " + this.getContribution() + System.lineSeparator() +
        "Tipo: " + this.getType() + System.lineSeparator() +
        "Situação de pagamento: " + this.isStatus() + System.lineSeparator());
    }

    public void editContributionValue()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o sócio-torcedor");
        String cheerer = input.nextLine();
        for (int i = 0; i < torcedor.size() ; i++)
        {
            if (torcedor.get(i).getName().equals(cheerer))
            {
                System.out.println("Digite o novo valor da contribuição");
                contribution = input.nextDouble();
                System.out.println("Digite a nova situação de pagamento (1 para adimplente ou 0 para inadimplente)");
                int statusint = Menu.checkInt();
                if (statusint == 1)
                {
                    status = true;
                }
                else if (statusint == 0)
                {
                    status = false;
                }
                else
                {
                    while(true)
                    {
                        System.out.println("Por favor digite 1 ou 0!");
                        statusint = Menu.checkInt();
                        if (statusint == 1)
                        {
                            status = true;
                            break;
                        }
                        else if ( statusint == 0)
                        {
                            status = false;
                            break;
                        }
                    }
                }

            }
            else
            {
                System.out.println("Sócio-torcedor não encontrado");
            }
        }
    }
}
