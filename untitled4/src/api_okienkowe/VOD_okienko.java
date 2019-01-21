package api_okienkowe;

import dodanie_nowych_produktow.NoweFilmy;
import produkty.Film;
import produkty.ProdukGlowny;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.List;

public class VOD_okienko {
    public JPanel panel1;
    private JButton okButton;
    private JButton nowyButton;
    private JPasswordField PasswordField_oknoLoginu_haslo;
    private JTextField TextField_oknoLoginu_login;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JButton newButton;
    private JButton cancelButton;
    private JPasswordField passwordField2;
    private JPanel panel_loginu;
    private JPanel panel_rejestracji;
    private JPanel JPanel_pojedynczyFilm;
    private JPanel JPanel_menu;
    private JPanel JPanel_gosc_film;
    private JLabel Label_a_f_tytul;
    private JLabel Label_a_f_czasTrwania;
    private JLabel Label_a_f_opis;
    private JLabel Label_a_f_cena;
    private JPanel JPanel_a_f_hyperlinki;
    private JLabel Label_a_f_zdjecie;
    private JPanel JPanel_wyborFilmu;
    private JButton button_a_w_przod;
    private JButton button_a_w_wstecz;
    private JLabel Label_a_w_zdj1;
    private JLabel Label_a_w_zdj2;
    private JLabel Label_a_w_zdj3;
    private JLabel Label_a_w_tytul1;
    private JLabel Label_a_w_tytul2;
    private JLabel Label_a_w_tytul3;
    private JTextField wyszukajProduktTextField;
    private JButton filmyButton;
    private JButton serialeButton;
    private JButton liveButton;
    private JLabel Label_m_login;
    private JPanel JP_menu_dolny1;
    private JPanel JPanel_menu_gorny;
    private JPanel JPanel_menu_dolny;
    private JButton dodajButton;
    private JButton edytujButton;
    private JButton usunButton;
    private JPanel JP_menu_dolny_admin;
    private JPanel JP_menu_dolny_tabela;
    private JTable tabela_produktow;
    private JLabel Label_a_f_gatunek1;
    private JLabel Label_a_f_dataProdukcji1;
    private JLabel Label_a_f_krajeProdukcji1;
    private JLabel Label_a_f_listaAktorow1;
    private JLabel Label_a_f_cena1;
    private JLabel Label_a_f_czasWielokrotnegoObejrzenia1;
    private JLabel Label_a_f_promocja1;
    private JLabel Label_a_f_ocenaUzytkownika1;
    private JPanel JPanel_admin_film1;
    private JLabel loginLabel;
    private JLabel hasloLabel;
    private JLabel JLabel_linki;
    private JPanel JPanel_a_f_linki;
    private JScrollPane JScrollPane_tabela_produktow;
    private List<ProdukGlowny> produktArrayList;/* = new ArrayList<>();*/
   // private List<Serial> serialArrayList;
//    private List<LiveStream> liveStreamsArrayList;

    public VOD_okienko() {
       // JPanel_menu.setLayout(new BoxLayout(JPanel_menu, BoxLayout.Y_AXIS));
        JP_menu_dolny_tabela.setLayout(new BoxLayout(JP_menu_dolny_tabela, BoxLayout.Y_AXIS));
        NoweFilmy noweFilmy = new NoweFilmy();
        produktArrayList = noweFilmy.getLista_filmow();

        createTable(produktArrayList);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.add(panel_loginu);
                panel1.repaint();
                panel1.revalidate();
            }
        });
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.add(panel_loginu);
                panel1.repaint();
                panel1.revalidate();
            }
        });
        nowyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.add(panel_rejestracji);
                panel1.repaint();
                panel1.revalidate();
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wstepnie ustawianie loginu i hasla jako gosc na sztywno

                if (TextField_oknoLoginu_login.getText().equals( "gosc")){
                    if (String.valueOf(PasswordField_oknoLoginu_haslo.getPassword()).equals("gosc")) {
                        Label_m_login.setText("gosc");
                        Label_m_login.setForeground(Color.red);
                        panel1.removeAll();
                        panel1.add(JPanel_menu);
                        panel1.repaint();
                        panel1.revalidate();
                        JP_menu_dolny_admin.setVisible(false);
                    }
                }
            }
        });
        tabela_produktow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (tabela_produktow.getSelectedColumn() == 3) {
                    //pokazanie statystyk
                    int row = tabela_produktow.getSelectedRow();
                    int col = tabela_produktow.getSelectedColumn();
                    TableModel komorka =  tabela_produktow.getModel();
                    String text = (String) komorka.getValueAt(row, col);
                    if (text.equals("pokaz")) {
                        komorka.setValueAt(Integer.toString(produktArrayList.get(row).getStatystyka_ogladalnosci()) + " zobaczyło", row, col);
                    } else {
                        komorka.setValueAt("pokaz", row, col);
                    }
                }
                else {
                    Film film1 = (Film)produktArrayList.get(tabela_produktow.getSelectedRow());
                    //przejscie do menu wyswietlania produktu pojedynczego

                    Label_a_f_tytul.setText(film1.getTytul());
                    Label_a_f_czasTrwania.setText(film1.getCzas_trwania());
                    Label_a_f_opis.setText(film1.getOpis());
                    Label_a_f_zdjecie.setText("");
                    ImageIcon icon1 = new ImageIcon(new ImageIcon(film1.getZdjecie_sciezka()).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));

                    //dodanie linkow do Jpanel_a_f_Linki
                    //sprawdz czy wql jest kolejka!
                    JPanel_a_f_linki.setLayout(new BoxLayout(JPanel_a_f_linki, BoxLayout.Y_AXIS));
                    JPanel_a_f_linki.removeAll();
                    if (film1.getLinki_zwiastunow().size() != 0) {
                        JLabel jlabels[] = new JLabel[film1.getLinki_zwiastunow().size()];
                        //tworzymy kopie kolejki
                        Queue <URI> linki = new ArrayDeque<>(film1.getLinki_zwiastunow());
                        for (int i = 0; i < jlabels.length; i++) {
                            URI uri = linki.remove();
                            jlabels[i] = new JLabel();
                            jlabels[i].setText("<html> <a href=\"\">" + "link " + (i+1) + "</a></html>");
                            jlabels[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                            hyperlink(jlabels[i], uri);
                            JPanel_a_f_linki.add(jlabels[i]);
                        }
                    }
                    JPanel_a_f_linki.validate();
                    JPanel_a_f_linki.repaint();

                    Label_a_f_zdjecie.setIcon( icon1);
                    Label_a_f_gatunek1.setText(film1.getGatunek());
                    Label_a_f_dataProdukcji1.setText(film1.getData_produkcji());
                    //lista
                    String nazwy_krajow = "";
                    for (String kraj :  film1.getKraje_produkcji())
                        nazwy_krajow = nazwy_krajow + kraj + " ";

                    Label_a_f_krajeProdukcji1.setText(new NoweFilmy().ustawHTML(100, nazwy_krajow));

                    String aktorzy = "";
                    for (String aktor : film1.getLista_aktorow())
                        aktorzy = aktorzy + aktor +"<br/>";

                    Label_a_f_listaAktorow1.setText("<html>" + aktorzy + "</html>");

                    Label_a_f_cena1.setText(Double.toString(film1.getCena())+ "zl");
                    Label_a_f_czasWielokrotnegoObejrzenia1.setText(film1.getCzas_wielokrotnego_ogladania());
                    Label_a_f_promocja1.setText(Integer.toString(film1.getPromocja()));
                    Label_a_f_ocenaUzytkownika1.setText(Double.toString(film1.getOcena_uzytkownika()));

                    JPanel_menu_dolny.removeAll();
                    JPanel_menu_dolny.add(JPanel_gosc_film);
                    JPanel_menu_dolny.repaint();
                    JPanel_menu_dolny.revalidate();

                }
            }
        });

        filmyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel_menu_dolny.removeAll();
                JPanel_menu_dolny.add(JP_menu_dolny1);
                JPanel_menu_dolny.repaint();
                JPanel_menu_dolny.revalidate();
            }
        });
    }

    private List<Film> createTable(List<ProdukGlowny> arrayList) {
        //dodajFilm();
        Object[][] dane = new Object[arrayList.size()][4];
        for (int i = 0; i < arrayList.size(); i++){
            ProdukGlowny produkt = arrayList.get(i);
            dane[i][0] = produkt.getData_produkcji();
            dane[i][1] = produkt.getTytul();
            dane[i][2] = produkt.toStringKraje();
            dane[i][3] = "pokaz";


        }
        Object[] nazwyKolumn = {"Rok", "nazwa", "kraje", "statystyka oglądalnosci"};

        tabela_produktow = new JTable(dane, nazwyKolumn){
            @Override
            public Class<?> getColumnClass(int column) {
                if(convertColumnIndexToModel(column)==3) return String.class;
                return super.getColumnClass(column);
            }
        };
        tabela_produktow.setDefaultRenderer(String.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
                c.setForeground(((String) value).equals("pokaz") ? Color.BLUE : Color.RED);
                return c;
            }
        });
        //tabela_produktow.setAutoCreateRowSorter(true);
        //do sortowania lecz trzeba zmienic sortowanie po obiektach oraz wysietlanie statystyk ogladalnosci
        tabela_produktow.setPreferredScrollableViewportSize(new Dimension(800, 200));
        JScrollPane_tabela_produktow = new JScrollPane(tabela_produktow);// aby były suwaki i nagłówki kolumn!
        JP_menu_dolny_tabela.removeAll();
        JP_menu_dolny_tabela.add(JScrollPane_tabela_produktow);
        return null;
    }

    private void hyperlink(JLabel label, URI uri) {
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                try {
                    Desktop.getDesktop().browse(uri);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here


        loginLabel =  new JLabel();
        loginLabel.setFont(new Font("Serif", Font.PLAIN, 30));

        hasloLabel = new JLabel();
        hasloLabel.setFont(new Font("Serif", Font.PLAIN, 30));

        TextField_oknoLoginu_login = new JTextField();
        TextField_oknoLoginu_login.setFont(new Font("Serif", Font.PLAIN, 30));

        PasswordField_oknoLoginu_haslo = new JPasswordField();
        PasswordField_oknoLoginu_haslo.setFont(new Font("Serif", Font.PLAIN, 30));

        Label_a_f_tytul = new JLabel();
        Label_a_f_tytul.setFont(new Font("Serif", Font.ITALIC, 50));

    }
}
