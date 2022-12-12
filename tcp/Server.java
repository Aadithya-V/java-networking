package tcp;

import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(9000);

        
        Socket clientSocket = serverSocket.accept();
        InputStream in = clientSocket.getInputStream();
        OutputStream out = clientSocket.getOutputStream();  
        
        serverSocket.close();
    }
}
