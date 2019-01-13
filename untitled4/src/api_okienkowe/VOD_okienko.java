package api_okienkowe;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    private JPanel JPanel_admin_main;
    private JPanel JPanel_menu;
    private JPanel JPanel_admin_film;
    private JLabel Label_a_f_tytul;
    private JLabel Label_a_f_czasTrwania;
    private JLabel Label_a_f_opis;
    private JLabel Label_a_f_gatunek;
    private JLabel Label_a_f_dataProdukcji;
    private JLabel Label_a_f_krajeProdukcji;
    private JLabel Label_a_f_listaAktorow;
    private JLabel Label_a_f_cena;
    private JLabel Label_a_f_czasOgladania;
    private JLabel Label_a_f_promocja;
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
    private JScrollPane JScrollPane_tabela_produktow;
    private int tab_stat_ogl[] = {1, 2, 13, 4, 5, 6};

    public VOD_okienko() {

        JP_menu_dolny_tabela.setLayout(new BoxLayout(JP_menu_dolny_tabela, BoxLayout.Y_AXIS));
        createTable();

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
                //Wstepnie ustawianie oginu i hasla jako gosc na sztywno

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
                if (tabela_produktow.getSelectedColumn() == 4) {
                    //pokazanie statystyk
                    int row = tabela_produktow.getSelectedRow();
                    int col = tabela_produktow.getSelectedColumn();
                    TableModel komorka =  tabela_produktow.getModel();
                    String text = (String) komorka.getValueAt(row, col);
                    if (text.equals("pokaz")) {
                        komorka.setValueAt(Integer.toString(tab_stat_ogl[row]), row, col);
                    } else {
                        komorka.setValueAt("pokaz", row, col);
                    }
                }
                else {
                    //przejscie do menu wyswietlania produktu pojedynczego
                }
            }
        });
    }
    private void createTable() {

        Object[][] dane = {{new Integer(1974), "Potop", "Historyczny", "Jerzy Hoffman", "pokaz"},
                {new Integer(2007), "Transformers", "Akcja, Sci-Fi", "Michael Bay", "pokaz"},
                {new Integer(1992), "Zapach kobiety", "Dramat", "Martin Brest","pokaz" },
                {new Integer(1997), "buntownik z wyboru", "Dramat obyczajowy", "Gus Van Sant", "pokaz"},
                {new Integer(1991), "Terminator 2: Dzień sądu", "Akcja, Sci-Fi", "James Cameron", "pokaz"},
                {new Integer(2008), "Oldboy. Zemsta jest cierpliwa", "Thriller", "Spike Lee", "pokaz"}

        };
        Object[] nazwyKolumn = {"Rok", "nazwa", "gatunek", "rezyser", "statystyka oglądalnosci"};

        tabela_produktow = new JTable(dane, nazwyKolumn){
            @Override
            public Class<?> getColumnClass(int column) {
                if(convertColumnIndexToModel(column)==4) return String.class;
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
        JP_menu_dolny_tabela.add(JScrollPane_tabela_produktow);
    }
}
