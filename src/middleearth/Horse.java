package middleearth;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import middleearth.powerException;

public class Horse {
    public String color;
    public String breed;
    public Integer power;

    public Horse() {
        try {
            if(this.power.intValue() > 5 || this.power.intValue() < 4) {
                throw new powerException("4-5");
            }
        } catch (powerException var2) {
            System.out.println(var2.toString());
            this.power = Integer.valueOf(4);
        }

        this.power = this.power;
    }

    public Horse(String c, String b) {
        this.color = c;
        this.breed = b;
    }
}