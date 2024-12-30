import java.io.IOException;
import java.net.*;

public class UrlConnection {
public static void main(String[] args) throws IOException, MalformedURLException{
    URL url= new URL("https://docs.djangoproject.com/en/5.1/intro/tutorial01");
    System.out.println(url);
    URLConnection urlConnection = (URLConnection) url.openConnection();
    System.out.println(urlConnection);
    System.out.println("getContent()"+urlConnection.getContent());

    System.out.println("getContentLength()"+urlConnection.getContentLength());
    System.out.println("getContentType()"+urlConnection.getContentType());
    System.out.println("getDate()"+urlConnection.getDate());
    System.out.println("getExpiration()"+urlConnection.getExpiration());
    System.out.println("getHeaderField(1)"+urlConnection.getHeaderField(1));
    System.out.println("getHeaderField(\"docs\")"+urlConnection.getHeaderField("docs"));
    System.out.println("getHeaderFieldKey(1)"+urlConnection.getHeaderFieldKey(1));
    System.out.println("getHeaderFields()"+urlConnection.getHeaderFields());
    System.out.println("getLastModified()"+urlConnection.getLastModified());
    // System.out.println("getInputStream()"+urlConnection.getInputStream());
    // System.out.println("getOutputStream())"+urlConnection.getOutputStream()); 

    System.out.println("getContentLengthLong()"+urlConnection.getContentLengthLong());
    System.out.println("getRequestProperty(null)"+urlConnection.getRequestProperty(null));
    System.out.println("getAllowUserInteraction()"+urlConnection.getAllowUserInteraction());
    System.out.println("getConnectTimeout()"+urlConnection.getConnectTimeout());
    System.out.println("getContentEncoding())"+urlConnection.getContentEncoding()); 
    System.out.println("getDefaultUseCaches())"+urlConnection.getDefaultUseCaches()); 
    System.out.println("getDoInput())"+urlConnection.getDoInput()); 
    System.out.println("getDoOutput())"+urlConnection.getDoOutput()); 
    System.out.println("getReadTimeout())"+urlConnection.getReadTimeout()); 
    System.out.println("getRequestProperty(null))"+urlConnection.getRequestProperty(null)); 
    System.out.println("getUseCaches())"+urlConnection.getUseCaches()); 
    System.out.println("getClass())"+urlConnection.getClass()); 
    System.out.println("getPermission())"+urlConnection.getPermission()); 
    // System.out.println("getRequestProperties())"+urlConnection.getRequestProperties()); 
    System.out.println("getURL())"+urlConnection.getURL()); 
    
}    
}
