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
public class Variables {
    
   //tehdään hieman muuttujia joita sitten jaellaan myöhemmin 
   
   public static String url;
   public static String city;
   public static String[] date;
   public static String[] temperature;
   public static String[] preassure;
   public static String[] humidity;
   public static String[] description;
   public static String[] direction;
   public static String[] strength;
   public static int count;
    
 
    
    public void setUrl(String a){
        url = a ;
    }
    public static String getUrl(){
    return url;
    }
    
    public void setCity(String a){
        city = a;
    }
    public static String getCity(){
    return city;
    }  

    public void setDate(String[] a){
        date = a;
    }
    public static String[] getDate(){
    return date;
    }     
    
    public void setTemperature(String[] a){
    temperature = a;
    }
    public static String[] getTemperature(){
    return temperature;
    }  
    
    public void setPreassure(String[] a){
    preassure = a;
    }
    public static String[] getPreassure(){
    return preassure;
    }  
 
    public void setHumidity(String[] a){
    humidity = a;
    }
    public static String[] getHumidity(){
    return humidity;
    } 
    
    public void setDescription(String[] a){
    description = a;
    }
    public static String[] getDescription(){
    return description;
    } 
    
    public void setDirection(String[] a){
    direction = a;
    }
    public static String[] getDirection(){
    return direction;
    } 

    public void setStrength(String[] a){
    strength = a;
    }
    public static String[] getStrength(){
    return strength;
    } 
    
    public void setCount(int a){
    count = a ;
    }
    public static int getCount(){
    return count;
    }
    
}
