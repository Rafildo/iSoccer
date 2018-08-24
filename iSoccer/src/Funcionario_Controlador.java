import java.util.ArrayList;
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
                employeeset.addEmployee(new Medico(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary(),crm));
                break;

            case "Motorista":
                System.out.println("Número de habilitação");
                String licensenumber = input.nextLine();
                employeeset.addEmployee(new Motorista(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary(),licensenumber));
                break;

            case "Jogador":

                System.out.println("Posição do jogador:");
                String position = input.nextLine();
                System.out.println("Disponível(Sim ou Não):");
                String availability = input.nextLine();
                if (availability.equals("Sim")) {
                    employeeset.addEmployee(new Jogador(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                            employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary(),
                            position, true));
                    Jogador.able.add(employeeset.getName());
                }
                else if (availability.equals("Não")) {
                    employeeset.addEmployee(new Jogador(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                            employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary(),
                            position, false));
                    Jogador.unable.add(employeeset.getName());
                }
                else
                {
                    while(true)
                    {
                        System.out.println("Por favor digite Sim ou Não!");
                        availability = input.nextLine();
                        if (availability.equals("Sim") || (availability.equals("Não")))
                        {
                            if (availability.equals("Sim"))
                            {
                                employeeset.addEmployee(new Jogador(employeeset.getEmployeeType(),employeeset.getName(),
                                        employeeset.getEmail(),employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary(),
                                        position, true));
                                Jogador.able.add(employeeset.getName());
                            }
                            else if (availability.equals("Não"))
                            {
                                employeeset.addEmployee(new Jogador(employeeset.getEmployeeType(),employeeset.getName(),
                                        employeeset.getEmail(),employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary(),
                                        position, false));
                                Jogador.unable.add(employeeset.getName());
                            }
                            break;
                        }
                    }
                }
                break;

            case "Presidente":
                employeeset.addEmployee(new Presidente(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(), employeeset.getPhone(),employeeset.getSalary()));
                break;

            case "Preparador Físico":
                employeeset.addEmployee(new Preparador_Fisico(employeeset.getEmployeeType(),employeeset.getName(), employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary()));
                break;

            case "Cozinheiro":
                employeeset.addEmployee(new Cozinheiro(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary()));
                break;

            case "Advogado":
                employeeset.addEmployee(new Advogado(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),employeeset.getCpf(),
                        employeeset.getPhone(),employeeset.getSalary()));
                break;

            case "Treinador":
                employeeset.addEmployee(new Treinador(employeeset.getEmployeeType(),employeeset.getName(),employeeset.getEmail(),
                        employeeset.getCpf(),employeeset.getPhone(),employeeset.getSalary()));
                break;
        }
    }
}
