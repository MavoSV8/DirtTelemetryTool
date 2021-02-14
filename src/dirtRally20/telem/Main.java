package dirtRally20.telem;

public class Main {

    public static void main(String[] args) {
        GetPacketFromGame getData = new GetPacketFromGame();
        //Scanner input = new Scanner(System.in);
        Car car = new Car();
        GUI gui = new GUI();
        gui.createWindow("Telemetry tool",700,400);
        gui.setDefaults();
        boolean end = true;
        int i = 0;
        byte dataBuffer[];


        while (end == true) {
            dataBuffer = getData.receiveData();

            car.setVelocity(Float.intBitsToFloat(dataBuffer[31] << 24 | (dataBuffer[30] & 0xFF) << 16 | (dataBuffer[29] & 0xFF) << 8 | (dataBuffer[28] & 0xFF)));
            car.setRPMs(Float.intBitsToFloat(dataBuffer[151] << 24 | (dataBuffer[150] & 0xFF) << 16 | (dataBuffer[149] & 0xFF) << 8 | (dataBuffer[148] & 0xFF)));
            car.setGear(Float.intBitsToFloat(dataBuffer[135] << 24 | (dataBuffer[134] & 0xFF) << 16 | (dataBuffer[133] & 0xFF) << 8 | (dataBuffer[132] & 0xFF)));
            car.setStageTime(Float.intBitsToFloat(dataBuffer[7] << 24 | (dataBuffer[6] & 0xFF) << 16 | (dataBuffer[5] & 0xFF) << 8 | (dataBuffer[4] & 0xFF)));
            car.setMaxRPM(Float.intBitsToFloat(dataBuffer[255] << 24 | (dataBuffer[254] & 0xFF) << 16 | (dataBuffer[253] & 0xFF) << 8 | (dataBuffer[252] & 0xFF)));

            car.setClutch(Float.intBitsToFloat(dataBuffer[131] << 24 | (dataBuffer[130] & 0xFF) << 16 | (dataBuffer[129] & 0xFF) << 8 | (dataBuffer[128] & 0xFF)));
            car.setAccelerator(Float.intBitsToFloat(dataBuffer[119] << 24 | (dataBuffer[118] & 0xFF) << 16 | (dataBuffer[117] & 0xFF) << 8 | (dataBuffer[116] & 0xFF)));
            car.setBrake(Float.intBitsToFloat(dataBuffer[127] << 24 | (dataBuffer[126] & 0xFF) << 16 | (dataBuffer[125] & 0xFF) << 8 | (dataBuffer[124] & 0xFF)));

            car.setSuspensionFL(Float.intBitsToFloat(dataBuffer[79] << 24 | (dataBuffer[78] & 0xFF) << 16 | (dataBuffer[77] & 0xFF) << 8 | (dataBuffer[76] & 0xFF)));
            car.setSuspensionFR(Float.intBitsToFloat(dataBuffer[83] << 24 | (dataBuffer[82] & 0xFF) << 16 | (dataBuffer[81] & 0xFF) << 8 | (dataBuffer[80] & 0xFF)));
            car.setSuspensionRL(Float.intBitsToFloat(dataBuffer[71] << 24 | (dataBuffer[70] & 0xFF) << 16 | (dataBuffer[69] & 0xFF) << 8 | (dataBuffer[68] & 0xFF)));
            car.setSuspensionRR(Float.intBitsToFloat(dataBuffer[75] << 24 | (dataBuffer[74] & 0xFF) << 16 | (dataBuffer[73] & 0xFF) << 8 | (dataBuffer[72] & 0xFF)));

            car.setTiresFL(Float.intBitsToFloat(dataBuffer[111] << 24 | (dataBuffer[110] & 0xFF) << 16 | (dataBuffer[109] & 0xFF) << 8 | (dataBuffer[108] & 0xFF)));
            car.setTiresFR(Float.intBitsToFloat(dataBuffer[115] << 24 | (dataBuffer[114] & 0xFF) << 16 | (dataBuffer[113] & 0xFF) << 8 | (dataBuffer[112] & 0xFF)));
            car.setTiresRL(Float.intBitsToFloat(dataBuffer[103] << 24 | (dataBuffer[102] & 0xFF) << 16 | (dataBuffer[101] & 0xFF) << 8 | (dataBuffer[100] & 0xFF)));
            car.setTiresRR(Float.intBitsToFloat(dataBuffer[107] << 24 | (dataBuffer[106] & 0xFF) << 16 | (dataBuffer[105] & 0xFF) << 8 | (dataBuffer[104] & 0xFF)));

            car.setBrakeFL(Float.intBitsToFloat(dataBuffer[215] << 24 | (dataBuffer[214] & 0xFF) << 16 | (dataBuffer[213] & 0xFF) << 8 | (dataBuffer[212] & 0xFF)));
            car.setBrakeFR(Float.intBitsToFloat(dataBuffer[219] << 24 | (dataBuffer[218] & 0xFF) << 16 | (dataBuffer[217] & 0xFF) << 8 | (dataBuffer[216] & 0xFF)));
            car.setBrakeRL(Float.intBitsToFloat(dataBuffer[207] << 24 | (dataBuffer[206] & 0xFF) << 16 | (dataBuffer[205] & 0xFF) << 8 | (dataBuffer[204] & 0xFF)));
            car.setBrakeRR(Float.intBitsToFloat(dataBuffer[211] << 24 | (dataBuffer[210] & 0xFF) << 16 | (dataBuffer[209] & 0xFF) << 8 | (dataBuffer[208] & 0xFF)));


            gui.setClutchBar(car.getClutch());
            gui.setThrottleBar(car.getAccelerator());
            gui.setBrakeBar(car.getBrake());
            gui.setVelocity((int)(car.getVelocity()*3.6));
            gui.setRPMs((int)(car.getMaxRPM()*10),(int)(car.getRPMs()*10));
            gui.setGear((int)car.getGear());
            gui.setStageTime(car.getStageTime());
            gui.setBrakeTemperature((int)car.getBrakeFL(),(int)car.getBrakeFR(),(int)car.getBrakeRL(),(int)car.getBrakeRR());
            gui.setSuspensionPosition((int)car.getSuspensionFL(),(int)car.getSuspensionFR(),(int)car.getSuspensionRL(),(int)car.getSuspensionRR());
            gui.setTireVelo((int)(car.getTiresFL()*3.6),(int)(car.getTiresFR()*3.6),(int)(car.getTiresRL()*3.6),(int)(car.getTiresRR()*3.6));
           /* if (input.nextInt() == 1) {
                end = false;
            }*/
        }
        getData.close();

    }
}
