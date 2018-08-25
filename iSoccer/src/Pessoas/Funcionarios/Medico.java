package Pessoas.Funcionarios;

public class Medico extends Funcionario {

    private String crm;

    public Medico(String employeeType,String name, String email, String cpf, String phone, Double salary,String crm)
    {
        super(employeeType,name,email,cpf,phone,salary);
        this.crm = crm;
    }

    public String toString()
    {
        return ("Tipo: " + this.getEmployeeType()+ System.lineSeparator() +
                "Nome: " + this.getName() + System.lineSeparator() +
                "Email: " + this.getEmail()+ System.lineSeparator() +
                "CPF: " + this.getCpf()+ System.lineSeparator() +
                "Telefone: " + this.getPhone()+ System.lineSeparator() +
                "Salário: " + this.getSalary()+ System.lineSeparator() +
                "CRM: " + this.getCrm()) + System.lineSeparator();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}