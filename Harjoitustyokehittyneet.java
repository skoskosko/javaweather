package harjoitustyokehittyneet;
/**
 *
 * @author Skosko
 */
public class Harjoitustyokehittyneet {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Main josta Asetamme urlin sekä aloitamme itse toiminnan omassa threadissaan
        // Myöhemmin käynnistämme threadista threadeja ja threadeja jotka ajavat threadeja.

        Variables variables = new Variables();
        variables.setUrl("http://api.openweathermap.org/data/2.5/forecast?q=Tampere,fi&mode=JSON&units=metric&appid=yourapid");  
        new Thread(new FrameRunnable()).start();
    }


}
