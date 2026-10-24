package Networking.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer1 {

    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket();

        String msg = "Hello from UDP client";
        byte[] bt = msg.getBytes();

        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(
            bt, bt.length, ip, 4445
        );

        socket.send(packet);

        byte[] buffer = new byte[256];
        DatagramPacket responsePacket =
            new DatagramPacket(buffer, buffer.length);

        socket.receive(responsePacket);

        String response = new String(
            responsePacket.getData(),
            0,
            responsePacket.getLength()
        );

        System.out.println("Server Response: " + response);

        socket.close();
    }
}