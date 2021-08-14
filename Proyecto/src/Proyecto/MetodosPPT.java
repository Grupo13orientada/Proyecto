package Proyecto;


/**Metodos para todos los juegos del ARCADE*/

/**Importa toda la libreria de javax.swing*/
import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.ColorUIResource;
public class MetodosPPT 
{

    public static void P1vsCPU(){
        String [] botones = {"Piedra", "Papel", "Tijera"};
        String [] botones2 = {"SI","NO"};
        String [] botones3 = {"CONTINUAR"};
        int continuar = 0;

        UIManager colorJOP=new UIManager();

        while(continuar == 0){ 
            int CPU = (int)(Math.random()*2)+0;

            colorJOP.put("OptionPane.background",Color.BLACK);
            colorJOP.put("Panel.background", new ColorUIResource(232, 54, 54));
            JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                new ImageIcon("Imagenes/CPU.png"), botones3, botones3[0]);

            colorJOP.put("OptionPane.background",Color.GREEN);
            colorJOP.put("Panel.background",Color.YELLOW);

            ImageIcon portada = new ImageIcon("Imagenes/ppt.gif");
            int seleccion = JOptionPane.showOptionDialog(null,"ELIJA UNA OPCION PLAYER1","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    portada, botones,botones[0]);

            switch(CPU){
                case 0:

                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(182, 76, 255));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/CPUpiedra.gif"), botones3, botones3[0]);

                switch(seleccion){ // JUGADOR 1
                    case 0:

                    colorJOP.put("OptionPane.background",Color.GREEN);
                    colorJOP.put("Panel.background",Color.YELLOW);

                    continuar = JOptionPane.showOptionDialog(null,"EMPATARON DESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/empate.gif"), botones2,botones2[0]);
                    break;
                    case 1:
                    continuar = JOptionPane.showOptionDialog(null,"FELICIDADES GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/victoria.gif"), botones2,botones2[0]);
                    break;
                    case 2:
                    JOptionPane.showMessageDialog(null,"LASTIMA LA COMPUTADORA GANO!\nELLA ELEGIRA SI CONTINUAR O NO","ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("Imagenes/risa.gif"));
                    RandomCPU();
                    break;
                }
                break;

                case 1:
                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(0, 196, 204));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ESTRUCTURADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/CPUpapel.png"), botones3, botones3[0]);

                switch(seleccion){
                    case 0:
                    JOptionPane.showMessageDialog(null,"LASTIMA LA COMPUTADORA GANO!\nELLA ELEGIRA SI CONTINUAR O NO","ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("Imagenes/risa.gif"));
                    RandomCPU();
                    break;
                    case 1:
                    continuar = JOptionPane.showOptionDialog(null,"EMPATARON DESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/empate.gif"), botones2,botones2[0]);
                    break;
                    case 2:
                    continuar = JOptionPane.showOptionDialog(null,"FELICIDADES GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/victoria.gif"), botones2,botones2[0]);
                    break;
                }
                break;

                case 2:// tijera
                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(255, 121, 72));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ESTRUCTURADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/CPUtijera.png"), botones3, botones3[0]);
                switch(seleccion){
                    case 0:
                    continuar = JOptionPane.showOptionDialog(null,"FELICIDADES GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/victoria.gif"), botones2,botones2[0]);
                    break;
                    case 1:
                    JOptionPane.showMessageDialog(null,"LASTIMA LA COMPUTADORA GANO!\nELLA ELEGIRA SI CONTINUAR O NO","ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("Imagenes/risa.gif"));
                    RandomCPU();
                    break;
                    case 2:
                    continuar = JOptionPane.showOptionDialog(null,"EMPATARON DESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/empate.gif"), botones2,botones2[0]);
                    break;
                }
                break;
            }
        }
    }

    public static void RandomCPU(){

        String [] botones3 = {"CONTINUAR"};
        String [] botones4 = {"SALIR"};
        int continuar = (int)(Math.random()*2)+1;
        UIManager colorJOP=new UIManager();

        colorJOP.put("OptionPane.background",Color.BLACK);
        colorJOP.put("Panel.background", new ColorUIResource(100, 102, 175));

        if(continuar == 1){
            //JOptionPane.showMessageDialog(null,"LA COMPUTADORA DECIDIO CONTINUAR LA PARTIDA");
            JOptionPane.showOptionDialog(null," ","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                new ImageIcon("Imagenes/CPUconti.png"), botones3,botones3[0]);
        } else {
            //JOptionPane.showMessageDialog(null,"LA COMPUTADORA DECIDIO TERMINAR LA PARTIDA");
            JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                new ImageIcon("Imagenes/CPUtermino.png"), botones4,botones4[0]);
            CPUnoC();
            System.exit(0);
        }
    }

    public static void CPUnoC(){
        ImageIcon perdiste = new ImageIcon("Imagenes/Yanoyaperdiste.jpg");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,perdiste);
    }

    public static int turno(){
        int turno = (int)(Math.random()*2)+1;
        return turno;
    }
    
    public static void instruccion(){
        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.BLACK);
        colorJOP.put("Panel.background",Color.BLACK);
        ImageIcon portada = new ImageIcon("Imagenes/introPPE.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,portada);
    }

    public static void P1vsP2(){
        String [] botones = {"Piedra", "Papel", "Tijera"};
        String [] botones2 = {"SI","NO"};
        String [] botones4 = {"SEGUIR"};
        int player1 = 1, player2 = 2;
        int continuar = 0, primero = 0, ultimo = 0;
        UIManager colorJOP=new UIManager();

        while(continuar == 0){ 
            JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                new ImageIcon("Imagenes/elegirPlayer.png"), botones4,botones4[0]);

            //JOptionPane.showMessageDialog(null,"SE ELEGIRA AL AZAR QUIEN VA A SER MARIO Y LUIGI");
            int turno = turno();
            if(turno == player1){
                //JOptionPane.showMessageDialog(null,"EL PLAYER1 VA A SER MARIO Y EL PLAYER2 LUIGI");

                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(0, 196, 204));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/malui.png"), botones4,botones4[0]);

                ImageIcon portada = new ImageIcon("Imagenes/ppt.gif");
                int seleccionP1 = JOptionPane.showOptionDialog(null,"MARIO ELIGE UNA DE LAS SIGUIENTES OPCIONES","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botones,botones[0]);
                primero = seleccionP1;        
           
            } else if(turno == player2){
                //JOptionPane.showMessageDialog(null,"EL PLAYER2 VA A SER MARIO Y EL PLAYER1 LUIGI");

                colorJOP.put("OptionPane.background",Color.BLACK);
                colorJOP.put("Panel.background", new ColorUIResource(0, 196, 204));
                JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                    new ImageIcon("Imagenes/luima.png"), botones4,botones4[0]);

                ImageIcon portada = new ImageIcon("Imagenes/ppt.gif");
                int seleccionP2 = JOptionPane.showOptionDialog(null,"LUIGUI ELIGE UNA DE LAS SIGUIENTES OPCIONES","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botones,botones[0]);
                primero = seleccionP2;        
            }
            if(turno != player1){
                ImageIcon portada = new ImageIcon("Imagenes/ppt.gif");
                int seleccionP1 = JOptionPane.showOptionDialog(null,"MARIO ELIGE UNA DE LAS SIGUIENTES OPCIONES","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botones,botones[0]);
                ultimo = seleccionP1;        
            } else if(turno != player2){
                ImageIcon portada = new ImageIcon("Imagenes/ppt.gif");
                int seleccionP2 = JOptionPane.showOptionDialog(null,"LUIGI ELIGE UNA DE LAS SIGUIENTES OPCIONES","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        portada, botones,botones[0]);
                ultimo = seleccionP2;        
            }

            switch(primero){
                case 0:
                switch(ultimo){
                    case 0:
                    continuar = JOptionPane.showOptionDialog(null,"AMBOS EMPATARON DESEAN CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/empate.gif"), botones2,botones2[0]);
                    break;
                    case 1:
                    continuar = JOptionPane.showOptionDialog(null,"LUIGI GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/luigi.gif"), botones2,botones2[0]);
                    break;
                    case 2:
                    continuar = JOptionPane.showOptionDialog(null,"MARIO GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/mario.gif"), botones2,botones2[0]);
                    break;
                }
                break;

                case 1:
                switch(ultimo){
                    case 0:
                    continuar = JOptionPane.showOptionDialog(null,"MARIO GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/mario.gif"), botones2,botones2[0]);
                    break;
                    case 1:
                    continuar = JOptionPane.showOptionDialog(null,"AMBOS EMPATARON DESEAN CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/empate.gif"), botones2,botones2[0]);
                    break;
                    case 2:
                    continuar = JOptionPane.showOptionDialog(null,"LUIGI GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/luigi.gif"), botones2,botones2[0]);
                    break;
                }
                break;

                case 2:
                switch(ultimo){
                    case 0:
                    continuar = JOptionPane.showOptionDialog(null,"LUIGI GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/luigi.gif"), botones2,botones2[0]);
                    break;
                    case 1:
                    continuar = JOptionPane.showOptionDialog(null,"MARIO GANO!!!\nDESEA CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/mario.gif"), botones2,botones2[0]);
                    break;
                    case 2:
                    continuar = JOptionPane.showOptionDialog(null,"AMBOS EMPATARON DESEAN CONTINUAR JUGANDO?","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/empate.gif"), botones2,botones2[0]);
                    break;
                }
                break;
            }
        }
    }
}