package javaapplication4;

/**
 * Created by stepanpozhidaev on 24.11.16.
 */

import java.util.ArrayList;
import java.util.Random;
import middleearth.Elf;
import middleearth.Goblin;
import middleearth.Human;
import middleearth.MiddleEarthCitizen;
import middleearth.Orc;
import middleearth.Rohhirim;
import middleearth.Troll;
import middleearth.UrukHai;
import middleearth.Wizard;
import middleearth.WoodenElf;

public class JavaApplication4 {
    public JavaApplication4() {
    }

    public static void main(String[] args) {
        ArrayList kindArmy = new ArrayList();
        Random r = new Random();
        Boolean isWiz = Boolean.valueOf(r.nextBoolean());
        if(!isWiz.booleanValue()) {
            kindArmy.add(new Wizard("Wizard", 155, 20));
        }

        int unit1 = r.nextInt(30);

        int unit2;
        for(unit2 = 0; unit2 < unit1; ++unit2) {
            kindArmy.add(new WoodenElf("WoodenElf" + unit2, 170 + r.nextInt(40)));
        }

        unit2 = r.nextInt(30);

        int unit3;
        for(unit3 = 0; unit3 < unit2; ++unit3) {
            kindArmy.add(new Elf("Elf" + unit3, 170 + r.nextInt(40), 4 + r.nextInt(4)));
        }

        unit3 = r.nextInt(30);

        int unit4;
        for(unit4 = 0; unit4 < unit3; ++unit4) {
            kindArmy.add(new Human("Perm" + unit4, 18 + unit4, 160 + r.nextInt(40), "Ivan" + unit4, 7 + r.nextInt(2)));
        }

        unit4 = r.nextInt(30);

        int darkArmy;
        for(darkArmy = 0; darkArmy < unit4; ++darkArmy) {
            kindArmy.add(new Rohhirim(18 + darkArmy, "Zheka" + darkArmy, 7 + r.nextInt(2)));
        }

        System.out.println(kindArmy.size());

        for(darkArmy = 0; darkArmy < kindArmy.size(); ++darkArmy) {
            System.out.println(kindArmy.get(darkArmy));
        }

        ArrayList var16 = new ArrayList();
        int unit5 = r.nextInt(30);

        int unit6;
        for(unit6 = 0; unit6 < unit5; ++unit6) {
            var16.add(new Goblin("Goblin" + unit6, 188 + r.nextInt(50), 2 + r.nextInt(4)));
        }

        unit6 = r.nextInt(30);

        int unit7;
        for(unit7 = 0; unit7 < unit6; ++unit7) {
            var16.add(new Orc("Orc" + unit7, 190 + r.nextInt(50), 8 + r.nextInt(3)));
        }

        unit7 = r.nextInt(30);

        int unit8;
        for(unit8 = 0; unit8 < unit7; ++unit8) {
            var16.add(new Troll("Troll" + unit8, 196 + r.nextInt(20), 11 + r.nextInt(5)));
        }

        unit8 = r.nextInt(30);

        int kindBegin;
        for(kindBegin = 0; kindBegin < unit8; ++kindBegin) {
            var16.add(new UrukHai("UrukHai" + kindBegin, 188 + r.nextInt(200), 10 + r.nextInt(3)));
        }

        System.out.println(var16.size());

        for(kindBegin = 0; kindBegin < var16.size(); ++kindBegin) {
            System.out.println(var16.get(kindBegin));
        }

        boolean var17 = r.nextBoolean();
        var17 = true;
        int i;
        if(true) {
            for(i = 0; i < kindArmy.size(); ++i) {
                if(((MiddleEarthCitizen)kindArmy.get(i)).firstStrike() && ((MiddleEarthCitizen)kindArmy.get(i)).power > 0) {
                    byte j = 0;
                    if(j < var16.size() && ((MiddleEarthCitizen)var16.get(j)).firstStrike() && ((MiddleEarthCitizen)var16.get(j)).power > 0) {
                        while(((MiddleEarthCitizen)kindArmy.get(i)).power > 0 && ((MiddleEarthCitizen)var16.get(j)).power > 0) {
                            MiddleEarthCitizen var10000 = (MiddleEarthCitizen)var16.get(j);
                            var10000.power -= ((MiddleEarthCitizen)kindArmy.get(i)).power;
                            var10000 = (MiddleEarthCitizen)kindArmy.get(i);
                            var10000.power -= ((MiddleEarthCitizen)var16.get(j)).power;
                        }

                        if(((MiddleEarthCitizen)var16.get(j)).power < 0) {
                            var16.remove(j);
                        }

                        if(((MiddleEarthCitizen)kindArmy.get(i)).power < 0) {
                            var16.remove(i);
                        }
                    }
                }
            }
        }

        System.out.println(var16.size());

        for(i = 0; i < var16.size(); ++i) {
            System.out.println(var16.get(i));
        }

    }
}
