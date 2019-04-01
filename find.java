

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class find {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a site name");
        String site = sc.nextLine();
        try {
            InetAddress ip = InetAddress.getByName(site);
            System.out.println("The IP address is " + ip);
        } catch (UnknownHostException u) {
            System.out.println("Website not found");
        }

    }
    
}