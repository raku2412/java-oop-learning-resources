package model;

public class SmartHomeRoom {

    private SmartBulb smartBulb;
    private SmartSpeaker smartSpeaker;

    public SmartHomeRoom(SmartBulb smartBulb) {
        this.smartBulb = smartBulb;
        this.smartSpeaker = null;
    }

    public SmartHomeRoom(SmartBulb smartBulb, SmartSpeaker smartSpeaker) {
        this.smartBulb = smartBulb;
        this.smartSpeaker = smartSpeaker;
    }

    public SmartBulb getSmartBulb() {
        return smartBulb;
    }

    public void setSmartBulb(SmartBulb smartBulb) {
        this.smartBulb = smartBulb;
    }

    public SmartSpeaker getSmartSpeaker() {
        return smartSpeaker;
    }

    public void setSmartSpeaker(SmartSpeaker smartSpeaker) {
        this.smartSpeaker = smartSpeaker;
    }

}
