package Controladores;

import Pessoas.Socio_Torcedor;
import Utilitarios.Tratamento_erro;

import java.util.Scanner;

public class Socio_Torcedor_Controlador {
    Socio_Torcedor cheererset = new Socio_Torcedor(null,null,null,null,null,0.0,
            null,false);


    public void addCheerer()
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
            Socio_Torcedor.inTime.add(cheererset.getName());
        }
        else if(option == 0)
        {
            cheererset.setStatus(false);
            Socio_Torcedor.notInTime.add(cheererset.getName());
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
                        Socio_Torcedor.inTime.add(cheererset.getName());
                    }
                    else if (option == 0)
                    {
                        cheererset.setStatus(false);
                        Socio_Torcedor.notInTime.add(cheererset.getName());
                    }
                    break;
                }
            }
        }
        Socio_Torcedor.cheerer.add(new Socio_Torcedor(cheererset.getName(),cheererset.getEmail(),cheererset.getCpf(),
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
            cheererset.setCheererType("Júnior");
        }
        else if(contribution == 110)
        {
            cheererset.setCheererType("Sênior");
        }
        else if(contribution == 180)
        {
            cheererset.setCheererType("Elite");
        }
        return cheererset.getCheererType();
    }
    /*public void editContributionValue()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o sócio-torcedor:");
        String cheerername = input.nextLine();
        for (int i = 0; i < cheererset.getCheerer().size() ; i++)
        {
            System.out.println("oi");
            if (cheererset.getCheerer().get(i).getName().equals(cheerername))
            {
                System.out.println("Digite o novo valor da contribuição:");
                double contribution = checkContribution(Utilitarios.Tratamento_erro.checkDouble());
                cheererset.getCheerer().get(i).setContribution(contribution);
                cheererset.getCheerer().get(i).setCheererType(checkType(contribution));
                System.out.println("Digite a nova situação de pagamento (1 para adimplente ou 0 para inadimplente)");
                int statusint = Utilitarios.Tratamento_erro.checkInt();
                if (statusint == 1)
                {
                    cheererset.getCheerer().get(i).setStatus(true);
                }
                else if (statusint == 0)
                {
                    cheererset.getCheerer().get(i).setStatus(false);
                }
                else
                {
                    while(true)
                    {
                        System.out.println("Por favor digite 1 ou 0!");
                        statusint = Utilitarios.Tratamento_erro.checkInt();
                        if (statusint == 1)
                        {
                            cheererset.getCheerer().get(i).setStatus(true);
                            break;
                        }
                        else if ( statusint == 0)
                        {
                            cheererset.getCheerer().get(i).setStatus(false);
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
