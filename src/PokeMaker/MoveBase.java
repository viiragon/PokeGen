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
public class MoveBase implements Comparable<MoveBase> {

    private String name;
    private String[] type;
    private String atkType;
    private int bp;
    private int accuracy;
    private int pp;
    private String target;
    private int priority;
    private String status;
    private int statusChance;
    private boolean statusUser;
    private int[] stats;
    private int statsChance;
    private boolean statsUser;
    private boolean ifSwitch;
    private boolean switchUser;
    private int multiHit;
    private int hpChange;
    private String hpSource;
    private String superType;
    private boolean[] flags;
    private String description;
    private boolean ifTM;
    private int TMnum;
    private boolean ifMissed;
    private int missedHpChange;
    private String missedStatus;
    private boolean missedStatusUser;
    private int[] missedStats;
    private boolean missedStatsUser;
    private boolean missedSwitch;
    private boolean missedSwitchUser;

    public MoveBase(String name,
            String[] type,
            String atkType,
            int bp,
            int accuracy,
            int pp,
            String target,
            int priority,
            String status,
            int statusChance,
            boolean statusUser,
            int[] stats,
            int statsChance,
            boolean statsUser,
            boolean ifSwitch,
            boolean switchUser,
            int multiHit,
            int hpChange,
            String hpSource,
            String superType,
            boolean[] flags,
            String description,
            boolean ifTM,
            int TMnum,
            boolean ifMissed,
            int missedHpChange,
            String missedStatus,
            boolean missedStatusUser,
            int[] missedStats,
            boolean missedStatsUser,
            boolean missedSwitch,
            boolean missedSwitchUser) {
        this.name = name;
        this.type = type;
        this.atkType = atkType;
        this.bp = bp;
        this.accuracy = accuracy;
        this.pp = pp;
        this.target = target;
        this.priority = priority;
        this.status = status;
        this.statusChance = statusChance;
        this.statusUser = statusUser;
        this.stats = stats;
        this.statsChance = statsChance;
        this.statsUser = statsUser;
        this.ifSwitch = ifSwitch;
        this.switchUser = switchUser;
        this.multiHit = multiHit;
        this.hpChange = hpChange;
        this.hpSource = hpSource;
        this.superType = superType;
        this.flags = flags;
        this.description = description;
        this.ifTM = ifTM;
        this.TMnum = TMnum;
        this.ifMissed = ifMissed;
        if (ifMissed) {
            this.missedHpChange = missedHpChange;
            this.missedStatus = missedStatus;
            this.missedStatusUser = missedStatusUser;
            this.missedStats = missedStats;
            this.missedStatsUser = missedStatsUser;
            this.missedSwitch = missedSwitch;
            this.missedSwitchUser = missedSwitchUser;
        } else {
            this.missedHpChange = 0;
            this.missedStatus = "";
            this.missedStatusUser = false;
            this.missedStats = new int[] {0,0,0,0,0,0,0};
            this.missedStatsUser = false;
            this.missedSwitch = false;
            this.missedSwitchUser = false;
        }
    }

    public String getName() {
        return name;
    }

    public String getType(int i) {
        return type[i - 1];
    }

    public String getAtkType() {
        return atkType;
    }

    public int getBp() {
        return bp;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getPp() {
        return pp;
    }

    public String getTarget() {
        return target;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public int getStatusChance() {
        return statusChance;
    }

    public boolean isStatusUser() {
        return statusUser;
    }

    public int getStats(int i) {
        return stats[i - 1];
    }

    public int getStatsChance() {
        return statsChance;
    }

    public boolean isStatsUser() {
        return statsUser;
    }

    public boolean isIfSwitch() {
        return ifSwitch;
    }

    public boolean isSwitchUser() {
        return switchUser;
    }

    public int getMultiHit() {
        return multiHit;
    }

    public int getHpChange() {
        return hpChange;
    }

    public String getHpSource() {
        return hpSource;
    }

    public String getSuperType() {
        return superType;
    }

    public boolean[] getFlags() {
        return flags;
    }

    public boolean getFlags(int i) {
        return flags[i - 1];
    }

    public String getDescription() {
        return description;
    }

    public boolean isIfTM() {
        return ifTM;
    }

    public int getTMnum() {
        return TMnum;
    }

    public boolean isIfMissed() {
        return ifMissed;
    }

    public int getMissedHpChange() {
        return missedHpChange;
    }

    public String getMissedStatus() {
        return missedStatus;
    }

    public boolean isMissedStatusUser() {
        return missedStatusUser;
    }

    public int getMissedStats(int i) {
        return missedStats[i - 1];
    }

    public boolean isMissedStatsUser() {
        return missedStatsUser;
    }

    public boolean isMissedSwitch() {
        return missedSwitch;
    }

    public boolean isMissedSwitchUser() {
        return missedSwitchUser;
    }

    public String getDataString() {
        String tempFlags = "";
        for (int i = 0; i < flags.length; i++) {
            tempFlags += flags[i] + ";";
        }
        String descTemp = description.replace("\n", "@");
        return name + ";" + type[0] + ";" + type[1] + ";" + atkType + ";"
                + bp + ";" + accuracy + ";" + pp + ";" + target + ";" + priority
                + ";" + status + ";" + statusChance + ";" + statusUser + ";"
                + stats[0] + ";" + stats[1] + ";" + stats[2] + ";" + stats[3] + ";"
                + stats[4] + ";" + stats[5] + ";" + stats[6] + ";" + statsChance + ";"
                + statsUser + ";" + ifSwitch + ";" + switchUser + ";" + multiHit + ";"
                + hpChange + ";" + hpSource + ";" + superType + ";" + tempFlags
                + descTemp + ";" + ifTM + ";" + TMnum + ";" + ifMissed + ";"
                + missedHpChange + ";" + missedStatus + ";" + missedStatusUser + ";"
                + missedStats[0] + ";" + missedStats[1] + ";" + missedStats[2] + ";"
                + missedStats[3] + ";" + missedStats[4] + ";" + missedStats[5] + ";"
                + missedStats[6] + ";" + missedStatsUser + ";" + missedSwitch + ";"
                + missedSwitchUser;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(MoveBase o) {
        return name.compareTo(o.getName());
    }
}
