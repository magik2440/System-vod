import api_okienkowe.VOD_okienko;

import javax.swing.*;

public class Main {
    public static void main(String args[])
    {
        JFrame jFrame =  new JFrame("VOD_okienko");
        jFrame.setContentPane(new VOD_okienko().panel1);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
