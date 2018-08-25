package Pessoas.Funcionarios;

public class Motorista extends Funcionario{

    private String licensenumber;

    public Motorista(String employeeType,String name, String email, String cpf, String phone, Double salary,String licensenumber)
    {
        super(employeeType,name,email,cpf,phone,salary);
        this.licensenumber = licensenumber;
    }

    public String toString()
    {
        return ("Tipo: " + this.getEmployeeType()+ System.lineSeparator() +
                "Nome: " + this.getName() + System.lineSeparator() +
                "Email: " + this.getEmail()+ System.lineSeparator() +
                "CPF: " + this.getCpf()+ System.lineSeparator() +
                "Telefone: " + this.getPhone()+ System.lineSeparator() +
                "Salário: " + this.getSalary()+ System.lineSeparator() +
                "Número de habilitação: " + this.getLicensenumber()) + System.lineSeparator();
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

}