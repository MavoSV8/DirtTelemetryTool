package dirtRally20.telem;

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
            car.setVelocity(ByteBuffer.wrap(Arrays.copyOfRange(dataBuffer, 28, 32)).getFloat());
            System.out.println(car.getVelocity());
           /* if (input.nextInt() == 1) {
                end = false;
            }*/
        }
        getData.close();

    }
}
