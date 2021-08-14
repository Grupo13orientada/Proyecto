package Proyecto;


/** JUEGO DEL AHORCADO */

/** Importa toda la libreria de javax.swing */
import javax.swing.*;
import java.awt.Color;

public class AHORCADO
{
    public static void Ahorcado(){
        MetodosAhorcado m = new MetodosAhorcado(); 
        int fallosPermitidos=7, fallos=0;
        int i, encontrados;
        String letra;
        String palabraAdivinar = "";
        String letrasEncontradas = "";
        String mensaje="";
        boolean adivinado=false;
        m.instruccion();
        
         UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.GREEN);
        colorJOP.put("Panel.background",Color.CYAN);

        ImageIcon portada = new ImageIcon("Imagenes/Ahorcado.gif");
        String []niveles = {"Facil","Intermedio","Dificil","Mega Dificil","Dios"};

        int seleccion = JOptionPane.showOptionDialog(null,"ELIJA UN NIVEL DEL AHORCADO","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                portada, niveles,niveles[0]);

        if(seleccion == 0){
            palabraAdivinar = m.Palabraleatoria(m.nivelfacil());
        }else if(seleccion == 1){
            palabraAdivinar = m.Palabraleatoria(m.nivelintermedio());
        }else if(seleccion == 2){
            palabraAdivinar = m.Palabraleatoria(m.niveldificil());
        }else if(seleccion == 3){
            palabraAdivinar = m.Palabraleatoria(m.nivelmegadificil());
        }else if(seleccion == 4){
            palabraAdivinar = m.Palabraleatoria(m.nivelDios());
        }

        letrasEncontradas = m.inicializarLetrasEncontradas(palabraAdivinar.length());

        do{
            
            letra=JOptionPane.showInputDialog("Introduce una letra");
            letra=letra.toLowerCase();

            //comprobamos si ha fallado y actualizamos el número de fallos
            encontrados=m.actualizarFallos(palabraAdivinar, letra);
            if(encontrados==0){
                fallos++;
            }

            mensaje+="La palabra contiene "+encontrados+" "+letra.charAt(0)+" en la palabra";

            //ahora dibujamos el dibujo del ahorcado dependiendo del número de fallos
            mensaje+="\n"+m.dibujarAhorcado(fallos);

            //ahora actualizamos la información de las letras encontradas y la imprimimos
            letrasEncontradas=m.actualizarLetrasEncontradas(palabraAdivinar, letra, letrasEncontradas);

            mensaje+="\nLetras encontradas: "+letrasEncontradas;

            JOptionPane.showMessageDialog(null,mensaje);

            //ahora reiniciamos el mensaje para la siguiente letra
            mensaje="";

            //comprobamos si ha encontrado todas las letras
            if(palabraAdivinar.equals(letrasEncontradas)){
                adivinado=true;
            }

        }while(fallos<fallosPermitidos && adivinado==false);

        if(adivinado==false){
            ImageIcon GameOver = new ImageIcon("Imagenes/Adivinanzas/go.gif");
            JOptionPane.showMessageDialog(null,"Lo siento has agotado los intentos.\nHa finalizado el juego.","ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,GameOver);
        }else{
            ImageIcon victoria = new ImageIcon("Imagenes/victoria.gif");
            JOptionPane.showMessageDialog(null,"¡Felicidades! has acertado en la palabra","ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,victoria);
        }

    }
}
