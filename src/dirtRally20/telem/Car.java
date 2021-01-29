package dirtRally20.telem;

public class Car {
    private unsigned float velocity;
    private unsigned float gear;
    private unsigned float RPMs;

    public void setGear(float gear) {
        this.gear = gear;
    }

    public void setRPMs(float RPMs) {
        this.RPMs = RPMs;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getGear() {
        return gear;
    }

    public float getRPMs() {
        return RPMs;
    }

    public float getVelocity() {
        return velocity;
    }
}
