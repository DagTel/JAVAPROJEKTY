package Kolekcje.DYSPOZYTORNIA;

public class Zgloszenie {

    private  TypZgloszenia typZgloszenia;
    private String trescZgloszenia;
    private double czasZgloszenia;

    public Zgloszenie(String trescZgloszenia, double czasZgloszenia, TypZgloszenia typZgloszenia) {
        this.trescZgloszenia = trescZgloszenia;
        this.czasZgloszenia = czasZgloszenia;
        this.typZgloszenia = typZgloszenia;
    }

    public void setTrescZgloszenia(String trescZgloszenia) {
        this.trescZgloszenia = trescZgloszenia;
    }

    public void setCzasZgloszenia(double czasZgloszenia) {
        this.czasZgloszenia = czasZgloszenia;
    }

    public String getTrescZgloszenia() {
        return trescZgloszenia;
    }

    public double getCzasZgloszenia() {
        return czasZgloszenia;
    }

    public TypZgloszenia getTypZgloszenia() {
        return typZgloszenia;
    }

    @Override
    public String toString() {
        return "Zgloszenie{" +
                "typZgloszenia=" + typZgloszenia +
                ", trescZgloszenia='" + trescZgloszenia + '\'' +
                ", czasZgloszenia=" + czasZgloszenia +
                '}';
    }
}
