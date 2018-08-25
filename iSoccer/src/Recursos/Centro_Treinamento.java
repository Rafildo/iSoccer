package Recursos;

import java.util.ArrayList;

public class Centro_Treinamento extends Recurso {

    private int dormitories;

    public Centro_Treinamento(String type,String name,int dormitories,boolean availability)
    {
        super(type,name,availability);
        this.dormitories = dormitories;
    }

    public int getDormitories() {
        return dormitories;
    }

    public void setDormitories(int dormitories) {

        this.dormitories = dormitories;
    }

    public String toString()
    {
        return("Nome do centro: " + this.getName() + System.lineSeparator() +
                "Número de dormitórios: " + this.getDormitories() + System.lineSeparator() +
                "Disponibilidade: " + this.isAvailable());
    }

}