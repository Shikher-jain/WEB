import java.net.*;

public class URL_Demo {
    public static void main(String[] args) throws MalformedURLException{
        URL url= new URL("https://docs.djangoproject.com/en/5.1/intro/tutorial01");
        System.out.println("Url = "+url);
        System.out.println("Protocol = "+url.getProtocol());
        System.out.println("Host = "+url.getHost());
        System.out.println("Port = "+url.getPort());
        System.out.println("Default Port : "+url.getDefaultPort());
        System.out.println("File Name = "+url.getFile());
        System.out.println("Reference = "+url.getRef());
    }
}
