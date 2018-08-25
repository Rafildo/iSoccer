package Pessoas.Funcionarios;

import Pessoas.Pessoa;

import java.util.ArrayList;


public class Funcionario extends Pessoa {
    public static ArrayList<Funcionario> employee = new ArrayList<>();
    private Double salary;
    private String employeeType;

    public ArrayList<Funcionario> getEmployee() {
        return employee;
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
        super(name,email,cpf,phone,employeeType);
        this.employeeType = employeeType;
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




