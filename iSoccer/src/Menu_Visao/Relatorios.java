package Menu_Visao;

import Pessoas.Funcionarios.Funcionario;
import Pessoas.Funcionarios.Jogador;
import Pessoas.Socio_Torcedor;
import Recursos.Recurso;
import Utilitarios.Tratamento_erro;

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

        int choice = Tratamento_erro.checkInt();
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
        if (!Funcionario.employee.isEmpty()) {
            for (int i = 0; i < Funcionario.employee.size(); i++) {
                if (Funcionario.employee.get(i).getEmployeeType().equals("Pessoas.Funcionarios.Treinador")) {
                    System.out.println(Funcionario.employee);
                    break;
                } else {
                    System.out.println("Pessoas.Funcionarios.Treinador não encontrado");
                    break;
                }
            }
            for (int i = 0; i < Funcionario.employee.size(); i++) {
                if (Funcionario.employee.get(i).getEmployeeType().equals("Pessoas.Funcionarios.Jogador")) {
                    System.out.println(Funcionario.employee);
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
        if (!Funcionario.employee.isEmpty()) {
            System.out.println("Tipo de funcionário a ser listado");
            String type = input.nextLine();

            switch (type) {
                case "Médico":
                    for (int i = 0; i < Funcionario.employee.size(); i++) {
                        if (Funcionario.employee.get(i).getEmployeeType().equals("Médico")) {
                            System.out.println(Funcionario.employee);
                        } else {
                            System.out.println("Não foi encontrado médico");
                        }
                    }
                    break;

                case "Pessoas.Funcionarios.Presidente":
                    for (int i = 0; i < Funcionario.employee.size(); i++) {
                        if (Funcionario.employee.get(i).getEmployeeType().equals("Pessoas.Funcionarios.Presidente")) {
                            System.out.println(Funcionario.employee);
                        } else {
                            System.out.println("Não foi encontrado presidente");
                        }
                    }
                    break;

                case "Preparador Físico":
                    for (int i = 0; i < Funcionario.employee.size(); i++) {
                        if (Funcionario.employee.get(i).getEmployeeType().equals("Preparador Físico")) {
                            System.out.println(Funcionario.employee);
                        } else {
                            System.out.println("Não foram encontrados preparadores físicos");
                        }
                    }
                    break;

                case "Pessoas.Funcionarios.Motorista":
                    for (int i = 0; i < Funcionario.employee.size(); i++) {
                        if (Funcionario.employee.get(i).getEmployeeType().equals("Pessoas.Funcionarios.Motorista")) {
                            System.out.println(Funcionario.employee);
                        } else {
                            System.out.println("Não foram encontrados motoristas");
                        }
                    }
                    break;

                case "Pessoas.Funcionarios.Cozinheiro":
                    for (int i = 0; i < Funcionario.employee.size(); i++) {
                        if (Funcionario.employee.get(i).getEmployeeType().equals("Pessoas.Funcionarios.Cozinheiro")) {
                            System.out.println(Funcionario.employee);
                        } else {
                            System.out.println("Não foram encontrados cozinheiros");
                        }
                    }
                    break;

                case "Pessoas.Funcionarios.Advogado":
                    for (int i = 0; i < Funcionario.employee.size(); i++) {
                        if (Funcionario.employee.get(i).getEmployeeType().equals("Pessoas.Funcionarios.Advogado")) {
                            System.out.println(Funcionario.employee);
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
                if (Recurso.resources.isEmpty()) {
                    for (int i = 0 ; i < Recurso.resources.size() ; i++) {
                        if (Recurso.resources.get(i).getType().equals("Ônibus"))
                        {
                            System.out.print("Ônibus:");
                            System.out.println(Recurso.resources.get(i));
                        }
                        else
                        {
                            System.out.println("Não foram encontrados transportes");
                        }
                    }
                }

                break;

            case "Centro de treinamento":
                if (Recurso.resources.isEmpty()) {
                    for (int i = 0; i < Recurso.resources.size() ; i++) {
                        if (Recurso.resources.get(i).getType().equals("Centro de treinamento")) {
                            if (Recurso.resources.get(i).isAvailability()) {
                                System.out.println("Disponível");
                            } else {
                                System.out.println("Não disponível");
                            }
                        }
                    }
               }
               else
               {
                   System.out.println("Não foi encontrado centro de treinamento");
               }
               break;

            case "Estádio":
                if (Recurso.resources.isEmpty()) {
                    for (int i = 0; i < Recurso.resources.size(); i++) {
                        if (Recurso.resources.get(i).getType().equals("Estádio")) {
                            if (Recurso.resources.get(i).isAvailability()) {
                                System.out.println("Disponível");
                            } else {
                                System.out.println("Não disponível");
                            }
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
        if (!Socio_Torcedor.cheerer.isEmpty()) {
            System.out.println("Lista de sócios-torcedores adimplentes:");
            for (String list : Socio_Torcedor.inTime) {
                System.out.println(list);
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lista de sócios-torcedores inadimplentes");
            for (String list : Socio_Torcedor.notInTime) {
                System.out.println(list);
            }
            System.out.println();
            System.out.print("Quantidade:");
            System.out.println(Socio_Torcedor.cheerer.size());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lista com dados individuais");
                for (Socio_Torcedor list : Socio_Torcedor.cheerer) {
                    System.out.println(list);
                }
            } else {
                System.out.println("Não foram encontrados sócios-torcedores");
            }
        }
    }

