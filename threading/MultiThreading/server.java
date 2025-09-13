package MultiThreading;
import java.io.*;

import java.net.*;

class thread extends Thread {
    private Socket socket;
    thread(Socket socket) {
        this.socket = socket;
    }
    public void run(){
        try{
        BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter outputToClient = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String msgFromClient, msgToClient;

        while (true) {

            msgFromClient = inputFromClient.readLine();

            if (msgFromClient.equalsIgnoreCase("exit")) break;

            System.out.println("Client: " + msgFromClient);

            System.out.print("You: ");

            msgToClient = keyboard.readLine();

            outputToClient.println(msgToClient);



            if (msgToClient.equalsIgnoreCase("exit")) break;

        }



       

        System.out.println("Server closed.");
        }
        catch(Exception io){}
    }
}

public class server {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8888);

        System.out.println("Server is waiting for connection...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            thread th = new thread(socket);
            th.start(); // agar aik aik karkay karna hai to th.join() ayega start ke baad
            th.join();
        }


    }

}