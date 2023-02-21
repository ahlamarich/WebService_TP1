package ws;
import jakarta.xml.ws.Endpoint;

public class ServerSW {

public static void main(String[] args) {

    Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
    System.out.print("web service déployé sur http://0.0.0.0:9191/");

}
}
