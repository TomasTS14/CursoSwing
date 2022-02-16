package primerAppSinmirar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

    private JButton gritoBoton;
    private JButton duermoBoton;
    private JButton imageBoton;
    private StringListener textListener;
    private IconListener iconListener;
    private JLabel icono;

    public ToolBar() {
        super();
        gritoBoton = new JButton("!!!!!");
        duermoBoton = new JButton("Zzz");
        imageBoton = new JButton("Agrega imagen");

        setLayout(new FlowLayout(FlowLayout.LEFT));
        gritoBoton.addActionListener(this);
        duermoBoton.addActionListener(this);
        duermoBoton.addActionListener(this);
        imageBoton.addActionListener(this);
        add(gritoBoton);
        add(duermoBoton);
        add(imageBoton);

    }

    public void setStringListener(StringListener listener) {
        textListener = listener;
    }

    public void setImageListener(IconListener listener) {
        iconListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clicked = (JButton) e.getSource();

        if (clicked == gritoBoton) {
            if (textListener != null) {
                textListener.textEmitted("AAAAAAAAAAAAA");
            }

        } else if (clicked == duermoBoton) {
            if (textListener != null) {
                textListener.textEmitted("Zzzzzzz");
            }
        } else if (clicked == imageBoton) {

            if (iconListener != null && icono == null) {
                icono = new JLabel(new ImageIcon(MainFrame.class.getResource("/perroMarronAnimadoChiqui.gif")));
                iconListener.emittedImage(icono);
                }
            //else if (iconListener != null && icono != null){
//                icono= null;
//            }
            }
        }

    }





