package primerApp;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
         
     
        //Recomendado correr los frame en su propio thread.  Lo hago con metodo invokeLater de clase SwingUtilites

        SwingUtilities.invokeLater(new Runnable(){ //<----Inicialización anonima, sin nombre


            public void run(){ //<---El codigo correrá aqui dentro. 


                MainFrame marco1 = new MainFrame(); //<---inicializo mi propio creado MainFrame (hijo de JFrame )



            }





        });





    }
    
    
}
