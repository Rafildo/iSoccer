package Pessoas;

import java.util.ArrayList;

public class Pessoa {
    private ArrayList<Pessoa> person = new ArrayList<>();
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String type;

    public Pessoa(String name, String email, String cpf, String phone, String type)
    {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.type = type;
    }
    public void addPerson(Pessoa per)
    {
        person.add(per);
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
