package produkty;

import java.awt.*;
import java.util.Queue;

public abstract class ProdukGlowny {
    private String zdjecie_sciezka;
    private String tytul;
    private String opis;
    private String data_produkcji;
    private String czas_trwania;
    private Queue<String> kraje_produkcji;
    private double ocena_uzytkownika;
    private int statystyka_ogladalnosci;

    public ProdukGlowny() {
    }

    public int getStatystyka_ogladalnosci() {
        return statystyka_ogladalnosci;
    }

    public void setStatystyka_ogladalnosci(int statystyka_ogladalnosci) {
        this.statystyka_ogladalnosci = statystyka_ogladalnosci;
    }

    public String getZdjecie_sciezka() {
        return zdjecie_sciezka;
    }

    public void setZdjecie_sciezka(String zdjecie_sciezka) {
        this.zdjecie_sciezka = zdjecie_sciezka;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Queue<String> getKraje_produkcji() {
        return kraje_produkcji;
    }

    public void setKraje_produkcji(Queue<String> kraje_produkcji) {
        this.kraje_produkcji = kraje_produkcji;
    }

    public double getOcena_uzytkownika() {
        return ocena_uzytkownika;
    }

    public void setOcena_uzytkownika(double ocena_uzytkownika) {
        this.ocena_uzytkownika = ocena_uzytkownika;
    }

    public String getData_produkcji() {
        return data_produkcji;
    }

    public void setData_produkcji(String data_produkcji) {
        this.data_produkcji = data_produkcji;
    }

    public String getCzas_trwania() {
        return czas_trwania;
    }

    public void setCzas_trwania(String czas_trwania) {
        this.czas_trwania = czas_trwania;
    }

    public String toStringKraje(){
        String temp = "";
        for (String kraj : kraje_produkcji) {
            temp = temp + kraj + ", ";
        }
        temp = temp.substring(0, temp.length()-2);
        return temp;
    }
}
