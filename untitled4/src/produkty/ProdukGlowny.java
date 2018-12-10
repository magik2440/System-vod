package produkty;

import java.util.Date;

public abstract class ProdukGlowny {
    private String zdjecie;
    private String nazwa;
    private String opis;
    private Date data_produkcji;
    private Date czas_trwania;
    private String kraje_produkcji;
    private double ocena_uzytkownika;

    public ProdukGlowny() {
    }

    public String getZdjecie() {
        return zdjecie;
    }

    public void setZdjecie(String zdjecie) {
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

    public Date getData_produkcji() {
        return data_produkcji;
    }

    public void setData_produkcji(Date data_produkcji) {
        this.data_produkcji = data_produkcji;
    }

    public Date getCzas_trwania() {
        return czas_trwania;
    }

    public void setCzas_trwania(Date czas_trwania) {
        this.czas_trwania = czas_trwania;
    }

    public String getKraje_produkcji() {
        return kraje_produkcji;
    }

    public void setKraje_produkcji(String kraje_produkcji) {
        this.kraje_produkcji = kraje_produkcji;
    }

    public double getOcena_uzytkownika() {
        return ocena_uzytkownika;
    }

    public void setOcena_uzytkownika(double ocena_uzytkownika) {
        this.ocena_uzytkownika = ocena_uzytkownika;
    }
}
