package Controladores;

import Pessoas.Funcionarios.*;
import Utilitarios.Tratamento_erro;

import java.util.Scanner;

public class Funcionario_Controlador  {
   Funcionario employeeset = new Funcionario(null,null,null,null,null,0.0);

    public void setEmployeeType()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo de funcionário:");
        employeeset.setEmployeeType(input.nextLine());
        manageEmployeeType(employeeset.getEmployeeType());
    }

    public void manageEmployeeType(String employeeType)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        employeeset.setName(input.nextLine());
        System.out.println("Email:");
        employeeset.setEmail(input.nextLine());
        System.out.println("CPF:");
        employeeset.setCpf(input.nextLine());
        System.out.println("Salário:");
        employeeset.setSalary(Tratamento_erro.checkDouble());
        System.out.println("Telefone:");
        employeeset.setPhone(input.nextLine());
        switch(employeeType)
        {
            case "Médico":
                System.out.println("CRM:");
                String crm = input.nextLine();
                Funcionario.employee.add(new Medico(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary(),crm));
                break;

            case "Pessoas.Funcionarios.Motorista":
                System.out.println("Número de habilitação");
                String licensenumber = input.nextLine();
                Funcionario.employee.add(new Motorista(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary(),licensenumber));
                break;

            case "Pessoas.Funcionarios.Jogador":
                Jogador_Controlador player = new Jogador_Controlador();
                player.checkPosition(player.setPosition());
                player.availabilityCheck(input.nextLine());
                break;

            case "Pessoas.Funcionarios.Presidente":
                Funcionario.employee.add(new Presidente(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(), employeeset.getPhone(),employeeset.getSalary()));
                break;

            case "Preparador Físico":
                Funcionario.employee.add(new Preparador_Fisico(employeeset.getEmployeeType(),employeeset.getName(), employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary()));
                break;

            case "Pessoas.Funcionarios.Cozinheiro":
                Funcionario.employee.add(new Cozinheiro(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary()));
                break;

            case "Pessoas.Funcionarios.Advogado":
                Funcionario.employee.add(new Advogado(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),employeeset.getCpf(),
                        employeeset.getPhone(),employeeset.getSalary()));
                break;

            case "Pessoas.Funcionarios.Treinador":
                Funcionario.employee.add(new Treinador(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary()));
                break;
        }
    }
}
