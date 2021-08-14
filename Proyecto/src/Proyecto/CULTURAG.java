package Proyecto;


import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.ColorUIResource;
public class CULTURAG
{
    public static void CG(){
        int player1 = 1, player2 = 2;
        int puntaje = 0;
        int mario = 0;
        int luigi = 0;
        
        MetodosCG m = new MetodosCG();
        m.instruccion();

        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.BLUE);
        colorJOP.put("Panel.background",Color.ORANGE);

        ImageIcon portada = new ImageIcon("Imagenes/CG.gif");
        ImageIcon player = new ImageIcon("Imagenes/Adivinanzas/elegirplayer.png");

        int []aleatorio = m.aleatorio();

        String modes[] = {"Single Player Mode","2-Players Versus Mode"};
        String categoria[] = {"Deporte","Musica","Historia", "Ciencia", "Memelogia"};
        String botonesNiveles[] = {"Nivel Facil","Nivel Intermedio","Nivel Dificil"};
        String boton[] = {"CONTINUAR"};

        colorJOP.put("Label.font", new Font("Arial Black", Font.BOLD,20));

        int modo = JOptionPane.showOptionDialog(null,"ELIJA LA MODALIDAD QUE DESEA JUGAR","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                portada, modes, modes[0]);

        if(modo == 0){        
            int seleccion1 = JOptionPane.showOptionDialog(null,"ELIJA UNA CATEGORIA","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    portada, categoria,categoria[0]);
            int seleccion2 = JOptionPane.showOptionDialog(null,"ELIJA UN NIVEL","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    portada, botonesNiveles,botonesNiveles[0]);

            if(seleccion1 == 0 && seleccion2 == 0){
                m.nivelfacilDep(aleatorio);
            }else if(seleccion1 == 0 && seleccion2 == 1){
                m.nivelintermedioDep(aleatorio);
            }else if(seleccion1 == 0 && seleccion2 == 2){
                m.niveldificilDep(aleatorio);
            }

            if(seleccion1 == 1 && seleccion2 == 0){
                m.nivelfacilMus(aleatorio);
            }else if(seleccion1 == 1 && seleccion2 == 1){
                m.nivelintermedioMus(aleatorio);
            }else if(seleccion1 == 1 && seleccion2 == 2){
                m.niveldificilMus(aleatorio);
            }

            if(seleccion1 == 2 && seleccion2 == 0){
                m.nivelfacilHist(aleatorio);
            }else if(seleccion1 == 2 && seleccion2 == 1){
                m.nivelintermedioHist(aleatorio);
            }else if(seleccion1 == 2 && seleccion2 == 2){
                m.niveldificilHist(aleatorio);
            }

            if(seleccion1 == 3 && seleccion2 == 0){
                m.nivelfacilCien(aleatorio);
            }else if(seleccion1 == 3 && seleccion2 == 1){
                m.nivelintermedioCien(aleatorio);
            }else if(seleccion1 == 3 && seleccion2 == 2){
                m.niveldificilCien(aleatorio);
            }

            if(seleccion1 == 4 && seleccion2 == 0){
                m.nivelfacilMeme(aleatorio);
            }else if(seleccion1 == 4 && seleccion2 == 1){
                m.nivelintermedioMeme(aleatorio);
            }else if(seleccion1 == 4 && seleccion2 == 2){
                m.niveldificilMeme(aleatorio);
            }

        } else if(modo == 1){
            JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                new ImageIcon("Imagenes/elegirplayer.png"), boton,boton[0]);
            // JOptionPane.showMessageDialog(null,"SE ELEGIRA AL AZAR QUIEN VA A SER MARIO Y LUIGI");
            int turno = m.turno();

            if(turno == player1){
                // JOptionPane.showMessageDialog(null,"EL PLAYER1 VA A SER MARIO Y EL PLAYER2 LUIGI");

                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(0, 196, 204));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/malui.png"), boton,boton[0]);

                int seleccionP1 = JOptionPane.showOptionDialog(null,"MARIO ELIGE UNA CATEGORIA","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, categoria,categoria[0]);
                int seleccion2 = JOptionPane.showOptionDialog(null,"ELIJA UN NIVEL","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botonesNiveles,botonesNiveles[0]);        

                if(seleccionP1 == 0 && seleccion2 == 0){
                    mario = m.nivelfacilDep(aleatorio);
                }else if(seleccionP1 == 0 && seleccion2 == 1){
                    mario = m.nivelintermedioDep(aleatorio);
                }else if(seleccionP1 == 0 && seleccion2 == 2){
                    mario = m.niveldificilDep(aleatorio);
                }

                if(seleccionP1 == 1 && seleccion2 == 0){
                    mario = m.nivelfacilMus(aleatorio);
                }else if(seleccionP1 == 1 && seleccion2 == 1){
                    mario = m.nivelintermedioMus(aleatorio);
                }else if(seleccionP1 == 1 && seleccion2 == 2){
                    mario = m.niveldificilMus(aleatorio);
                }

                if(seleccionP1 == 2 && seleccion2 == 0){
                    mario = m.nivelfacilHist(aleatorio);
                }else if(seleccionP1 == 2 && seleccion2 == 1){
                    mario = m.nivelintermedioHist(aleatorio);
                }else if(seleccionP1 == 2 && seleccion2 == 2){
                    mario = m.niveldificilHist(aleatorio);
                }

                if(seleccionP1 == 3 && seleccion2 == 0){
                    mario = m.nivelfacilCien(aleatorio);
                }else if(seleccionP1 == 3 && seleccion2 == 1){
                    mario = m.nivelintermedioCien(aleatorio);
                }else if(seleccionP1 == 3 && seleccion2 == 2){
                    mario = m.niveldificilCien(aleatorio);
                }

                if(seleccionP1 == 4 && seleccion2 == 0){
                    mario = m.nivelfacilMeme(aleatorio);
                }else if(seleccionP1 == 4 && seleccion2 == 1){
                    mario = m.nivelintermedioMeme(aleatorio);
                }else if(seleccionP1 == 4 && seleccion2 == 2){
                    mario = m.niveldificilMeme(aleatorio);
                }

            } else if(turno == player2){
                // JOptionPane.showMessageDialog(null,"EL PLAYER2 VA A SER MARIO Y EL PLAYER1 LUIGI");
                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(0, 196, 204));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/luima.png"), boton,boton[0]);

                int seleccionP2 = JOptionPane.showOptionDialog(null,"LUIGUI ELIGE UNA CATEGORIA","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, categoria,categoria[0]);

                int seleccion2 = JOptionPane.showOptionDialog(null,"ELIJA UN NIVEL","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botonesNiveles,botonesNiveles[0]);

                if(seleccionP2 == 0 && seleccion2 == 0){
                    luigi = m.nivelfacilDep(aleatorio);
                }else if(seleccionP2 == 0 && seleccion2 == 1){
                    luigi = m.nivelintermedioDep(aleatorio);
                }else if(seleccionP2 == 0 && seleccion2 == 2){
                    luigi = m.niveldificilDep(aleatorio);
                }

                if(seleccionP2 == 1 && seleccion2 == 0){
                    luigi = m.nivelfacilMus(aleatorio);
                }else if(seleccionP2 == 1 && seleccion2 == 1){
                    luigi = m.nivelintermedioMus(aleatorio);
                }else if(seleccionP2 == 1 && seleccion2 == 2){
                    luigi = m.niveldificilMus(aleatorio);
                }

                if(seleccionP2 == 2 && seleccion2 == 0){
                    luigi = m.nivelfacilHist(aleatorio);
                }else if(seleccionP2 == 2 && seleccion2 == 1){
                    luigi = m.nivelintermedioHist(aleatorio);
                }else if(seleccionP2 == 2 && seleccion2 == 2){
                    luigi = m.niveldificilHist(aleatorio);
                }

                if(seleccionP2 == 3 && seleccion2 == 0){
                    luigi = m.nivelfacilCien(aleatorio);
                }else if(seleccionP2 == 3 && seleccion2 == 1){
                    luigi = m.nivelintermedioCien(aleatorio);
                }else if(seleccionP2 == 3 && seleccion2 == 2){
                    luigi = m.niveldificilCien(aleatorio);
                }

                if(seleccionP2 == 4 && seleccion2 == 0){
                    luigi = m.nivelfacilMeme(aleatorio);
                }else if(seleccionP2 == 4 && seleccion2 == 1){
                    luigi = m.nivelintermedioMeme(aleatorio);
                }else if(seleccionP2 == 4 && seleccion2 == 2){
                    luigi = m.niveldificilMeme(aleatorio);
                }
            }

            if(turno != player1){
                int seleccionP1 = JOptionPane.showOptionDialog(null,"MARIO ELIGE UNA CATEGORIA","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, categoria,categoria[0]);

                int seleccion2 = JOptionPane.showOptionDialog(null,"ELIJA UN NIVEL","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botonesNiveles,botonesNiveles[0]);        

                if(seleccionP1 == 0 && seleccion2 == 0){
                    mario = m.nivelfacilDep(aleatorio);
                }else if(seleccionP1 == 0 && seleccion2 == 1){
                    mario = m.nivelintermedioDep(aleatorio);
                }else if(seleccionP1 == 0 && seleccion2 == 2){
                    mario = m.niveldificilDep(aleatorio);
                }

                if(seleccionP1 == 1 && seleccion2 == 0){
                    mario = m.nivelfacilMus(aleatorio);
                }else if(seleccionP1 == 1 && seleccion2 == 1){
                    mario = m.nivelintermedioMus(aleatorio);
                }else if(seleccionP1 == 1 && seleccion2 == 2){
                    mario = m.niveldificilMus(aleatorio);
                }

                if(seleccionP1 == 2 && seleccion2 == 0){
                    mario = m.nivelfacilHist(aleatorio);
                }else if(seleccionP1 == 2 && seleccion2 == 1){
                    mario = m.nivelintermedioHist(aleatorio);
                }else if(seleccionP1 == 2 && seleccion2 == 2){
                    mario = m.niveldificilHist(aleatorio);
                }

                if(seleccionP1 == 3 && seleccion2 == 0){
                    mario = m.nivelfacilCien(aleatorio);
                }else if(seleccionP1 == 3 && seleccion2 == 1){
                    mario = m.nivelintermedioCien(aleatorio);
                }else if(seleccionP1 == 3 && seleccion2 == 2){
                    mario = m.niveldificilCien(aleatorio);
                }

                if(seleccionP1 == 4 && seleccion2 == 0){
                    mario = m.nivelfacilMeme(aleatorio);
                }else if(seleccionP1 == 4 && seleccion2 == 1){
                    mario = m.nivelintermedioMeme(aleatorio);
                }else if(seleccionP1 == 4 && seleccion2 == 2){
                    mario = m.niveldificilMeme(aleatorio);
                }

            } else if(turno != player2){
                int seleccionP2 = JOptionPane.showOptionDialog(null,"LUIGI ELIGE UNA CATEGORIA","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, categoria,categoria[0]);  

                int seleccion2 = JOptionPane.showOptionDialog(null,"ELIJA UN NIVEL","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botonesNiveles,botonesNiveles[0]);

                if(seleccionP2 == 0 && seleccion2 == 0){
                    luigi = m.nivelfacilDep(aleatorio);
                }else if(seleccionP2 == 0 && seleccion2 == 1){
                    luigi = m.nivelintermedioDep(aleatorio);
                }else if(seleccionP2 == 0 && seleccion2 == 2){
                    luigi = m.niveldificilDep(aleatorio);
                }

                if(seleccionP2 == 1 && seleccion2 == 0){
                    luigi = m.nivelfacilMus(aleatorio);
                }else if(seleccionP2 == 1 && seleccion2 == 1){
                    luigi = m.nivelintermedioMus(aleatorio);
                }else if(seleccionP2 == 1 && seleccion2 == 2){
                    luigi = m.niveldificilMus(aleatorio);
                }

                if(seleccionP2 == 2 && seleccion2 == 0){
                    luigi = m.nivelfacilHist(aleatorio);
                }else if(seleccionP2 == 2 && seleccion2 == 1){
                    luigi = m.nivelintermedioHist(aleatorio);
                }else if(seleccionP2 == 2 && seleccion2 == 2){
                    luigi = m.niveldificilHist(aleatorio);
                }

                if(seleccionP2 == 3 && seleccion2 == 0){
                    luigi = m.nivelfacilCien(aleatorio);
                }else if(seleccionP2 == 3 && seleccion2 == 1){
                    luigi = m.nivelintermedioCien(aleatorio);
                }else if(seleccionP2 == 3 && seleccion2 == 2){
                    luigi = m.niveldificilCien(aleatorio);
                }

                if(seleccionP2 == 4 && seleccion2 == 0){
                    luigi = m.nivelfacilMeme(aleatorio);
                }else if(seleccionP2 == 4 && seleccion2 == 1){
                    luigi = m.nivelintermedioMeme(aleatorio);
                }else if(seleccionP2 == 4 && seleccion2 == 2){
                    luigi = m.niveldificilMeme(aleatorio);
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