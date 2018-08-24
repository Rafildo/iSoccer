import java.util.ArrayList;
import java.util.Scanner;


public class Funcionario {
    private ArrayList<Funcionario> employee = new ArrayList<>();
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private Double salary;
    private String employeeType;

    public ArrayList<Funcionario> getEmployee() {
        return employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void addEmployee(Funcionario emp)
    {
        employee.add(emp);
    }

    public Funcionario(String employeeType,String name, String email, String cpf,String phone, Double salary)
    {
        this.employeeType = employeeType;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.salary = salary;
    }

    public String toString()
    {
        String values ="";
        for (Funcionario list : employee)
        {
            values += list.toString() + " ";
            values += "\n";
        }
        return values;
    }
}




