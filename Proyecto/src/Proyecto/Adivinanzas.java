package Proyecto;


/**JUEGO ADIVINANZAS*/
import javax.swing.*;
import java.awt.Color;
import javax.swing.plaf.ColorUIResource;
public class Adivinanzas
{
    public static void Adivinanzas(){
        int player1 = 1, player2 = 2;
        int puntaje = 0;
        int mario = 0;
        int luigi = 0;
        MetodosAdivinanzas m = new MetodosAdivinanzas();
        m.instruccion();
        
        String [] botones4 = {"SEGUIR"};


        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.RED);
        colorJOP.put("Panel.background",Color.GREEN);

        ImageIcon portada = new ImageIcon("Imagenes/Adivinanzas.gif");
        ImageIcon player = new ImageIcon("Imagenes/Adivinanzas/elegirplayer.png");

        
        int []aleatorio = m.aleatorio();

        String modes[] = {"Single Player Mode","2-Players Versus Mode"};
        String boton[] = {"CONTINUAR"};
        String botonesNiveles[] = {"Nivel Facil","Nivel Intermedio","Nivel Dificil"};

        int modo = JOptionPane.showOptionDialog(null,"ELIJA LA MODALIDAD QUE DESEA JUGAR","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                portada, modes, modes[0]);

        if(modo == 0){        
            int seleccion = JOptionPane.showOptionDialog(null,"ELIJA UN NIVEL","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    portada, botonesNiveles,botonesNiveles[0]);

            if(seleccion == 0){
                m.nivelfacil(aleatorio);
            }else if(seleccion == 1){
                m.nivelintermedio(aleatorio);
            }else{
                m.niveldificil(aleatorio);
            }

        } else if(modo == 1){
            JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
               new ImageIcon("Imagenes/elegirplayer.png"), boton,boton[0]);
            //JOptionPane.showMessageDialog(null,"SE ELEGIRA AL AZAR QUIEN VA A SER MARIO Y LUIGI");
            int turno = m.turno();

            if(turno == player1){
                // JOptionPane.showMessageDialog(null,"EL PLAYER1 VA A SER MARIO Y EL PLAYER2 LUIGI");

                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(0, 196, 204));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/malui.png"), botones4,botones4[0]);

                int seleccionP1 = JOptionPane.showOptionDialog(null,"MARIO ELIGE UNA DE LAS SIGUIENTES OPCIONES","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botonesNiveles,botonesNiveles[0]);

                if(seleccionP1 == 0){
                    mario = m.nivelfacil(aleatorio);
                }else if(seleccionP1 == 1){
                    mario = m.nivelintermedio(aleatorio);
                }else{
                    mario = m.niveldificil(aleatorio);
                }

            } else if(turno == player2){
                //JOptionPane.showMessageDialog(null,"EL PLAYER2 VA A SER MARIO Y EL PLAYER1 LUIGI");
                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(0, 196, 204));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/luima.png"), botones4,botones4[0]);

                int seleccionP2 = JOptionPane.showOptionDialog(null,"MARIO ELIGE UNA DE LAS SIGUIENTES OPCIONES","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botonesNiveles,botonesNiveles[0]);     

                if(seleccionP2 == 0){
                    mario = m.nivelfacil(aleatorio);
                }else if(seleccionP2 == 1){
                    mario = m.nivelintermedio(aleatorio);
                }else{
                    mario = m.niveldificil(aleatorio);
                }
            }

            if(turno != player1){
                int seleccionP1 = JOptionPane.showOptionDialog(null,"LUIGI ELIGE UNA DE LAS SIGUIENTES OPCIONES","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botonesNiveles,botonesNiveles[0]);

                if(seleccionP1 == 0){
                    luigi = m.nivelfacil(aleatorio);
                }else if(seleccionP1 == 1){
                    luigi = m.nivelintermedio(aleatorio);
                }else{
                    luigi = m.niveldificil(aleatorio);
                }

            } else if(turno != player2){
                int seleccionP2 = JOptionPane.showOptionDialog(null,"LUIGI ELIGE UNA DE LAS SIGUIENTES OPCIONES","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botonesNiveles,botonesNiveles[0]);  

                if(seleccionP2 == 0){
                    luigi = m.nivelfacil(aleatorio);
                }else if(seleccionP2 == 1){
                    luigi = m.nivelintermedio(aleatorio);
                }else{
                    luigi = m.niveldificil(aleatorio);
                }
            }

            if(mario > luigi){
                m.mario();
            } else if(mario < luigi){
                m.luigi();
            } else {
                m.empate();
            }
        }
    }
}