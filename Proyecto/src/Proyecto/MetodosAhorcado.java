package Proyecto;


import javax.swing.*;
import java.awt.*;

public class MetodosAhorcado 
{
    public static String []nivelfacil(){ 
        String []facil = {"papá","mamá","agua","perro","gato","casa","mapa","vaso","tasa","palo"};
        return facil;
    }
    
    public static String []nivelintermedio(){
        String []facil = {"abuela","abuelo","ahorra","albaca","camino","cubano","conejo","biblia","muelen","llanta"};
        return facil;
    }
    
    public static String []niveldificil(){
        String []facil = {"bolsillo","brumador","adultero","capciosa","alabanza","concerje","habanero","zabucado","yemenies","vaciador"};
        return facil;
    }
    
    public static String []nivelmegadificil(){
        String []facil = {"antárctico","colmenares","broquelazo","disquetera","eliminador","husmeadora","fustigador","gangrenoso","maliciador","sepultador"};
        return facil;
    }
    
    public static String []nivelDios(){
        String []facil = {"alabradorado","cachimbearse","desaherrojar","encontronazo","eslabonadora","fenilalanina","filatelistas","guerrerenses","guitarreable","mangoneadora"};
        return facil;
    }
    
    public static String inicializarLetrasEncontradas(int longitud) {
        String letras="";
        int i;
        for(i=0; i<longitud;i++){
            letras=letras+"_";
        }
        return letras;
    }

    public static int actualizarFallos(String palabraAdivinar, String letra) {
        int i;
        int encontrado=0;

        for(i=0; i<palabraAdivinar.length();i++){
            if(palabraAdivinar.charAt(i)==letra.charAt(0)){
                encontrado++;                
            }
        }

        return encontrado;
    }

    public static String actualizarLetrasEncontradas(String palabraAdivinar, String letra, String letrasEncontradas) {
        int i;
        String actualizacionLetras="";

        for(i=0; i<palabraAdivinar.length();i++)  {

            if(letra.charAt(0)==palabraAdivinar.charAt(i)){
                //hemos encontrado la letra
                actualizacionLetras+=letra.charAt(0);
            }else{
                actualizacionLetras+=letrasEncontradas.charAt(i);
            }
        }
        return actualizacionLetras;
    }

    public static String dibujarAhorcado(int fallos){
        String dibujo="";

        switch(fallos){

            case 0:
            dibujo="_____";
            break;
            case 1:
            dibujo="|\n|\n|\n_____";
            break;
            case 2:
            dibujo="|\n|\n|\n|\n|\n_____";
            break;
            case 3:
            dibujo="____\n|\n|\n|\n|\n|\n_____";
            break;
            case 4:
            dibujo="____\n|      |\n|\n|\n|\n|\n_____";
            break;
            case 5:
            dibujo="____\n|      |\n|     O\n|\n|\n|\n_____";
            break;
            case 6:
            dibujo="____\n|      |\n|     O\n|      |\n|\n|\n_____";
            break;
            case 7:
            dibujo="____\n|      |\n|     O\n|      |\n|     /\\  \n|\n_____";
            break;  
        }
        return dibujo;
    }    
    
    public static int aleatorio(){
        int aleatorio = (int)(Math.random()*9)+0;
        return aleatorio;
    }
    
    public static String Palabraleatoria(String[]palabra){
        String Palabraleatoria = "";
        Palabraleatoria = palabra[aleatorio()];
        return Palabraleatoria;
    }
    
        public static String validarSiHayNumeros(String cade)
    {
        char letra;
        String cadena="";
        boolean numEncontrado=true;
        do{
            try{
                cadena=JOptionPane.showInputDialog(cade);
                for(int i=0;i<cadena.length();i++)
                {
                    letra=cadena.charAt(i);
                    numEncontrado=false;
                    if(letra=='0'||letra=='1'||letra=='2'||letra=='3'||letra=='4'||letra=='5'||letra=='6'||letra=='7'||letra=='8'||letra=='9')
                    {                
                        mensaje("PORFAVOR INGRESE UN NOMBRE");
                        numEncontrado=true;                        
                    }
                } 
                if(numEncontrado==false)
                {
                    break;
                }
            }catch(Exception e){}        
        }while(true);
        return cadena;
    }
    
    public static void instruccion(){
        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.BLACK);
        colorJOP.put("Panel.background",Color.BLACK);
        ImageIcon portada = new ImageIcon("Imagenes/IntroAhorcado.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,portada);
    }
    
        public static void mensaje(String msj)
    {
        JOptionPane.showMessageDialog(null,msj,"ATENCION",1);
    }    
}

