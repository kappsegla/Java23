package org.example.network;

import java.io.*;
import java.net.Socket;
import java.net.SocketAddress;

public class Client {
    public static void main(String[] args) {

        //Ansluta sig till en server, behöver veta
        //Serverns ip address : 127.0.0.1, 192.168.1.179, localhost
        //Serverns port nummer 16-bit: 6000

        try (Socket socket = new Socket("192.168.1.179",6000)) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("Hello from client!\n");
            bufferedWriter.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String text = bufferedReader.readLine();
            System.out.println(text);
        }catch (IOException e){

        }


    }
}
