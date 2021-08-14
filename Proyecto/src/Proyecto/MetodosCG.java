package Proyecto;


import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
public class MetodosCG
{
    public static int nivelfacilDep(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"11","15","12"};
        Object botones2 []={"Tenis","Fútbol Americano","Hockey"};
        Object botones3 []={"Liverpool", "Portugal","Francia"};
        Object botones4 []={"Huesca", "Barcelona","Bayer Munich"};
        Object botones5 []={"Tenis", "Ciclismo","Natación"};
        UIManager colorJOP=new UIManager();
        colorJOP.put("Label.font", new Font("Arial Black", Font.BOLD,20));

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Facil/1.jpg"), botones1,botones1[0]);
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

            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Facil/2.jpg"), botones2,botones2[0]);
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

            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Facil/3.jpg"), botones3,botones3[0]);
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

            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Facil/4.png"), botones4,botones4[0]);
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

            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCIONARCADE-PROG.ESTRUCTURADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Facil/5.png"), botones5,botones5[0]);
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
            }
        }
        puntaje += vidas * 20;
        mensaje(puntaje);
        return puntaje;
    } 

    public static int nivelintermedioDep(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"Touchdown","Strike","Gol"};
        Object botones2 []={"Lazio","Villareal","Sevilla"};
        Object botones3 []={"Cristian Coleman", "Charles Allie","Usain Bolt"};
        Object botones4 []={"Lewis Hamilton", "Sebastian Vettel","Sergio Perez"};
        Object botones5 []={"Canelo Alvarez", "Mike Tyson","Manny Pacquiao"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Intermedio/1.png"), botones1,botones1[0]);
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
                        new ImageIcon("Imagenes/Deporte/Intermedio/2.png"), botones2,botones2[0]);
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
            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Intermedio/3.png"), botones3,botones3[0]);
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
            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Intermedio/4.png"), botones4,botones4[0]);
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
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Intermedio/5.png"), botones5,botones5[0]);
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

    public static int niveldificilDep(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"Cabaddi","Criquet","Tenis de Mesa"};
        Object botones2 []={"Cristiano Ronaldo","Pele","Ronaldinho"};
        Object botones3 []={"Kylian Mbappe", "Antoine Griezmann","Erling Haaland"};
        Object botones4 []={"Fútbol", "Voleibol","Baloncesto"};
        Object botones5 []={"Al Masudi", "JOH","James Naismith"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Dificil/1.png"), botones1,botones1[0]);
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
                        new ImageIcon("Imagenes/Deporte/Dificil/2.png"), botones2,botones2[0]);
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
            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Dificil/3.png"), botones3,botones3[0]);
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
            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Dificil/4.png"), botones4,botones4[0]);
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
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Deporte/Dificil/5.png"), botones5,botones5[0]);
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

    public static int nivelfacilMus(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"La nota do ","La clave de sol","La clave de do "};
        Object botones2 []={"5 lineas y 4 espacios ","5 lineas y 5 espacios ","5 lineas y 6 espacios ","6 lineas y 5 espacios "};
        Object botones3 []={"Mozart ", "Bach ","Beethoven ","Vivaldi "};
        Object botones4 []={"Johann Sebastian Bach ","Antonio Vivaldi ","Johann Pachelbel ","Joseph Haydn "};
        Object botones5 []={"Semi-corchea", "Corchea","Fusa","Semi-fusa"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Musica/Facil/1.png"), botones1,botones1[0]);
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
                        new ImageIcon("Imagenes/Musica/Facil/2.png"), botones2,botones2[0]);
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

            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Musica/Facil/3.jpg"), botones3,botones3[0]);
                if(selection == 3){
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
                        new ImageIcon("Imagenes/Musica/Facil/4.jpg"), botones4,botones4[0]);
                if(selection == 3){
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
                        new ImageIcon("Imagenes/Musica/Facil/5.png"), botones5,botones5[0]);
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
            }
        }
        puntaje += vidas * 20;
        mensaje(puntaje);
        return puntaje;
    } 

    public static int nivelintermedioMus(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"Saxofón ","Fagot ","Piano ","Arpa"};
        Object botones2 []={"Tuba ","Saxofón ","Trombón ","Fliscorno "};
        Object botones3 []={"Nueva Orleans ","Nueva York ","París ","Memphis "};
        Object botones4 []={"Saxofón ","Flauta travesera ","Fagot ","Trompeta "};
        Object botones5 []={"Los espacios entre notas de una pieza musical ","El ritmo de una pieza musical ","El tempo de duración de una pieza musical ","La velocidad con que debe interpretarse una pieza musical"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Musica/Intermedio/1.jpg"), botones1,botones1[0]);
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
                        new ImageIcon("Imagenes/Musica/Intermedio/2.png"), botones2,botones2[0]);
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
            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Musica/Intermedio/3.jpg"), botones3,botones3[0]);
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
            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Musica/Intermedio/4.jpg"), botones4,botones4[0]);
                if(selection == 3){
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
                        new ImageIcon("Imagenes/Musica/Intermedio/5.jpg"), botones5,botones5[0]);
                if(selection == 3){
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

    public static int niveldificilMus(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"Una canción de Elvis Presley ","Una canción de Chuck Berry ","Una canción de Little Richard ","Una canción de Bill Haley "};
        Object botones2 []={"Kurt Cobain","Jim Morrison ","John Lennon ","Freddie Mercury "};
        Object botones3 []={"Finales de los 50/principios de los 60 ","Finales de los 60/principios de los 70 ","Finales de los 70/principios de los 80 ","Finales de los 80/principios de los 90 "};
        Object botones4 []={"Verdadero","Falso"};
        Object botones5 []={"5","6","4","8"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Musica/Dificil/1.jpg"), botones1,botones1[0]);
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
            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Musica/Dificil/2.jpg"), botones2,botones2[0]);
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
            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Musica/Dificil/3.jpg"), botones3,botones3[0]);
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
                        new ImageIcon("Imagenes/Musica/Dificil/4.jpg"), botones4,botones4[0]);
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
                        new ImageIcon("Imagenes/Musica/Dificil/5.jpg"), botones5,botones5[0]);
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

    public static int nivelfacilHist(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"Cristóbal Colon","Hernán Cortez","José Cecilio del Valle "};
        Object botones2 []={"1492 ","1542 ","1502 "};
        Object botones3 []={"Alemania ","Austria ","Suiza "};
        Object botones4 []={"Dionisio de Herrera","Lempira ","Francisco Morazán "};
        Object botones5 []={"1969 ","1945 ","1915 "};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Facil/1.jpg"), botones1,botones1[0]);
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

            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Facil/2.jpg"), botones2,botones2[0]);
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

            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Facil/3.jpg"), botones3,botones3[0]);
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
                        new ImageIcon("Imagenes/Historia/Facil/4.jpg"), botones4,botones4[0]);
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
                        new ImageIcon("Imagenes/Historia/Facil/5.jpg"), botones5,botones5[0]);
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

    public static int nivelintermedioHist(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"Cuzco ","Lima ","Buenos Aires "};
        Object botones2 []={"Augusto Coello","Carlos Hartling","Ramon Rosa "};
        Object botones3 []={"Tomas Edison","George Washington ","John Adams "};
        Object botones4 []={"450 d.c.","256 a.c.","476 d.c. "};
        Object botones5 []={"30 de octubre de 1880","22 de julio 1578","15 de septiembre de 1821 "};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Intermedio/1.jpg"), botones1,botones1[0]);
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
                        new ImageIcon("Imagenes/Historia/Intermedio/2.jpg"), botones2,botones2[0]);
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
            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Intermedio/3.jpg"), botones3,botones3[0]);
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
                        new ImageIcon("Imagenes/Historia/Intermedio/4.jpg"), botones4,botones4[0]);
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
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Intermedio/5.jpg"), botones5,botones5[0]);
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
            }
        }
        puntaje += vidas * 40;
        mensaje(puntaje);
        return puntaje;
    }

    public static int niveldificilHist(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"Juan Manuel Gálvez","Dionisio de Herrera","Alberto Membreño "};
        Object botones2 []={"Aztecas ","Mayas ","Tolteca "};
        Object botones3 []={"Carlos IV","Luis XVI","Felipe VI"};
        Object botones4 []={"Cerdeña ", "Córcega ","Santa Elena"};
        Object botones5 []={"Leningrado ", "Stalingrado","Petroburgo "};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Dificil/1.jpg"), botones1,botones1[0]);
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

            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Dificil/2.jpg"), botones2,botones2[0]);
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

            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Dificil/3.jpg"), botones3,botones3[0]);
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
                        new ImageIcon("Imagenes/Historia/Dificil/4.jpg"), botones4,botones4[0]);
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
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Historia/Dificil/5.jpg"), botones5,botones5[0]);
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
            }
        }
        puntaje += vidas * 60;
        mensaje(puntaje);
        return puntaje;
    }

    public static int nivelfacilCien(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"11","15","12"};
        Object botones2 []={"6","18","15"};
        Object botones3 []={"Quimica", "Criminalístic a","Forense"};
        Object botones4 []={"Estroncion", "Estaño","Escandio"};
        Object botones5 []={"Venecia", "Roma","Campania"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Facil/1.png"), botones1,botones1[0]);
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

            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Facil/2.png"), botones2,botones2[0]);
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
                        new ImageIcon("Imagenes/Ciencia/Facil/3.png"), botones3,botones3[0]);
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

            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Facil/4.png"), botones4,botones4[0]);
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

            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCIONARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Facil/5.png"), botones5,botones5[0]);
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
            }
        }
        puntaje += vidas * 20;
        mensaje(puntaje);
        return puntaje;
    } 

    public static int nivelintermedioCien(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"Tibia ","Fémur  ","Peroné   "};
        Object botones2 []={"Célula animal ","Célula Humana ","Célula vegetal "};
        Object botones3 []={"Hidróxido de aluminio  ","Bromuro de aluminio   ","Citrato de aluminio  "};
        Object botones4 []={"2","6","9 "};
        Object botones5 []={"Escuchar el corazón","Escuchar sonidos que genera el cuerpo ","Escuchar los pulmones "};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Intermedio/1.png"), botones1,botones1[0]);
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
            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Intermedio/2.png"), botones2,botones2[0]);
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
                        new ImageIcon("Imagenes/Ciencia/Intermedio/3.png"), botones3,botones3[0]);
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
            } else if(aleatorio[x] == 4){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Intermedio/4.png"), botones4,botones4[0]);
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
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Intermedio/5.png"), botones5,botones5[0]);
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
            }
        }
        puntaje += vidas * 40;
        mensaje(puntaje);
        return puntaje;
    }

    public static int niveldificilCien(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1 []={"A, F, E, K  ","A, E, C, K ","A, D, E, K "};
        Object botones2 []={"Masa ","Peso ","Velocidad  "};
        Object botones3 []={"Entre 10 y 12 años  ","Entre 7 y 10 años  ","Entre 8 y 12  "};
        Object botones4 []={"(x+2) (x+3)   ", "(x+5) (x-3)  ","(x+5) (x+3) "};
        Object botones5 []={"Duodeno  ", "Yuyeno","Colon "};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Dificil/1.png"), botones1,botones1[0]);
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

            } else if(aleatorio[x] == 2){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Dificil/2.png"), botones2,botones2[0]);
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

            } else if(aleatorio[x] == 3){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Dificil/3.png"), botones3,botones3[0]);
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
                        new ImageIcon("Imagenes/Ciencia/Dificil/4.png"), botones4,botones4[0]);
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
            } else if(aleatorio[x] == 5){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Ciencia/Dificil/5.png"), botones5,botones5[0]);
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
            }
        }
        puntaje += vidas * 60;
        mensaje(puntaje);
        return puntaje;
    }

    public static int nivelfacilMeme(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1[] = {"Deadpool","¿Donde estan las rubias?","Rapido y Furioso"};
        Object botones2[] = {"Peppa Pig","Tom","Jerry"};
        Object botones3[] = {"Iron Man","Avenger","Hulk"};
        Object botones4[] = {"Ahh c´mamo","Wey ya","Obligame prro"};
        Object botones5[] = {"Homero","Goku","Bart"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ARCADE-PROG.ORIENTADA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Memes/Facil/1.jpg"), botones1,botones1[0]);
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
                        new ImageIcon("Imagenes/Memes/Facil/2.jpg"), botones2,botones2[0]);
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
                        new ImageIcon("Imagenes/Memes/Facil/3.jpg"), botones3,botones3[0]);
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
                        new ImageIcon("Imagenes/Memes/Facil/4.jpg"), botones4,botones4[0]);
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
                        new ImageIcon("Imagenes/Memes/Facil/5.jpg"), botones5,botones5[0]);
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

    public static int nivelintermedioMeme(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1[] = {"Español","Argentino","Colombiano"};
        Object botones2[] = {"Vin Diesel","Will Smith","Leonardo Dicaprio"};
        Object botones3[] = {"Europa","Africa","America"};
        Object botones4[] = {"Cheems","Gufy","Firulais"};
        Object botones5[] = {"Cazadores de Tesoros","Quien da mas?","El Precio de la Historia"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Memes/Intermedio/1.jpg"), botones1,botones1[0]);
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
                        new ImageIcon("Imagenes/Memes/Intermedio/2.jpg"), botones2,botones2[0]);
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
                        new ImageIcon("Imagenes/Memes/Intermedio/3.jpg"), botones3,botones3[0]);
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
                        new ImageIcon("Imagenes/Memes/Intermedio/4.jpg"), botones4,botones4[0]);
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
                        new ImageIcon("Imagenes/Memes/Intermedio/5.jpg"), botones5,botones5[0]);
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

    public static int niveldificilMeme(int[]aleatorio){
        int puntaje = 0;
        int vidas = 3; 

        Object botones1[] = {"Mia Talerico","Katherine Smith","Norma Brizuela"};
        Object botones2[] = {"Taylor Swith","Ariana Grande","Victoria Pedretti"};
        Object botones3[] = {"2019","2020","2021"};
        Object botones4[] = {"Burger King","Mc Donals","Firulais"};
        Object botones5[] = {"Christopher Hemsworth ","Robert Downey Jr.?","Chris Evans"};

        for(int x = 0; x < 5; x++){
            if(aleatorio[x] == 1){
                int selection = JOptionPane.showOptionDialog(null,"","ATENCION",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
                        new ImageIcon("Imagenes/Memes/Dificil/1.jpg"), botones1,botones1[0]);
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
                        new ImageIcon("Imagenes/Memes/Dificil/2.jpg"), botones2,botones2[0]);
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
                        new ImageIcon("Imagenes/Memes/Dificil/3.jpg"), botones3,botones3[0]);
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
                        new ImageIcon("Imagenes/Memes/Dificil/4.jpg"), botones4,botones4[0]);
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
                        new ImageIcon("Imagenes/Memes/Dificil/5.jpg"), botones5,botones5[0]);
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

    public static void mensaje(int puntaje){
        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.black);
        colorJOP.put("Panel.background", new ColorUIResource(245, 81, 95));

        ImageIcon GameOver = new ImageIcon("Imagenes/Adivinanzas/puntaje.png");
        JOptionPane.showMessageDialog(null,"Su puntaje total es de: "+puntaje,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,GameOver);
        // JOptionPane.showMessageDialog(null,"Su puntaje total es de: "+puntaje);
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
    
    public static void instruccion(){
        UIManager colorJOP=new UIManager();
        colorJOP.put("OptionPane.background",Color.BLACK);
        colorJOP.put("Panel.background",Color.BLACK);
        ImageIcon portada = new ImageIcon("Imagenes/IntroCG.gif");
        JOptionPane.showMessageDialog(null,null,"ARCADE-PROG.ORIENTADA",JOptionPane.INFORMATION_MESSAGE,portada);
    }
}
