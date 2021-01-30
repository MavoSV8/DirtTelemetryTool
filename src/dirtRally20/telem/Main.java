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
        boolean end = true;
        int i = 0;
        byte dataBuffer[];
        while (end == true) {
            dataBuffer = getData.receiveData();

            car.setVelocity(Float.intBitsToFloat(dataBuffer[31] << 24 | (dataBuffer[30] & 0xFF) << 16 | (dataBuffer[29] & 0xFF) << 8 | (dataBuffer[28] & 0xFF)));
            car.setRPMs(Float.intBitsToFloat(dataBuffer[231] << 24 | (dataBuffer[230] & 0xFF) << 16 | (dataBuffer[229] & 0xFF) << 8 | (dataBuffer[228] & 0xFF)));
            car.setGear(Float.intBitsToFloat(dataBuffer[141] << 24 | (dataBuffer[140] & 0xFF) << 16 | (dataBuffer[139] & 0xFF) << 8 | (dataBuffer[138] & 0xFF)));
            //car.setVelocity(ByteBuffer.wrap(Arrays.copyOfRange(dataBuffer, 28, 32)).getFloat());
            System.out.print((int)(car.getVelocity()*3.6) + "  ");
            System.out.print(car.getRPMs() + "    ");
            System.out.print(car.getGear() + " ");
            System.out.print("\r");
            //System.out.flush();
           /* if (input.nextInt() == 1) {
                end = false;
            }*/
        }
        getData.close();

    }
}
