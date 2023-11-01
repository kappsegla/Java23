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
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String text = bufferedReader.readLine();
            System.out.println(text);

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            bufferedWriter.write("Hello from server!\n");
            bufferedWriter.flush();
        } catch (IOException e) {

        }
    }
}
