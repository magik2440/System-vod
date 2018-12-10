package api_okienkowe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VOD_okienko {
    public JPanel panel1;
    private JTextArea oknoLoginuTextArea;
    private JButton okButton;
    private JButton nowyButton;
    private JTextArea loginTextArea;
    private JPasswordField adminPasswordField;
    private JTextArea hasloTextArea;
    private JTextField adminTextField;
    private JTextArea oknoRejestracjiTextArea;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JButton newButton;
    private JButton cancelButton;
    private JPasswordField passwordField2;
    private JTextArea loginTextArea1;
    private JTextArea hasloTextArea1;
    private JTextArea powtorzHasloTextArea;
    private JPanel panel_loginu;
    private JPanel panel_rejestracji;
    private JPanel JPanel_admin_main;
    private JPanel JPanel_admin_menu;
    private JButton button1;
    private JButton button2;
    private JButton button3;

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
    }
}
