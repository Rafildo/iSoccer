import java.util.ArrayList;
import java.util.Scanner;

public class Socio_Torcedor_Controlador {
    private ArrayList<Socio_Torcedor> cheerer = new ArrayList<>();
    Socio_Torcedor cheererset = new Socio_Torcedor(null,null,null,null,null,0.0,
            null,false);
    private ArrayList<String> ingoodstanding = new ArrayList<>();
    private ArrayList<String> notingoodstanding = new ArrayList<>();
    public void getCheerer()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        cheererset.setName(input.nextLine());
        System.out.println("Email:");
        cheererset.setEmail(input.nextLine());
        System.out.println("CPF:");
        cheererset.setCpf(input.nextLine());
        System.out.println("Telefone:");
        cheererset.setPhone(input.nextLine());
        System.out.println("Endereço:");
        cheererset.setAddress(input.nextLine());
        System.out.println("Valor da contribuição:");
        cheererset.setContribution(checkContribution(Tratamento_erro.checkDouble()));
        System.out.println("Status do pagamento: (1 para adimplente ou 0 para inadimplente)");
        int option = Tratamento_erro.checkInt();
        if (option == 1)
        {
            cheererset.setStatus(true);
            ingoodstanding.add(cheererset.getName());
        }
        else if(option == 0)
        {
            cheererset.setStatus(false);
            notingoodstanding.add(cheererset.getName());
        }
        else
        {
            while(true)
            {
                System.out.println("Por favor digite 0 ou 1");
                option = Tratamento_erro.checkInt();

                if (option == 1 || (option == 0))
                {
                    if (option == 1)
                    {
                        cheererset.setStatus(true);
                        ingoodstanding.add(cheererset.getName());
                    }
                    else if (option == 0)
                    {
                        cheererset.setStatus(false);
                        ingoodstanding.add(cheererset.getName());
                    }
                    break;
                }
            }
        }
        cheererset.addCheerer(new Socio_Torcedor(cheererset.getName(),cheererset.getEmail(),cheererset.getCpf(),
                cheererset.getPhone(), cheererset.getAddress(),cheererset.getContribution(),
                checkType(cheererset.getContribution()),cheererset.getStatus()));
    }

    public Double checkContribution(Double contribution)
    {
        if (contribution != 50 && contribution != 110 && contribution != 180)
        {
            while(true)
            {
                System.out.println("Por favor escolha 50,110 ou 180");
                contribution = Tratamento_erro.checkDouble();
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
            cheererset.setType("Júnior");
        }
        else if(contribution == 110)
        {
            cheererset.setType("Sênior");
        }
        else if(contribution == 180)
        {
            cheererset.setType("Elite");
        }
        return cheererset.getType();
    }
   /* public void editContributionValue()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o sócio-torcedor");
        String cheerer = input.nextLine();
        for (int i = 0; i < torcedor.size() ; i++)
        {
            if (torcedor.get(i).getName().equals(cheerer))
            {
                System.out.println("Digite o novo valor da contribuição");
                contribution = Tratamento_erro.checkDouble();
                System.out.println("Digite a nova situação de pagamento (1 para adimplente ou 0 para inadimplente)");
                int statusint = Tratamento_erro.checkInt();
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
                        statusint = Tratamento_erro.checkInt();
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
    }*/
}
