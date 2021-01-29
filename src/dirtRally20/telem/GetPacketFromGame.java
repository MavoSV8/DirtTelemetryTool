package dirtRally20.telem;

import java.io.IOException;
import java.net.*;

public class GetPacketFromGame {
    private DatagramSocket socket;
    private InetAddress address;

    private byte[] buf = new byte[256];


    public GetPacketFromGame() {
        try {
            socket = new DatagramSocket(20777);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            address = InetAddress.getByName("localhost");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public byte[] receiveData() {
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        try {
            socket.receive(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        buf = packet.getData();
        return buf;
    }

    public void close() {
        socket.close();
    }
}
