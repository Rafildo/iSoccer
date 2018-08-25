package Recursos;

import java.util.ArrayList;

public class Estadio extends Recurso {
    public ArrayList<Estadio> stadium = new ArrayList<>();
    private int cheerers;
    private int toilets;
    private int snackbars;

    public int getToilets() {
        return toilets;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    public int getCheerers() {
        return cheerers;
    }

    public void setCheerers(int cheerers) {

        this.cheerers = cheerers;
    }

    public int getSnackbars() {
        return snackbars;
    }

    public void setSnackbars(int snackbars) {

        this.snackbars = snackbars;
    }

    public Estadio(String type,String name, int cheerers, int snackbars, int toilets, boolean availability) {
        super(type , name, availability);
        this.toilets = toilets;
        this.cheerers = cheerers;
        this.snackbars = snackbars;
    }
    public String toString()
    {
        return("Nome do estádio: " + this.getName() + System.lineSeparator() +
                "Número de torcedores: " + this.getCheerers() + System.lineSeparator() +
                "Lanchonetes: " + this.getSnackbars() + System.lineSeparator() +
                "Banheiros: " + this.getToilets() + System.lineSeparator() +
                "Disponibilidade: " + this.isAvailable() + System.lineSeparator());
    }
}

