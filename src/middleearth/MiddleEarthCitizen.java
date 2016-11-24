package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.CanNotRideException;
import middleearth.Race;

public class MiddleEarthCitizen {
    private String name;
    private int height;
    private Race race;
    public int power;
    static String origin = "Средиземье";

    static String getCountryOrigin() {
        return origin;
    }

    public MiddleEarthCitizen() {
    }

    public MiddleEarthCitizen(String name, int height, int power) {
        this.name = name;
        this.height = height;
        this.power = power;
    }

    public MiddleEarthCitizen(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public double heightToMeters() {
        return (double)this.getHeight() / 100.0D;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height > 0?height:-1 * height;
    }

    public String toString() {
        String str = this.name + " " + this.height + " " + this.power;
        return str;
    }

    public void Ride() throws CanNotRideException {
    }

    public boolean firstStrike() {
        return false;
    }
}
