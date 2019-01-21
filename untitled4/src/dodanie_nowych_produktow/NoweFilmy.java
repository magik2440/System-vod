package dodanie_nowych_produktow;

import produkty.Film;
import produkty.ProdukGlowny;

import java.net.URI;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class NoweFilmy {
    private List<ProdukGlowny> lista_filmow;

    public NoweFilmy(){
        dodajFilm();
    }

    public List<ProdukGlowny> getLista_filmow() {
        return lista_filmow;
    }

    public void setLista_filmow(List<ProdukGlowny> lista_filmow) {
        this.lista_filmow = lista_filmow;
    }

    private void dodajFilm() {
        final String html1 = "<html><body style='width: ";
        final String html2 = "px'>";
        String opis1;
        String opis2;
        Film film1, film2;

        Queue<String> kraje = new ArrayDeque<>();
        kraje.add("Polska");
        kraje.add("Rosja");
        Queue<String> aktorzy = new ArrayDeque<>();
        aktorzy.add("Daniel Olbrychski");
        aktorzy.add("Małgorzata Braunek");
        Queue<URI> zwiastuny = new ArrayDeque<>();
        zwiastuny.add(URI.create("https://www.filmweb.pl/video/zwiastun/nr+2-34418"));
        zwiastuny.add(URI.create("https://www.youtube.com/watch?v=vBfhvt1zrfU"));
        film1 = new Film();
        //wartosci produkt glowny
        film1.setTytul("Potop");
        opis1 = "Młody chorąży, Andrzej Kmicic, musi zdobyć się na wiele poświęceń, nie tylko w walce z wrogami ojczyzny, ale i w miłości.";
        film1.setOpis(ustawHTML(400,opis1));
        film1.setData_produkcji("1974");
        film1.setCzas_trwania("(4h 48min)");
        film1.setKraje_produkcji(kraje);
        film1.setLinki_zwiastunow(zwiastuny);
        film1.setOcena_uzytkownika(3.4);
        //wartosci filmu
        film1.setGatunek("Historyczny");
        film1.setZdjecie_sciezka("zdjecia/rsz_potop2.jpg");
        film1.setLista_aktorow(aktorzy);
        //film1.setLinki_zwiastunow(zwiastuny);
        film1.setCena(23.00);
        film1.setCzas_wielokrotnego_ogladania("2400 min");
        film1.setPromocja(0);
        film1.setStatystyka_ogladalnosci(130000);
        //--------------------------===-----------------
        Queue<String> kraje2 = new ArrayDeque<>();
        kraje2.add("USA");
        Queue<String> aktorzy2 = new ArrayDeque<>();
        aktorzy2.add("Shia LaBeouf");
        aktorzy2.add("Megan Fox");
        Queue<URI> zwiastuny2 = new ArrayDeque<>();
        zwiastuny2.add(URI.create("https://www.filmweb.pl/video/zwiastun/nr+1+polski-18470"));
        zwiastuny2.add(URI.create("https://www.filmweb.pl/video/zwiastun/nr+3-18993"));
        film2 = new Film();
        //wartosci produkt glowny
        film2.setTytul("Transformers");
        opis2 = "Wojna pomiędzy dwoma rasami robotów – Autobotami i Decepticonami przenosi się na Ziemię. W samym środku walki znajdzie się nastolatek Sam Witwicky.\nbot bor vto fdsf sadfsaf dafasf sdfasfd asfd sfda sddddddddddddddd";
        film2.setOpis(ustawHTML(400, opis2));
        film2.setData_produkcji("2007");
        film2.setCzas_trwania("(2h 24min)");
        film2.setKraje_produkcji(kraje2);
        film2.setLinki_zwiastunow(zwiastuny2);
        film2.setOcena_uzytkownika(7.2);
        //wartosci filmu
        film2.setZdjecie_sciezka("zdjecia/rsz_transf.jpg");
        film2.setGatunek("Akcja");
        film2.setLista_aktorow(aktorzy2);
        //  film2.setLinki_zwiastunow(zwiastuny2);
        film2.setCena(42.00);
        film2.setCzas_wielokrotnego_ogladania("1600 min");
        film2.setPromocja(0);
        film2.setStatystyka_ogladalnosci(45000000);
        this.setLista_filmow(Arrays.asList(film1, film2));
    }

    public String ustawHTML(int size, String tekst){
        final String html1 = "<html><body style='width: ";
        final String html2 = "px'>";
        return html1 + size + html2 + tekst;
    }
}
