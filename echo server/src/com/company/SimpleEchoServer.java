package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleEchoServer {

    public static void main(String[] args) {
        System.out.println("Simple Echo Server");

        try(ServerSocket serverSocket = new ServerSocket(6000))
        {
            System.out.println("Waiting for connection...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected to client");
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
