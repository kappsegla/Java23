package org.example.network;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

public class Client {
    public static void main(String[] args) {

        //Ansluta sig till en server, behöver veta
        //Serverns ip address : 127.0.0.1, 192.168.1.179, localhost
        //Serverns port nummer 16-bit: 6000

        try (Socket socket = new Socket("192.168.1.179",6000)) {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeUTF("Hello there from client!");
            outputStream.flush();
            ObjectInputStream inputStream =  new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
            String text = inputStream.readUTF();
            System.out.println(text);

        }catch (IOException e){

        }


    }
}
