package primerAppSinmirar;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;
    private JPanel panelImagen;

    public TextPanel() {
        super();
        textArea = new JTextArea();
        panelImagen= new JPanel();

        setLayout(new GridLayout(2,1));

        add(new JScrollPane(textArea));
        add(panelImagen);
    }

    public void appendText(String text) {
        textArea.append(text);
    }

    public void appendImage(JLabel icono){

        panelImagen.add(icono);
        this.repaint();
        this.validate();
    }
}


