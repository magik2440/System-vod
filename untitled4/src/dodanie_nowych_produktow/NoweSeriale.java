package dodanie_nowych_produktow;

import produkty.Odcinek;
import produkty.ProdukGlowny;
import produkty.Serial;
import produkty.Sezon;

import java.util.*;

import static dodanie_nowych_produktow.NoweFilmy.ustawHTML;

public class NoweSeriale {
    private List<ProdukGlowny> lista_seriali;
    public NoweSeriale(){
        dodajSerial();
    }

    public List<ProdukGlowny> getLista_seriali() {
        return lista_seriali;
    }

    public void setLista_seriali(List<ProdukGlowny> lista_seriali) {
        this.lista_seriali = lista_seriali;
    }

    private void dodajSerial() {
        String opis1;
        String opis2;
        Serial serial1, serial2;

        // -----------------produkt Glowny---------------------
        serial1 = new Serial();
        serial1.setTytul("Gra o tron");
        serial1.setCzas_trwania("(58 min)");
        opis1 = "Adaptacja sagi George'a R.R. Martina. W królestwie Westeros walka o władzę, spiski oraz zbrodnie są na porządku dziennym.";
        serial1.setOpis(ustawHTML(400,opis1));
        serial1.setData_produkcji("2011 - 2019");
        serial1.setZdjecie_sciezka("zdjecia/gra_o_tron.jpg");
        serial1.setOcena_uzytkownika(8.9);
        serial1.setCena(15.00);
        serial1.setStatystyka_ogladalnosci(3000000);
        Queue<String> kraje = new ArrayDeque<>();
        kraje.add("USA");
        kraje.add("Wielka Brytania");
        serial1.setKraje_produkcji(kraje);
        // wartosci serialu
        serial1.setGatunek("Dramat");
        Queue<String> aktorzy1 = new ArrayDeque<>();
        aktorzy1.add("Lena Headey");
        aktorzy1.add("Peter Dinklage");
        serial1.setLista_aktorow(aktorzy1);
        // wartosc sezonu
        Sezon sezon = new Sezon();
        List<Odcinek> listaOdcinkow = new ArrayList<>();
        Odcinek odcinek = new Odcinek();
        odcinek.setNazwa("Winter Is Coming");
        odcinek.setDataPremiery("18.04.2011");
        listaOdcinkow.add(odcinek);
        odcinek = new Odcinek();
        odcinek.setNazwa("The Kingsroad");
        odcinek.setDataPremiery("25.04.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        Sezon sezon2 = new Sezon();
        listaOdcinkow = new ArrayList<>();
        odcinek = new Odcinek();
        odcinek.setNazwa("The North Remembers");
        odcinek.setDataPremiery("2.04.2012");
        listaOdcinkow.add(odcinek);
        odcinek = new Odcinek();
        odcinek.setNazwa("The Night Lands");
        odcinek.setDataPremiery("9.04.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);
        // dodanie sezonow
        List<Sezon> listaSezonow = new ArrayList<>();
        listaSezonow.add(sezon);
        listaSezonow.add(sezon2);
        serial1.setLista_sezonow(listaSezonow);

        // -----------------produkt Glowny---------------------
        serial2 = new Serial();
        serial2.setTytul("Przyjaciele");
        serial2.setCzas_trwania("(22 min)");
        opis2 = "Losy szóstki przyjaciół, którzy mieszkają i pracują w Nowym Jorku.";
        serial2.setOpis(ustawHTML(400,opis2));
        serial2.setData_produkcji("1994 - 2004");
        serial2.setZdjecie_sciezka("zdjecia/przyjaciele.jpg");
        serial2.setOcena_uzytkownika(8.2);
        serial2.setCena(5.00);
        serial2.setStatystyka_ogladalnosci(288000);
        kraje = new ArrayDeque<>();
        kraje.add("USA");
        serial2.setKraje_produkcji(kraje);
    // wartosci serialu
        serial2.setGatunek("Komedia");
        Queue<String> aktorzy2 = new ArrayDeque<>();
        aktorzy2.add("Jennifer Aniston");
        aktorzy2.add("Courteney Cox");
        serial2.setLista_aktorow(aktorzy2);
        // wartosc sezonu
        sezon = new Sezon();
        listaOdcinkow = new ArrayList<>();
        odcinek = new Odcinek();
        odcinek.setNazwa("Pilot");
        odcinek.setDataPremiery("22.09.1994");
        listaOdcinkow.add(odcinek);
        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Sonogram at the End");
        odcinek.setDataPremiery("29.09.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        sezon2 = new Sezon();
        listaOdcinkow = new ArrayList<>();
        odcinek = new Odcinek();
        odcinek.setNazwa("The One with Ross's New Girlfriend");
        odcinek.setDataPremiery("21.09.1995");
        listaOdcinkow.add(odcinek);
        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Breast Milk");
        odcinek.setDataPremiery("28.09.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);
        // dodanie sezonow
        listaSezonow = new ArrayList<>();
        listaSezonow.add(sezon);
        listaSezonow.add(sezon2);
        serial2.setLista_sezonow(listaSezonow);

        this.setLista_seriali(Arrays.asList(serial1, serial2));
    }
}

