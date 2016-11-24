package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.MiddleEarthCitizen;
import middleearth.powerException;

public class Orc extends MiddleEarthCitizen {
    private Orc.Wolf wolf;

    public Orc(String name, int height, int power) {
        super(name, height, power);

        try {
            if(power > 10 || power < 8) {
                throw new powerException("8-10");
            }
        } catch (powerException var5) {
            System.out.println(var5.toString());
            power = 8;
        }

        this.power = power;
    }

    public boolean firstStrike() {
        return true;
    }

    public Orc getRef() {
        return this;
    }

    public void setWolf(Orc.Wolf wolf) {
        this.wolf = wolf;
    }

    public Orc.Wolf getWolf() {
        return this.wolf;
    }

    public class Wolf {
        Integer powerWolf;

        public Wolf() {
        }
    }
}
