package MultiThreading;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String args[]) throws IOException 
    {
        // create a socket to connect to the server running on localhost at port number 9090
        Socket socket = new Socket("localhost", 8888);
        
        // Setup input stream to receive data from the server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        // Setup output stream to send data to the server
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // Send message to the server
        Scanner scanner = new Scanner (System.in);
        while(true){
            String Inp = scanner.nextLine();
            if(Inp.equals("quit"))
            break;
            out.println(Inp);
            
            // Receive response from the server
            String response;
            while((response = in.readLine()) != null){
                if (response.equalsIgnoreCase("End")) break;
                System.out.println(response);
            }

        }

        // Close the socket
        socket.close();
    }
}
