package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[65508];

        InetAddress address = InetAddress.getByName("jenkov.com");

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 9000);

        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.send(packet);
        datagramSocket.close();
    }
    
    
}
