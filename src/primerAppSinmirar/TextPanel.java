package primerAppSinmirar;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;
    private JPanel panelImagen;
    //Prueba imagen
    private JLabel iconoLabel;
    public TextPanel() {
        super();
        textArea = new JTextArea();
        panelImagen= new JPanel();
        //iconoLabel = new JLabel(); creo que no hace falta si lo inicilizo en el elemento
        setLayout(new GridLayout(2,1));

        add(new JScrollPane(textArea));
        add(panelImagen);
        //Prueba
       // panelImagen.add(iconoLabel);
    }

    public void appendText(String text) {
        textArea.append(text);
    }

    public void appendImage(JLabel icono){
        panelImagen.add(icono);
        this.repaint();
        this.revalidate();


    }
}


