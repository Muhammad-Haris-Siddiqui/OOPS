package practice;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class client {
    public static void main(String args[]) throws Exception{
        Socket socket = new Socket("localhost" , 8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        Scanner scanner = new Scanner(System.in);
        while(true)

    }
}
