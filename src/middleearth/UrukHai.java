package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.Orc;
import middleearth.powerException;

public class UrukHai extends Orc {
    public UrukHai(String name, int height, int power) {
        super(name, height, power);

        try {
            if(power > 12 || power < 10) {
                throw new powerException("10-12");
            }
        } catch (powerException var5) {
            System.out.println(var5.toString());
            power = 10;
        }

        this.power = power;
    }
}
