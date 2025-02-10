package main.java.com.semicolon.africa.model;

public class MyTv {
    private boolean isOn = false;
    private int volume = 0;
    private int maxVolume = 50;
    private int channel;
    private int channelDown;
    private boolean mute_channel;

    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public int getChannelDown() {
        return channelDown;
    }
    public void setChannelDown(int channelDown) {
        this.channelDown = channelDown;
    }
    public boolean isMute_channel() {
        return mute_channel;
    }
    public void setMute_channel(boolean mute_channel) {
        this.mute_channel = mute_channel;
    }

    public boolean myTvIsOff() {
        return isOn;
    }

    public boolean myTvIsOn() {
        if(this.isOn == false){
            return true;

        }
        return false;
    }

    public void increaseVolume() {
        if(isOn == true && volume <= maxVolume){
            volume += 1;
        }


    }
}
