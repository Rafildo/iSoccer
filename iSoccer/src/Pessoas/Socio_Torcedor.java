package Pessoas;

import java.util.ArrayList;

public class Socio_Torcedor extends Pessoa {
    public static ArrayList<Socio_Torcedor> cheerer = new ArrayList<>();
    public static ArrayList<String> inTime = new ArrayList<>();
    public static ArrayList<String> notInTime = new ArrayList<>();
    private String address;
    private Double contribution;
    private String cheerertype;
    private boolean status;

    public ArrayList<String> getInTime() {
        return inTime;
    }

    public ArrayList<String> getNotInTime() {
        return notInTime;
    }


    public Socio_Torcedor(String name, String email, String cpf, String phone, String address, Double contribution,
                          String cheerertype, boolean status)
    {
        super(name,email,cpf,phone,cheerertype);
        this.address = address;
        this.contribution = contribution;
        this.cheerertype = cheerertype;
        this.status = status;;
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

    public  String getCheererType() {
        return cheerertype;
    }

    public  void setCheererType(String cheerertype) {
        this.cheerertype = cheerertype;
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
                "Tipo: " + this.getCheererType() + System.lineSeparator() +
                "Situação de pagamento: " + this.isStatus() + System.lineSeparator());
    }


}