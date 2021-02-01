package dirtRally20.telem;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GetPacketFromGame getData = new GetPacketFromGame();
        //Scanner input = new Scanner(System.in);
        Car car = new Car();
        GUI gui = new GUI();
        gui.createWindow("Telemetry tool",768,432);
        boolean end = true;
        int i = 0;
        byte dataBuffer[];


        while (end == true) {
            dataBuffer = getData.receiveData();

            car.setVelocity(Float.intBitsToFloat(dataBuffer[31] << 24 | (dataBuffer[30] & 0xFF) << 16 | (dataBuffer[29] & 0xFF) << 8 | (dataBuffer[28] & 0xFF)));
            car.setRPMs(Float.intBitsToFloat(dataBuffer[151] << 24 | (dataBuffer[150] & 0xFF) << 16 | (dataBuffer[149] & 0xFF) << 8 | (dataBuffer[148] & 0xFF)));
            car.setGear(Float.intBitsToFloat(dataBuffer[135] << 24 | (dataBuffer[134] & 0xFF) << 16 | (dataBuffer[133] & 0xFF) << 8 | (dataBuffer[132] & 0xFF)));
            gui.setVelocity((int)(car.getVelocity()*3.6));
            gui.setRPMs((int)(car.getRPMs()*10));
            gui.setGear((int)car.getGear());

           /* if (input.nextInt() == 1) {
                end = false;
            }*/
        }
        getData.close();

    }
}
