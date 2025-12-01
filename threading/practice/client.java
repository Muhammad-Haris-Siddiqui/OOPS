package practice;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class client {
    public static void main(String args[]) throws Exception{
        Socket socket = new Socket("Localhost", 8888);
        System.out.println("Client connected to server");
        new Thread(() -> {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String mssg;
                while((mssg = in.readLine()) != null){
                    if(mssg.equalsIgnoreCase("exit")){
                        System.out.println("Client Disconected");
                        socket.close();

                    }
                    System.out.println(mssg);
                }
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }).start();
        new Thread(() -> {
            try {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
                String mssg;
                while (true) {
                    System.out.println("You: ");
                    mssg = keyboard.readLine();
                    out.println(mssg);
                    if(mssg.equalsIgnoreCase("exit")){
                        System.out.println("Client Disconected");
                        socket.close();
                        System.exit(0);
                    }
                }
                
            } catch (Exception e) {
                // TODO: handle exception
            }

        }).start();


    }
}
