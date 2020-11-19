package org.kodluyoruz.ödevler.ikinci.hafta;

public abstract class Telephones {

    private String modelName;
    private String IMEI;
    private String versionNumber;
    private double memory;
    private double screen;
    private Oem oem;


    public Telephones(String modelName, String IMEI, String versionNumber, double memory, double screen, Oem oem) {
        this.modelName = modelName;
        this.IMEI = IMEI;
        this.versionNumber = versionNumber;
        this.memory = memory;
        this.screen = screen;
        this.oem=oem;

    }

    public String getOem() {
        return oem.getKeyboard();
    }

    public void setOem(Oem oem) {
        this.oem = oem;
    }
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public void yazdır() {

        System.out.println("Model Name= " + modelName + " IMEI= " + IMEI + " Version Number= "
                + versionNumber + " Memory= " + memory + " Screen " + screen);
    }

    public abstract void call();

    public abstract void sms();


}
