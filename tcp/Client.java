package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client{
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket(InetAddress.getLocalHost(), 9000);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        
        out.write("some data".getBytes());
        out.flush();
        out.close();

        int data = in.read();
        in.close();
        socket.close();
        System.out.println(data);
        
    }
}