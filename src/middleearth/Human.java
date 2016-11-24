package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.CanNotRideException;
import middleearth.MiddleEarthCitizen;
import middleearth.powerException;

public class Human extends MiddleEarthCitizen {
    String homeTown;
    Integer age;

    public Human(String homeTown, int age, int height, String name, int power) {
        super(name, height, power);
        this.homeTown = homeTown;
        this.age = Integer.valueOf(age);

        try {
            if(power > 8 || power < 7) {
                throw new powerException("7-8");
            }
        } catch (powerException var7) {
            System.out.println(var7.toString());
            power = 7;
        }

        this.power = power;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public void setAge(int age) {
        this.homeTown = this.homeTown;
    }

    public int getAge() {
        return this.age.intValue();
    }

    public String toString() {
        String str = super.toString() + " " + this.homeTown + " " + this.age;
        return str;
    }

    public void Ride() throws CanNotRideException {
        System.out.println("can ride");
    }
}

