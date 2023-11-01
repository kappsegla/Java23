package org.example.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(6000)) {

            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread.ofVirtual().start(() -> handleConnection(clientSocket));
            }
        } catch (IOException e) {
            System.out.println("Network error: " + e.getMessage());
        }
    }

    private static void handleConnection(Socket clientSocket) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(clientSocket.getInputStream()));

            String text = null;
            text = inputStream.readUTF();

            System.out.println(text);

            ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            outputStream.writeUTF("Hello there");
            outputStream.flush();
        } catch (IOException e) {

        }
    }
}
