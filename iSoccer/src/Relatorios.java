import java.util.Scanner;

public class Relatorios {

    public static void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Relatório do time");
        System.out.println("2: Lista de jogadores aptos");
        System.out.println("3: Lista de jogadores não aptos");
        System.out.println("4: Lista de funcionários");
        System.out.println("5: Lista de recursos");
        System.out.println("6: Lista de sócios-torcedores");

        int choice = Menu.checkInt();
        switch (choice)
        {
            case 1:
                teamReport();
                break;

            case 2:
                playerStatus(1);
                break;

            case 3:
                playerStatus(0);
                break;

            case 4:
                employeeReport();
                break;

            case 5:
                resourceReport();
                break;

            case 6:
                cheererReport();
                break;

        }

    }

    public static void teamReport()
    {
        Scanner input = new Scanner(System.in);
        if (!Funcionarios.employee.isEmpty()) {
            for (int i = 0; i < Funcionarios.employee.size(); i++) {
                if (Funcionarios.employee.get(i).getEmployeeType().equals("Treinador")) {
                    System.out.println(Funcionarios.employee);
                    break;
                } else {
                    System.out.println("Treinador não encontrado");
                    break;
                }
            }
            for (int i = 0; i < Funcionarios.employee.size(); i++) {
                if (Funcionarios.employee.get(i).getEmployeeType().equals("Jogador")) {
                    System.out.println(Funcionarios.employee);
                } else {
                    System.out.println("Não foram encontrados jogadores");
                    break;
                }
            }
        }
        else
        {
            System.out.println("Não há funcionários");
        }
    }

    public static void playerStatus(int i)
    {
        if (!Jogador.able.isEmpty()) {
            if (i == 1) {
                for (String list : Jogador.able) {
                    System.out.println(list);
                }
            }
        }
        if (Jogador.unable.isEmpty()) {
            if (i == 0) {
                for (String list : Jogador.unable) {
                    System.out.println(list);
                }
            }
        }
        else
        {
            System.out.println("Não há jogadores");
        }
    }

    public static void employeeReport()
    {
        Scanner input = new Scanner(System.in);
        if (!Funcionarios.employee.isEmpty()) {
            System.out.println("Tipo de funcionário a ser listado");
            String type = input.nextLine();

            switch (type) {
                case "Médico":
                    for (int i = 0; i < Funcionarios.employee.size(); i++) {
                        if (Funcionarios.employee.get(i).getEmployeeType().equals("Médico")) {
                            System.out.println(Funcionarios.employee);
                        } else {
                            System.out.println("Não foi encontrado médico");
                        }
                    }
                    break;

                case "Presidente":
                    for (int i = 0; i < Funcionarios.employee.size(); i++) {
                        if (Funcionarios.employee.get(i).getEmployeeType().equals("Presidente")) {
                            System.out.println(Funcionarios.employee);
                        } else {
                            System.out.println("Não foi encontrado presidente");
                        }
                    }
                    break;

                case "Preparador Físico":
                    for (int i = 0; i < Funcionarios.employee.size(); i++) {
                        if (Funcionarios.employee.get(i).getEmployeeType().equals("Preparador Físico")) {
                            System.out.println(Funcionarios.employee);
                        } else {
                            System.out.println("Não foram encontrados preparadores físicos");
                        }
                    }
                    break;

                case "Motorista":
                    for (int i = 0; i < Funcionarios.employee.size(); i++) {
                        if (Funcionarios.employee.get(i).getEmployeeType().equals("Motorista")) {
                            System.out.println(Funcionarios.employee);
                        } else {
                            System.out.println("Não foram encontrados motoristas");
                        }
                    }
                    break;

                case "Cozinheiro":
                    for (int i = 0; i < Funcionarios.employee.size(); i++) {
                        if (Funcionarios.employee.get(i).getEmployeeType().equals("Cozinheiro")) {
                            System.out.println(Funcionarios.employee);
                        } else {
                            System.out.println("Não foram encontrados cozinheiros");
                        }
                    }
                    break;

                case "Advogado":
                    for (int i = 0; i < Funcionarios.employee.size(); i++) {
                        if (Funcionarios.employee.get(i).getEmployeeType().equals("Advogado")) {
                            System.out.println(Funcionarios.employee);
                        } else {
                            System.out.println("Não foram encontrados advogados");
                        }
                    }
                    break;
            }
        }
        else
        {
            System.out.println("Não há funcionários");
        }
    }

    public static void resourceReport()
    {
        Scanner input =  new Scanner(System.in);
        System.out.println("Escolha o recurso: (Transporte , Centro de treinamento ou Estádio)");
        String resource = input.nextLine();
        switch(resource)
        {
            case "Transporte":
                if (!Onibus.bus.isEmpty()) {
                    for (Onibus list : Onibus.bus) {
                        System.out.print("Ônibus:");
                        System.out.println(list);
                    }
                }
                else
                {
                    System.out.println("Não foram encontrados transportes");
                }
                break;

            case "Centro de treinamento":
               if (!Centro_treinamento.centre.isEmpty())
               {
                   for (Centro_treinamento list : Centro_treinamento.centre)
                   {
                       if (list.availability)
                       {
                           System.out.println("Disponível");
                       }
                       else
                       {
                           System.out.println("Não disponível");
                       }
                   }
               }
               else
               {
                   System.out.println("Não foi encontrado centro de treinamento");
               }
               break;

            case "Estádio":
                if (!Estadio.stadium.isEmpty())
                {
                    for (Estadio list : Estadio.stadium)
                    {
                        if (list.availability)
                        {
                            System.out.println("Disponível");
                        }
                        else
                        {
                            System.out.println("Não disponível");
                        }
                    }
                }
                else
                {
                    System.out.println("Não foi encontrado estádio");
                }
        }

    }

    public static void cheererReport()
    {
        if (!Socio_torcedor.torcedor.isEmpty()) {
            System.out.println("Lista de sócios-torcedores adimplentes:");
            for (String list : Socio_torcedor.inTime) {
                System.out.println(list);
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lista de sócios-torcedores inadimplentes");
            for (String list : Socio_torcedor.notInTime) {
                System.out.println(list);
            }
            System.out.println();
            System.out.print("Quantidade:");
            System.out.println(Socio_torcedor.torcedor.size());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lista com dados individuais");
                for (Socio_torcedor list : Socio_torcedor.torcedor) {
                    System.out.println(list);
                }
            } else {
                System.out.println("Não foram encontrados sócios-torcedores");
            }
        }
    }

