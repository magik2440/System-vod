package produkty;

import java.util.Date;

public class LiveStream extends ProdukGlowny {
    private Date data_wyswietlenia;
    private double jednorazowa_cena;
    private int promocja;

    public LiveStream() {
    }

    public Date getData_wyswietlenia() {
        return data_wyswietlenia;
    }

    public void setData_wyswietlenia(Date data_wyswietlenia) {
        this.data_wyswietlenia = data_wyswietlenia;
    }

    public double getJednorazowa_cena() {
        return jednorazowa_cena;
    }

    public void setJednorazowa_cena(double jednorazowa_cena) {
        this.jednorazowa_cena = jednorazowa_cena;
    }

    public int getPromocja() {
        return promocja;
    }

    public void setPromocja(int promocja) {
        this.promocja = promocja;
    }
}
