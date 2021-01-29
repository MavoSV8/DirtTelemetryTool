package dirtRally20.telem;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;

public class GetPacketFromGame {
    private DatagramSocket socket;
    private InetAddress address;

    private byte[] buf = new byte[256];
    private byte[] buf2 = new byte[256];



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
        buf2 = packet.getData();
        //String recieved= new String(packet.getData(), 0,packet.getLength());
        return buf2; //recieved;
    }

    public void close() {
        socket.close();
    }
}
