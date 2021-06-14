import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class Server {
    
    public static void main (String [] args){
        try{
            ServerSocket ss = new ServerSocket(1234); 
            System.out.println("Connected...");
            Socket socket = ss.accept();
            System.out.println("Client found");
            
        
            FileInputStream fis = new FileInputStream("/Users/aneledlamini/Desktop/sunset.jpg"); // file to send
            OutputStream os = socket.getOutputStream(); // sending to client

            BufferedImage bImage = ImageIO.read(new File("/Users/aneledlamini/Desktop/sunset.jpg")); // image file to be sent
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(bImage, "jpg", bos );
            byte [] b = bos.toByteArray(); // encoding to bytes

            fis.read(b, 0, b.length); // reading all bytes of file
            os.write(b,0,b.length); // writing all bytes of file to output stream (to be sent to client)
            System.out.println("File sent!");


        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
