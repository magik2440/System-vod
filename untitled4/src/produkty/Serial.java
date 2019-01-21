package produkty;

import java.util.Queue;
import java.util.Set;

public class Serial extends ProdukGlowny{
    private String gatunek;
    private Queue<String> lista_aktorow;
    private int sezony;
    private int odcinki;
    public Serial() {
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Queue<String> getLista_aktorow() {
        return lista_aktorow;
    }

    public void setLista_aktorow(Queue<String> lista_aktorow) {
        this.lista_aktorow = lista_aktorow;
    }

    public int getSezony() {
        return sezony;
    }

    public void setSezony(int sezony) {
        this.sezony = sezony;
    }

    public int getOdcinki() {
        return odcinki;
    }

    public void setOdcinki(int odcinki) {
        this.odcinki = odcinki;
    }
}
