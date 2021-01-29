package dirtRally20.telem;

public class Car {
    private int velocity;
    private int gear;
    private int RPMs;

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setRPMs(int RPMs) {
        this.RPMs = RPMs;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getGear() {
        return gear;
    }

    public int getRPMs() {
        return RPMs;
    }

    public int getVelocity() {
        return velocity;
    }
}
