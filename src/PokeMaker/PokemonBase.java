/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokeMaker;

/**
 *
 * @author Wojtek
 */
public class PokemonBase implements Comparable<PokemonBase> {

    private int indexNumber;
    private String name;
    private String species;
    private String[] type;
    private int[] stat;
    private Object[] ability;
    private Object preevolution;
    private String condition;
    private int evolveLev;
    private Object evolveThing;
    private int baseExp;
    private int[] evs;
    private int cptRt;
    private Object grwRt;
    private int gender;
    private int eggNum;
    private Object[] eggGroup;
    private Object item;
    private int itemChance;
    private String[] description;
    private Object altForm;

    public PokemonBase() {
        this.indexNumber = 0;
        this.name = "Nothing";
        this.altForm = new Object();
    }

    public PokemonBase(int indexNumber, String name, String species, String[] type, int[] stat, Object[] ability,
            Object preevolution, String condition, int evolveLev,
            Object evolveThing, int baseExp, int[] evs, int cptRt,
            Object grwRt, int gender, int eggNum, Object[] eggGroup,
            Object item, int itemChance, String[] description, Object altForm) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.species = species;
        this.type = type;
        this.stat = stat;
        this.ability = ability;
        this.preevolution = preevolution;
        this.condition = condition;
        this.evolveLev = evolveLev;
        this.evolveThing = evolveThing;
        this.baseExp = baseExp;
        this.evs = evs;
        this.cptRt = cptRt;
        this.grwRt = grwRt;
        this.gender = gender;
        this.eggNum = eggNum;
        this.eggGroup = eggGroup;
        this.item = item;
        this.itemChance = itemChance;
        this.description = description;
        this.altForm = altForm;
    }

    public int getIndex() {
        return indexNumber;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getType(int i) {
        if (i > type.length) {
            return null;
        } else {
            return type[i - 1];
        }
    }

    public int getHP() {
        return stat[0];
    }

    public int getAtk() {
        return stat[1];
    }

    public int getDef() {
        return stat[2];
    }

    public int getSpA() {
        return stat[3];
    }

    public int getSpD() {
        return stat[4];
    }

    public int getSpe() {
        return stat[5];
    }

    public Object getAbility(int i) {
        if (i > ability.length) {
            return null;
        } else {
            return ability[i - 1];
        }
    }

    public Object getPreevolution() {
        return preevolution;
    }

    public String getCondition() {
        return condition;
    }

    public int getEvolveLevel() {
        return evolveLev;
    }

    public Object getEvolveThing() {
        return evolveThing;
    }

    public int getBaseExp() {
        return baseExp;
    }

    public int getEvs(int i) {
        if (i > evs.length) {
            return 0;
        } else {
            return evs[i - 1];
        }
    }

    public int getCaptureRate() {
        return cptRt;
    }

    public Object getGrowthRate() {
        return grwRt;
    }

    public int getGender() {
        return gender;
    }

    public int getEggNumber() {
        return eggNum;
    }

    public Object getEggGroup(int i) {
        if (i > eggGroup.length) {
            return 0;
        } else {
            return eggGroup[i - 1];
        }
    }

    public Object getItem() {
        return item;
    }

    public int getItemChance() {
        return itemChance;
    }

    public String getDescription(int i) {
        if (i > description.length) {
            return null;
        } else {
            return description[i - 1];
        }
    }

    public Object getAlternativeForm() {
        return altForm;
    }

    public String getDataString() {
        PokemonBase pre = (PokemonBase) preevolution;
        String altName;
        if (altForm != null) {
            PokemonBase alt = (PokemonBase) altForm;
            altName = alt.name;
        } else {
            altName = "null";
        }
        String descOne = description[0].replace("\n", "@");
        String descTwo = description[1].replace("\n", "@");
        return "#;" + indexNumber + ";" + name + ";" + species + ";" + type[0] + ";"
                + type[1] + ";" + type[2] + ";" + stat[0] + ";" + stat[1] + ";"
                + stat[2] + ";" + stat[3] + ";" + stat[4] + ";" + stat[5] + ";"
                + ability[0] + ";" + ability[1] + ";" + ability[2] + ";" + pre.name + ";"
                + condition + ";" + evolveLev + ";" + evolveThing.toString() + ";"
                + baseExp + ";" + evs[0] + ";" + evs[1] + ";" + evs[2] + ";" + evs[3] + ";"
                + evs[4] + ";" + evs[5] + ";" + cptRt + ";" + grwRt.toString() + ";"
                + gender + ";" + eggNum + ";" + eggGroup[0] + ";" + eggGroup[1] + ";"
                + item.toString() + ";" + itemChance + ";" + descOne + ";"
                + descTwo + ";" + altName;
    }

    @Override
    public String toString() {
        if (altForm == null) {
            return "#" + indexNumber + " " + name;
        } else if (indexNumber == 0) {
            return "Nothing";
        } else {
            return "  " + name;
        }
    }

    @Override
    public int compareTo(PokemonBase o) {
        if (indexNumber == o.indexNumber) {
            return name.compareTo(o.name);
        } else {
            return indexNumber - o.indexNumber;
        }
    }
}
