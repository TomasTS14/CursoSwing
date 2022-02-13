

package pruebaAppBotonesIcono;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.*; //SUPER NECESARIO IMPORTAR EN VS STUDIO, NO LO IMPORTA SOLO


public class ToolBar extends JPanel implements ActionListener {
  private JButton diceHolaBoton;
  private JButton diceChaoBoton;
  private TextPanel textPanel;
  private StringListener textListener;

  public ToolBar(){
  setLayout(new FlowLayout(FlowLayout.LEFT)); //Sera el Layout para toda la toolBar,, solo puede tener una direccion, que va como param ene l constructor.
   diceHolaBoton = new JButton("Hola");
   diceChaoBoton = new JButton("Chao"); //Inicializo dentro del constructor. 
  diceHolaBoton.addActionListener(this);//Aqui le agrego a los dos botones su
  // listener, que es el que implementa la clase toolbar, y esta entonces en objeto toolbar tambien, usa su propio
  diceChaoBoton.addActionListener(this);
   add(diceHolaBoton);
   add(diceChaoBoton);







  }

  public void setStringListener(StringListener stringListener){
    this.textListener = stringListener;      //El objeto propio será una referencia del objeto que meta. 
  }

  public void setTextPanel (TextPanel textpanel){
    this.textPanel = textpanel;  //El text panel de mi toolbar será una referencia del que me pasen. 
  }
  
    @Override
    public void actionPerformed(ActionEvent e){
      JButton clicked =(JButton) e.getSource(); //(Se que e se refiere a JButton asi quie puedo castear para facilitar)

      if (clicked == diceHolaBoton){
        if(textListener != null){
          textListener.textEmitted("Hola");

        }
      }else if(clicked == diceChaoBoton){
        if(textListener != null){
          textListener.textEmitted("Chao");

        }
      }
    }
    
}
