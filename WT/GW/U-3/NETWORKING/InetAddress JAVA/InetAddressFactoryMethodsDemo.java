import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressFactoryMethodsDemo {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost);
            
            String hostAddress = localHost.getHostAddress();
            System.out.println("Host Address : " + hostAddress);
            System.out.println("Host Address (toString) : " + hostAddress.toString());
            
            String hostName = localHost.getHostName();
            System.out.println("Host Name : " + hostName);
            System.out.println("Host Name (toString) : " + hostName.toString());
            
            // Resolving an IP address (or hostname)
            localHost = InetAddress.getByName("192.168.1.6");
            System.out.println("By IP: " + localHost);

            // Resolving a domain name
            InetAddress address = InetAddress.getByName("192.168.1.6");
            System.out.println("By Domain: " + address);
            
            InetAddress[] addresses = InetAddress.getAllByName("192.168.1.6");
            System.out.println("By Byte Array: " + addresses);
            for (InetAddress add : addresses) {
                System.out.println(add);
            }

            System.out.println(hostAddress.equals(address));

            // Displaying the raw address bytes

            byte[] addressBytes = address.getAddress();
            System.out.print("Address Bytes: ");
            for (byte addressByte : addressBytes) {
                System.out.print((addressByte & 0xFF) + " ");
            }
            System.out.println();

        }
    
        catch (UnknownHostException e) {
            System.err.println("Unable to resolve host: " + e.getMessage());
        }
    }
}
