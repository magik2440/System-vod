package produkty;

import java.util.Set;

public class Film extends ProdukGlowny {
    private String gatunek;
    private Set<String> lista_aktorow;
    private String inki_zwiastunow;
    private double cena;
    private double czas_ogladania;
    private int promocja;

    public Film() {
    }

    public int getPromocja() {
        return promocja;
    }

    public void setPromocja(int promocja) {
        this.promocja = promocja;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Set<String> getLista_aktorow() {
        return lista_aktorow;
    }

    public void setLista_aktorow(Set<String> lista_aktorow) {
        this.lista_aktorow = lista_aktorow;
    }

    public String getInki_zwiastunow() {
        return inki_zwiastunow;
    }

    public void setInki_zwiastunow(String inki_zwiastunow) {
        this.inki_zwiastunow = inki_zwiastunow;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getCzas_ogladania() {
        return czas_ogladania;
    }

    public void setCzas_ogladania(double czas_ogladania) {
        this.czas_ogladania = czas_ogladania;
    }
}
