package api_okienkowe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public VOD_okienko() {
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
                        panel1.removeAll();
                        panel1.add(JPanel_menu);
                        panel1.repaint();
                        panel1.revalidate();
                    }
                }
            }
        });
    }
}
