package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.CanNotRideException;
import middleearth.Horse;
import middleearth.Human;

public class Rohhirim extends Human {
    private Horse horse;

    public Rohhirim(int age, String name, int power) {
        super("Рохан", age, 170, name, power);
    }

    public void Ride() throws CanNotRideException {
        System.out.println("can ride well");
    }

    public Horse getHorse() {
        return this.horse;
    }

    public void setHorse(String c, String b) {
        this.horse = new Horse(c, b);
    }

    public boolean firstStrike() {
        return true;
    }
}
