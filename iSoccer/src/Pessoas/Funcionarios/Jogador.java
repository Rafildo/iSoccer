package Pessoas.Funcionarios;

import java.util.ArrayList;

public class Jogador extends Funcionario {

    private String position;
    private boolean available;
    public static ArrayList<String> able = new ArrayList<>();
    public static ArrayList<String> unable = new ArrayList<>();

    public Jogador(String employeeType,String name, String email, String cpf, String phone, Double salary,
                   String position,boolean available)
    {
        super(employeeType,name,email,cpf,phone,salary);
        this.position = position;
        this.available = available;
    }


    public String toString()
    {
        return ("Tipo: " + this.getEmployeeType()+ System.lineSeparator() +
                "Nome: " + this.getName() + System.lineSeparator() +
                "Email: " + this.getEmail()+ System.lineSeparator() +
                "CPF: " + this.getCpf()+ System.lineSeparator() +
                "Telefone: " + this.getPhone()+ System.lineSeparator() +
                "Salário: " + this.getSalary()+ System.lineSeparator() +
                "Posição: " + this.getPosition()) + System.lineSeparator() +
                "Disponibilidade: " + this.isAvailable() + System.lineSeparator();
    }


    public String getPosition() {
        return position;
    }

    public String isAvailable() {
        if (isAvailability()) {
            return "Disponível";
        } else {
            return "Não disponível";
        }
    }

    public boolean isAvailability() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}