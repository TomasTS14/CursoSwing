package primerAppSinmirar;

import javax.swing.*;

public class uso {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                MainFrame marco1 = new MainFrame("Mi app que habla.");
            }
        }
        );}
}

