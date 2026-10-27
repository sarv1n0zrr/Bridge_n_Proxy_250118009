interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

class Tv implements Device {
    int volume = 20;

    public void turnOn()  { System.out.println("TV screen powers ON"); }
    public void turnOff() { System.out.println("TV screen powers OFF"); }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to: " + this.volume);
    }
}

class Radio implements Device {
    int volume = 10;

    public void turnOn()  { System.out.println("Radio starts playing music"); }
    public void turnOff() { System.out.println("Radio goes silent"); }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume knob turned to: " + this.volume);
    }
}

class SmartLight implements Device {
    int brightness = 50;

    public void turnOn()  { System.out.println("Smart Light glows bright white"); }
    public void turnOff() { System.out.println("Smart Light shuts off"); }

    public void setVolume(int level) {
        this.brightness = level;
        System.out.println("Smart Light brightness is: " + this.brightness + "%");
    }
}
