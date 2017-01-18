/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitustyokehittyneet;

/**
 *
 * @author Skosko
 */
public class FrameRunnable  implements Runnable{
    public void run()
    {
        
        //Käynnistämme main windowin josta suoritamme kaikki muut kamat. Tämä suoritetaan täällä vain
        //Jotta saan käynnistää sen threadissa. Käsittääkseni tämä ei kuitenkaan tee mitään 
        //vaan se käynnistyy sinänsä samalla tavalla kuin se käynnistyisi ilmankin thread menettelyä
        //koska kaikki toiminta kuitenkin tapahtuu sen kautta ja tämän loppuessa ohjelma loppuu
        Mainwindow window = new Mainwindow();    
        window.setVisible(true);
    }

}
