package JavaProgram;

import java.net.InetAddress;

public class ConvertingIpToHostName {

    public static void main(String[] args) throws Exception {
        InetAddress ip= InetAddress.getByName("172.28.160.1");

        System.out.println("Host Name: "+ip.getHostName());
    }
}
