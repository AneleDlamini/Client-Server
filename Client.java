import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client{

    public static void main (String [] args){
        try{
            Socket socket = new Socket ("localhost", 1234);
            System.out.println("Client started...");
            InputStream is = socket.getInputStream();
            FileOutputStream fis = new FileOutputStream("/Users/aneledlamini/Desktop/NIS/sunset.jpg"); // where the new file will be saved
            byte b[] = is.readAllBytes(); // reading all bytes of file into array
            is.read(b,0,b.length); //read bytes 
            fis.write(b,0,b.length); // write bytes to new file
            System.out.println("Received!");
                

        }
        catch(IOException e){
            e.printStackTrace();
        }


    }

    
}