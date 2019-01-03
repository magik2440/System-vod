package produkty;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public abstract class ProdukGlowny {
    private Image zdjecie;
    private String nazwa;
    private String opis;
    private LocalDate data_produkcji;
    private LocalTime czas_trwania;
    private Set<String> kraje_produkcji;
    private double ocena_uzytkownika;

    public ProdukGlowny() {
    }

    public Image getZdjecie() {
        return zdjecie;
    }

    public void setZdjecie(Image zdjecie) {
        this.zdjecie = zdjecie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Set<String> getKraje_produkcji() {
        return kraje_produkcji;
    }

    public void setKraje_produkcji(Set<String> kraje_produkcji) {
        this.kraje_produkcji = kraje_produkcji;
    }

    public double getOcena_uzytkownika() {
        return ocena_uzytkownika;
    }

    public void setOcena_uzytkownika(double ocena_uzytkownika) {
        this.ocena_uzytkownika = ocena_uzytkownika;
    }

    public LocalDate getData_produkcji() {
        return data_produkcji;
    }

    public void setData_produkcji(LocalDate data_produkcji) {
        this.data_produkcji = data_produkcji;
    }

    public LocalTime getCzas_trwania() {
        return czas_trwania;
    }

    public void setCzas_trwania(LocalTime czas_trwania) {
        this.czas_trwania = czas_trwania;
    }
}
