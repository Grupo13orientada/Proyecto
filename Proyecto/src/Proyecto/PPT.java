package Proyecto;

/**Juego Piedra, Papel o Tijera.*/

/**Importa todas las librerias del javax.swing*/
import javax.swing.*;
import java.awt.Color;

public class PPT
{
    public static void PiedraPapelTijera(){
        MetodosPPT m = new MetodosPPT();
        m.instruccion();
        
        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.GREEN);
        colorJOP.put("Panel.background",Color.YELLOW);
        
        String [] botones = {"Player1 vrs CPU","Player1 vrs Player2"};
        ImageIcon portada = new ImageIcon("Imagenes/ppt.png");
        int seleccion = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                portada, botones,botones[0]);
        
        if(seleccion == 0){
            m.P1vsCPU();
        } else if (seleccion == 1){
            m.P1vsP2();
        }     
    }

}
