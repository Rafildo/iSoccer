package Controladores;

import Pessoas.Funcionarios.Funcionario;
import Pessoas.Funcionarios.Jogador;

import java.util.Scanner;

public class Jogador_Controlador {

    Funcionario employeeset = new Funcionario(null, null, null, null, null, 0.0);
    private String position;

    public String setPosition() {
        Scanner input = new Scanner(System.in);
        displayPositionSelection();
        int option = input.nextInt();
        switch (option) {
            case 1:
                position = "Goleiro";
                break;

            case 2:
                position = "Zagueiro";
                break;

            case 3:
                position = "Lateral esquerdo";
                break;

            case 4:
                position = "Lateral direito";
                break;

            case 5:
                position = "Volante";
                break;

            case 6:
                position = "Meia";
                break;

            case 7:
                position = "Atacante";
                break;
            default:
                position = "Inválida";
        }
        return position;
    }

    public void displayPositionSelection() {
        System.out.println("Escolha uma das opções:");
        System.out.println("1: Goleiro");
        System.out.println("2: Zagueiro");
        System.out.println("3: Lateral esquerdo");
        System.out.println("4: Lateral direito");
        System.out.println("5: Volante");
        System.out.println("6: Meia");
        System.out.println("7: Atacante");
    }

    public String checkPosition(String position) {
        if (position != "Inválida") {
            return position;
        } else {
            while (position.equals("Inválida")) {
                System.out.println("Por favor escolha uma opção válida!");
                position = setPosition();
                if (!position.equals("Inválida")) {
                    break;
                }
            }
            return position;
        }

    }

    public void availabilityCheck(String availability) {
        Scanner input = new Scanner(System.in);
        System.out.println("Disponível(Sim ou Não):");
        if (availability.equals("Sim")) {
            Funcionario.employee.add(new Jogador(employeeset.getEmployeeType(), employeeset.getName(), employeeset.getEmail(),
                    employeeset.getCpf(), employeeset.getPhone(), employeeset.getSalary(),
                    position, true));
            Jogador.able.add(employeeset.getName());
        } else if (availability.equals("Não")) {
            Funcionario.employee.add(new Jogador(employeeset.getEmployeeType(), employeeset.getName(), employeeset.getEmail(),
                    employeeset.getCpf(), employeeset.getPhone(), employeeset.getSalary(),
                    position, false));
            Jogador.unable.add(employeeset.getName());
        } else {
            while (true) {
                System.out.println("Por favor digite Sim ou Não!");
                availability = input.nextLine();
                if (availability.equals("Sim") || (availability.equals("Não"))) {
                    if (availability.equals("Sim")) {
                        Funcionario.employee.add(new Jogador(employeeset.getEmployeeType(), employeeset.getName(), employeeset.getEmail(),
                                employeeset.getCpf(), employeeset.getPhone(), employeeset.getSalary(),
                                position, true));
                        Jogador.able.add(employeeset.getName());
                    } else if (availability.equals("Não")) {
                        Funcionario.employee.add(new Jogador(employeeset.getEmployeeType(), employeeset.getName(), employeeset.getEmail(),
                                employeeset.getCpf(), employeeset.getPhone(), employeeset.getSalary(),
                                position, false));
                        Jogador.unable.add(employeeset.getName());
                    }
                    break;
                }
            }
        }
    }
}
