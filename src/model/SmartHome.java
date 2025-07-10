package model;

public class SmartHome {

    private final SmartBulb[] smartBulbs;

    public SmartHome(int numberOfSmartBulbs) {
        this.smartBulbs = new SmartBulb[numberOfSmartBulbs];
    }

    public void addSmartBulb(SmartBulb smartBulb) {
        smartBulbs[smartBulb.getId() - 1] = smartBulb;
    }

    public void removeSmartBulb(SmartBulb smartBulb) {
        smartBulbs[smartBulb.getId() - 1] = null;
    }

    public SmartBulb getSmartBulb(int id) {
        return smartBulbs[id - 1];
    }

    public String getMeanBrightness() {
        int totalBrightness = 0;
        int count = 0;
        for (SmartBulb bulb : smartBulbs) {
            if (bulb != null) {
                totalBrightness += bulb.getBrightness();
                count++;
            }
        }
        return count == 0 ? "No bulbs available" : String.valueOf(totalBrightness / count);
    }

    public String getMinimumBrightness() {
        int minBrightness = Integer.MAX_VALUE;
        for (SmartBulb bulb : smartBulbs) {
            if (bulb != null && bulb.getBrightness() < minBrightness) {
                minBrightness = bulb.getBrightness();
            }
        }
        return minBrightness == Integer.MAX_VALUE ? "No bulbs available" : String.valueOf(minBrightness);
    }

    public String getMaximumBrightness() {
        int maxBrightness = Integer.MIN_VALUE;
        for (SmartBulb bulb : smartBulbs) {
            if (bulb != null && bulb.getBrightness() > maxBrightness) {
                maxBrightness = bulb.getBrightness();
            }
        }
        return maxBrightness == Integer.MIN_VALUE ? "No bulbs available" : String.valueOf(maxBrightness);
    }

}
