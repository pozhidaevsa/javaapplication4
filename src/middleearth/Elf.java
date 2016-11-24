package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.MiddleEarthCitizen;
import middleearth.powerException;

public class Elf extends MiddleEarthCitizen {
    public Elf(String name, int height, int power) {
        super(name, height, power);

        try {
            if(power > 7 || power < 4) {
                throw new powerException("4-7");
            }
        } catch (powerException var5) {
            System.out.println(var5.toString());
            power = 4;
        }

        this.power = power;
    }

    public Elf(String name, int height) {
        super(name, height);
    }

    public String toString() {
        String str = super.toString();
        return str;
    }
}