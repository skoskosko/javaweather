/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitustyokehittyneet;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import org.json.*;
/**
 *
 * @author Skosko
 */
public class runner implements HttpRequestListener {
    public runner(){
        
    new Thread(new HttpRequestTask(Variables.getUrl(),this)).start(); 
    
    }
    
    

  @Override
    public void HttpResponseReady(String httpResponse){
//kuuntelija joka käynnistyy kun get on saatu valmiiksi
   
    Variables variables = new Variables();
    JSONObject mainJson = new JSONObject(httpResponse);
    JSONObject places = mainJson.getJSONObject("city");
    String city = places.getString("name");
    JSONArray foo = mainJson.getJSONArray("list");
    String[] date = new String[foo.length()];
    String[] temperature = new String[foo.length()];
    String[] preassure = new String[foo.length()];
    String[] humidity = new String[foo.length()];
    String[] description = new String[foo.length()];
    String[] direction = new String[foo.length()];
    String[] strength = new String[foo.length()];
    
    
    String printout = city+"\n" ;
    for(int i = 0; i <foo.length();i++){
       JSONObject bar =  foo.getJSONObject(i); 
       date[i] =  bar.getString("dt_txt");
       JSONObject mainobject = bar.getJSONObject("main");
       temperature[i] = String.valueOf(mainobject.getDouble("temp"));
       preassure[i] = String.valueOf(mainobject.getDouble("pressure"));
       humidity[i] = String.valueOf(mainobject.getDouble("humidity"));
       JSONObject windobject = bar.getJSONObject("wind");
       direction[i] = String.valueOf(windobject.getDouble("deg"));
       strength[i] = String.valueOf(windobject.getDouble("speed"));
       JSONArray weather = bar.getJSONArray("weather");
       description[i] = weather.getJSONObject(0).getString("description");  
    }
    variables.setCity(city);
    variables.setDate(date);
    variables.setTemperature(temperature);
    variables.setPreassure(preassure);
    variables.setHumidity(humidity);
    variables.setDescription(description);
    variables.setDirection(direction);
    variables.setStrength(strength);
    variables.setCount(foo.length());
    //TÄhän kohtaan yritin saada automaattista päivitystä kun haku suoritetaan mutta koska maailma ei ole reilu
    //Olisi minun pitänyt tehdä oma kuuntelija tälle joka olisi vaatinut erilaisia kikkailuita 
    //mutta en turhaan kikkaillut kun en alusta asti ollut ymmärtänyt sitä tehdä
    //Mainwindow window = new Mainwindow();   
    //System.out.println("runner done");
    //window.firstItems();
    
    }
    
    
    
}
