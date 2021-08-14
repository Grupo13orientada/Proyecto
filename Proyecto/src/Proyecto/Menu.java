




/**
 *
 * @author INVER. HERNANDEZ
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
public class Menu
{
    public static void main(String args[])
    {
        boolean seguir = true;
        String modes[] = {"Piedra/Papel o Tijeras","Adivinanzas","Ahorcado","Cultura General"};
        String cont[] = {"SI","NO"};
        String sal[] = {"SALIR"};
        UIManager colorJOP=new UIManager();
        UIManager.put("Label.font", new Font("Arial Black", Font.BOLD,30));
        
        portada();
        
        while(seguir)
        {
            UIManager.put("OptionPane.background",Color.BLACK);
            UIManager.put("Panel.background", new ColorUIResource(209, 230, 220));

            int juego = JOptionPane.showOptionDialog(null,"QUE JUEGO DESEAS JUGAR?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Proyecto/src/Imagenes/Port.png"), modes, modes[0]);

            while(seguir)
            {   
                switch (juego) {
                    case 0:
                        PPT.PiedraPapelTijera();
                        break;
                    case 1:
                        Adivinanzas.Adivinanzas();
                        break;
                    case 2:
                        AHORCADO.Ahorcado();
                        break;
                    case 3:
                        CULTURAG.CG();
                        break;
                    default:
                        break;
                }

                int conti = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Proyecto/src/Imagenes/Conti3.png"), cont, cont[0]);

                if(conti==0)
                {
                    seguir = true;
                }
                else if(conti==1)
                {
                   JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Proyecto/src/Imagenes/gracias.png"), sal, sal[0]);
                    break;
                }

            }
            UIManager.put("OptionPane.background",Color.BLACK);
            UIManager.put("Panel.background", new ColorUIResource(209, 230, 220));

            int conti = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Proyecto/src/Imagenes/Conti2.png"), cont, cont[0]);

            if(conti==0)
            {
                seguir = true;
            }
            else if(conti==1)
            {
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Proyecto/src/Imagenes/gracias.png"), sal, sal[0]);
                break;
            }
        }

    }
    
    public static void portada(){
        UIManager colorJOP=new UIManager();
        UIManager.put("OptionPane.background",Color.BLACK);
        UIManager.put("Panel.background",Color.BLACK);
        ImageIcon portada = new ImageIcon("Proyecto/src/Imagenes/PortadaGrupo.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,portada);
    }
    
    public static void mensaje(String msj)
    {
        JOptionPane.showMessageDialog(null,msj,"ATENCION",1);
    }   
}
