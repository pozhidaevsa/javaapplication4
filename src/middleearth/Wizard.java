package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */


import middleearth.Horse;
import middleearth.MiddleEarthCitizen;

public class Wizard extends MiddleEarthCitizen {
    private Horse horse;

    public Wizard(String name, int height, int power) {
        super(name, height, 20);
        byte power1 = 20;
        this.power = power1;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public boolean firstStrike() {
        return true;
    }

    public Horse getHorse() {
        return this.horse;
    }

    public void setHorse(String c, String b) {
        this.horse = new Horse(c, b);
    }
}