package dirtRally20.telem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GetPacketFromGame getData = new GetPacketFromGame();
        Scanner input = new Scanner(System.in);

        boolean end = true;

        while (end == true) {

            System.out.println(getData.receiveData());
            if (input.nextInt() == 1) {
                end = false;
            }
        }
            getData.close();

    }
}
