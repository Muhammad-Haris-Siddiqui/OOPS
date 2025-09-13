// package OOPS;

// import OOPS.iNood;
import oopsPackage.SimpleTCPClient;

public class use {
    public static void main(String[] args) throws Exception{
        // iNood obj = new iNood();
        // obj.setdistance(200);
        // System.out.println("Distance is: " + obj.getdistance());
        SimpleTCPClient.send("localhost", 8888, "Hello from client!");
    }
}
