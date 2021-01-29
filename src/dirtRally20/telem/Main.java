package dirtRally20.telem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GetPacketFromGame echo = new GetPacketFromGame();
        Scanner input = new Scanner(System.in);

        boolean end = true;

        while (end == true)

            System.out.println(echo.receiveData("Get telemetry"));
            if(input.nextInt() == 1)
            {
                end = false;
            }
            echo.close();

    }
}
