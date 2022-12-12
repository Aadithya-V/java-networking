package URL;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Download {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        URLConnection urlConnection = url.openConnection();
        //urlConnection.connect(); //implicit from getInputStream below.
        InputStream input = urlConnection.getInputStream();

        int data = input.read();
        while(data != -1){
            System.out.print((char) data);
            data = input.read();
        }
        input.close();
    }
}
