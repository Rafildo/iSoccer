import java.util.ArrayList;
import java.util.Scanner;

public class Socio_Torcedor {
    private ArrayList <Socio_Torcedor> cheerer = new ArrayList<>();
    private ArrayList<String> inTime = new ArrayList<>();
    private ArrayList<String> notInTime = new ArrayList<>();

    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String address;
    private Double contribution;
    private String type;
    private boolean status;

    public ArrayList<Socio_Torcedor> getCheerer() {
        return cheerer;
    }

    public ArrayList<String> getInTime() {
        return inTime;
    }

    public ArrayList<String> getNotInTime() {
        return notInTime;
    }

    public void addCheerer(Socio_Torcedor chee)
    {
        cheerer.add(chee);
    }

    public Socio_Torcedor(String name, String email, String cpf, String phone, String address, Double contribution,
                          String type, boolean status)
    {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
        this.contribution = contribution;
        this.type = type;
        this.status = status;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

    public  String getType() {
        return type;
    }

    public  void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public String isStatus() {
        if (status)
        {
            return "Adimplente";
        }
        else
        {
            return "Inadimplente";
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public String toString()
    {
        return("Nome: " + this.getName() + System.lineSeparator() +
                "Email: " + this.getEmail() + System.lineSeparator() +
                "CPF: " + this.getPhone() + System.lineSeparator() +
                "Endereço: " + this.getAddress() + System.lineSeparator() +
                "Contribuição: " + this.getContribution() + System.lineSeparator() +
                "Tipo: " + this.getType() + System.lineSeparator() +
                "Situação de pagamento: " + this.isStatus() + System.lineSeparator());
    }


}