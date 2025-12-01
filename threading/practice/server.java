package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server waiting for client");
        Socket socket = serverSocket.accept();
        System.out.println("client connected");

        new Thread(() -> {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())) ;
                String msg;
                while((msg = in.readLine()) != null){
                    if(msg.equalsIgnoreCase("exit")){
                        System.out.println("Client Disconneted");
                        socket.close();
                    }
                    System.out.println("Client: " + msg);
                }
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }).start();


        new Thread(() -> {
            try {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true) ;
                BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)) ;
                String msg;
                while(true){
                    System.out.print("Server: ");
                    msg = keyboard.readLine();
                    out .println(msg);
                    if(msg.equalsIgnoreCase("exit")){
                        System.out.println("Client Disconneted");
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
