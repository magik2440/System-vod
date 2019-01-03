package produkty;

import java.time.LocalTime;
import java.util.Set;

public class Film extends ProdukGlowny {
    private String gatunek;
    private Set<String> lista_aktorow;
    private Set<String> linki_zwiastunow;
    private double cena;
    private LocalTime czas_wielokrotnego_ogladania;
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

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Set<String> getLinki_zwiastunow() {
        return linki_zwiastunow;
    }

    public void setLinki_zwiastunow(Set<String> linki_zwiastunow) {
        this.linki_zwiastunow = linki_zwiastunow;
    }

    public LocalTime getCzas_wielokrotnego_ogladania() {
        return czas_wielokrotnego_ogladania;
    }

    public void setCzas_wielokrotnego_ogladania(LocalTime czas_wielokrotnego_ogladania) {
        this.czas_wielokrotnego_ogladania = czas_wielokrotnego_ogladania;
    }
}
