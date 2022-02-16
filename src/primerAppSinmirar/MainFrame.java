package primerAppSinmirar;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ToolBar toolBar;
    private TextPanel panel;

    public MainFrame(String titulo) {
        super();
        setTitle(titulo);
        toolBar = new ToolBar();
        panel = new TextPanel();


        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 500);


        add(toolBar,BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);


        toolBar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String texto) {
                panel.appendText(texto);
            }
        });

        toolBar.setImageListener(new IconListener() {
            @Override
            public void emittedImage(JLabel i) {
                panel.appendImage(i);
                repaint();
                validate();
            }
        });



    }


}
