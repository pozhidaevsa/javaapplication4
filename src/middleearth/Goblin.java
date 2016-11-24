package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.MiddleEarthCitizen;
import middleearth.powerException;

public class Goblin extends MiddleEarthCitizen {
    public Goblin(String name, int height, int power) {
        super(name, height, power);

        try {
            if(power > 5 || power < 2) {
                throw new powerException("2-5");
            }
        } catch (powerException var5) {
            System.out.println(var5.toString());
            power = 2;
        }

        this.power = power;
    }
}

