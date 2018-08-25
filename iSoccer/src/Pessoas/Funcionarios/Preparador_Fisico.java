package Pessoas.Funcionarios;

public class Preparador_Fisico extends Funcionario {

    public Preparador_Fisico(String employeeType,String name, String email, String cpf, String phone, Double salary)
    {
        super(employeeType,name,email,cpf,phone,salary);
    }

    public String toString()
    {
        return ("Tipo: " + this.getEmployeeType()+ System.lineSeparator() +
                "Nome: " + this.getName() + System.lineSeparator() +
                "Email: " + this.getEmail()+ System.lineSeparator() +
                "CPF: " + this.getCpf()+ System.lineSeparator() +
                "Telefone: " + this.getPhone()+ System.lineSeparator() +
                "Salário: " + this.getSalary()+ System.lineSeparator());
    }
}
