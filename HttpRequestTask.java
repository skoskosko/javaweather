/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitustyokehittyneet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Skosko
 */



//Täällä haemme itse datan jonka palautamme sitten käsiteltäväksi

public class HttpRequestTask implements Runnable{
        private String url;
    private HttpRequestListener listener;
    
    public HttpRequestTask(String aUrl, HttpRequestListener aListener){
    url = aUrl;
    listener = aListener;
    }

    
public void run() {
        try {
            
                   //Tehdään thread johon lähetetään url jonka se saisi sieltäkin ja tämä että saamme kuuntelijan toimimaan

            //
            System.out.println("getting");
            URL geonamesUrl = new URL(url);
            BufferedReader in = new BufferedReader(
            new InputStreamReader(geonamesUrl.openStream()));
            String httpResponse = "";
            String line;
            
            while( (line = in.readLine()) != null){
                httpResponse += line;
            }
            in.close();
            System.out.println(httpResponse);
            //kuuntelija
            listener.HttpResponseReady(httpResponse);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(HttpRequestTask.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HttpRequestTask.class.getName()).log(Level.SEVERE, null, ex);
        }


}
}
interface HttpRequestListener{
    public void HttpResponseReady(String jsonResponse); 
}