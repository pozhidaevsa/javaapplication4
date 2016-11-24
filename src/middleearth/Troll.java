package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.CanNotRideException;
import middleearth.MiddleEarthCitizen;
import middleearth.powerException;

public class Troll extends MiddleEarthCitizen {
    String arm = "brass";

    public Troll(String name, int height, int power) {
        super(name, height, power);

        try {
            if(power > 15 || power < 11) {
                throw new powerException("11-15");
            }
        } catch (powerException var5) {
            System.out.println(var5.toString());
            power = 11;
        }

        this.power = power;
    }

    public void Ride() throws CanNotRideException {
        throw new CanNotRideException();
    }
}