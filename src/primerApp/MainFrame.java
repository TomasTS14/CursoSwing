package primerApp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame { //<----mi MainFrame es un JFrame

    //Aqui puedo ir agregando Jpiezas no inicilizadas que tendra el JFrame. 
    private TextPanel textPanel; //<---un panel que contendrá un text area (mio)
    private JButton boton1;
    private ToolBar toolBar;

    public MainFrame(){
        super();   //<------------usa todo lo de su padre, JFrame.
      //Empiezo a darle tamaño y forma. 
      setSize(600,400); //<--------No tengo que decir this. no hay ambigüedad. 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Metodo de clase JFrame que cierra proceso al cerrar JFrame. 
      setVisible(true); //<----No por defecto. 
    

      //Voy inicilizando mis partes.
      textPanel= new TextPanel();
      boton1= new JButton("Dame click wey");//<--Texto aqui dentro es lo que dice el boton
      toolBar= new ToolBar();
      //Voy agregando y dando formato con mi Layout Manager elegido (Ahora BorderLayout)<<----Lo uso en 2º param 
     
      add(toolBar, BorderLayout.NORTH);
      add(textPanel, BorderLayout.CENTER );
      add(boton1, BorderLayout.SOUTH);


      //toolBar.setTextPanel(textPanel); //La toolBar está actuando sobre este el textPanel que le paso
                                      // en este caso el textPanel del mainframe, los interconecto. Toolbar tiene sus propias instrucciones sobre sus botone

      toolBar.setStringListener(new StringListener(){ //Constructor por defecto y declarando metodos de interfaz dentro.  
        //El objeto toolbar referencia una inicialización anonima que imprime determinado texto (En su propio actionPerformed)
        public void textEmitted(String texto){
          textPanel.appendText(texto);
        }
      });

      //especifico que acciones tomar con actionListeners para cada objeto [[[ACtionListener es interfaz, no clase, pongo sus metodos y listo]]]
      

      //que ocurrirá con boton1

     // boton1.addActionListener(new ActionListener(){  //Implemento los metdos del objeto que usa la interfaz ActionListenr

       // @Override
        //public void actionPerformed(ActionEvent e) { //Si ocurre e se hará lo que haya dentro. [Agregar texto a areaTexto si algo ocurre con boton1.]
        //    textPanel.appendText("Texto al hacer click\n"); //Parece concatenar o algo así. 

       // }



      
        


    }
    
}
