package Proyecto;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class MetodosAdivinanzas
{
    public static int nivelfacil(int []aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1[] = {"La frente","El chocolate","El amor"};
        Object botones2[] = {"El huevo","Pelota de tenis","La pera"};
        Object botones3[] = {"Un cerdito","El tomate","El diablo"};
        Object botones4[] = {"La piña","La lima","El plátano"};
        Object botones5[] = {"El pan","La espuma","La cebada"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Faciles/1.jpg"), botones1,botones1[0]);
                if(selection == 1){
                    mensajeAcerto();
                    puntaje += 20;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }      
            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Faciles/2.jpg"), botones2,botones2[0]);
                if(selection == 2){
                    mensajeAcerto();
                    puntaje += 20;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }             
            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Faciles/3.jpg"), botones3,botones3[0]);
                if(selection == 1){
                    mensajeAcerto();
                    puntaje += 20;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }   

            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Faciles/4.jpg"), botones4,botones4[0]);
                if(selection == 2){
                    mensajeAcerto();
                    puntaje += 20;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }     
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCIONARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Faciles/5.jpg"), botones5,botones5[0]);
                if(selection == 0){
                    mensajeAcerto();
                    puntaje += 20;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }     
            }
        }
        puntaje += vidas * 20;
        mensaje(puntaje);
        return puntaje;
    } 

    public static int nivelintermedio(int []aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1[] = {"Las estrellas","Los cometas","Las galaxias"};
        Object botones2[] = {"La puerta","El puente","La calle"};
        Object botones3[] = {"Un paisaje","Un mapa","Una pintura"};
        Object botones4[] = {"El cerebro","La madre","Un sub-gerente"};
        Object botones5[] = {"Un fantasma","El miedo","El viento"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Intermedio/1.gif"), botones1,botones1[0]);
                if(selection == 0){
                    mensajeAcerto();
                    puntaje += 40;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }      
            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Intermedio/2.gif"), botones2,botones2[0]);
                if(selection == 2){
                    mensajeAcerto();
                    puntaje += 40;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }             
            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Intermedio/3.gif"), botones3,botones3[0]);
                if(selection == 1){
                    mensajeAcerto();
                    puntaje += 40;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }     
            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Intermedio/4.gif"), botones4,botones4[0]);
                if(selection == 0){
                    mensajeAcerto();
                    puntaje += 40;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }     
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Intermedio/5.gif"), botones5,botones5[0]);
                if(selection == 2){
                    mensajeAcerto();
                    puntaje += 40;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }     
            }
        }
        puntaje += vidas * 40;
        mensaje(puntaje);
        return puntaje;
    }

    public static int niveldificil(int []aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1[] = {"La izquierda","La Derecha"};
        Object botones2[] = {"12","16","14","18"};
        Object botones3[] = {"4","2","6","8"};
        Object botones4[] = {"Julia","Pedro","Jaime","Susan"};
        Object botones5[] = {"38","35","37","42"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Dificil/1.jpg"), botones1,botones1[0]);
                if(selection == 0){
                    mensajeAcerto();
                    puntaje += 60;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }      
            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Dificil/2.jpg"), botones2,botones2[0]);
                if(selection == 2){
                    mensajeAcerto();
                    puntaje += 60;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }             
            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Dificil/3.jpg"), botones3,botones3[0]);
                if(selection == 1){
                    mensajeAcerto();
                    puntaje += 60;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }     
            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Dificil/4.gif"), botones4,botones4[0]);
                if(selection == 0){
                    mensajeAcerto();
                    puntaje += 60;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }     
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Adivinanzas/Dificil/5.jpg"), botones5,botones5[0]);
                if(selection == 2){
                    mensajeAcerto();
                    puntaje += 60;
                } else {
                    mensajeIncorrecto();
                    vidas--;
                    if(vidas == 0){
                        GameOver();
                        break;
                    }
                }     
            }
        }
        puntaje += vidas * 60;
        mensaje(puntaje);
        return puntaje;
    }

    public static int []aleatorio(){
        int longitud = 5;
        int arreglo[]=new int[longitud];
        if((5-1)>=(longitud-1))/**aqui se metera si cumple con la condicion de que los numeros se puedan generar*/
        { 
            int cantidad_elementos=0;
            boolean encontrado;
            while(cantidad_elementos<longitud)
            {
                int aleatorio = (int)(Math.random()*5)+1;
                encontrado=false;
                for(int i=0; i<arreglo.length && !encontrado;i++)
                {
                    if(aleatorio==arreglo[i])
                    {
                        encontrado=true; 

                    }
                }
                if (encontrado)/**aqui le decimos que si el numero ya estaba en el arreglo pues que no lo agregue  osea que no hara nada*/
                {
                    //JOptionPane.showMessageDialog(null,"El numero "+aleatorio+" existe");
                }
                else
                {
                    arreglo[cantidad_elementos++]=aleatorio;/**caso contrario , si no esta agregado pues lo metera aqui*/
                    // JOptionPane.showMessageDialog(null,"Agregado el "+aleatorio);
                }
            }
        }

        return arreglo;
    }

    public static int turno(){
        int turno = (int)(Math.random()*2)+1;
        return turno;
    }
    
    public static void instruccion(){
        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.BLACK);
        colorJOP.put("Panel.background",Color.BLACK);
        ImageIcon portada = new ImageIcon("Imagenes/IntroAdivinanzas.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,portada);
    }

    public static void mensaje(int puntaje){
        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.black);
        colorJOP.put("Panel.background", new ColorUIResource(245, 81, 95));
        
        ImageIcon GameOver = new ImageIcon("Imagenes/Adivinanzas/puntaje.png");
        JOptionPane.showMessageDialog(null,"Su puntaje total es de: "+puntaje,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,GameOver);
        //JOptionPane.showMessageDialog(null,"Su puntaje total es de: "+puntaje);
    }

    public static void mensajeAcerto(){
        ImageIcon acertar = new ImageIcon("Imagenes/Adivinanzas/acerto.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,acertar);
    }

    public static void mensajeIncorrecto(){
        ImageIcon equivoco = new ImageIcon("Imagenes/Adivinanzas/equivoco.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,equivoco);
    }

    public static void mario(){
        ImageIcon mario = new ImageIcon("Imagenes/mario.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,mario);
    }

    public static void luigi(){
        ImageIcon luigi = new ImageIcon("Imagenes/luigi.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,luigi);
    }

    public static void empate(){
        ImageIcon empate = new ImageIcon("Imagenes/empate.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,empate);
    }

    public static void GameOver(){
        ImageIcon GameOver = new ImageIcon("Imagenes/Adivinanzas/go2.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,GameOver);
    }

}
