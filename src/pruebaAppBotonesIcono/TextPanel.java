package pruebaAppBotonesIcono;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel { //Es un JPanel que tendrá texto, por eso el nombre lmao

    private JTextArea textArea;
    

public TextPanel(){   //Un panel puede usar su propio Layout Manager.
    super();
    textArea= new JTextArea(); //Lo inicializo. Uno de los componentes de TextPanel
    setLayout(new BorderLayout());  //Especifico que layout usaré dentro de este panel

   // add(textArea, BorderLayout.CENTER); //<----posiciono en this este textArea usando el BorderLayout con su posicionador CENTER
     add(new JScrollPane(textArea), BorderLayout.CENTER); //<---estoy rodeando mi textArea de un JScroll y dandole posición 
     //SE ACTIVA SI HACE FALTA, SI TEXTO NO CABE EN TEXTAREA.
   
}

//METODOS.........-------------------...............

public void appendText(String text){
textArea.append(text);



}

    
}
