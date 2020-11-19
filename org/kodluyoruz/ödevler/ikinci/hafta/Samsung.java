package org.kodluyoruz.ödevler.ikinci.hafta;

public class Samsung extends Telephones {

    final String keyboard = "tuşlu";

    public Samsung(String modelName, String IMEI, String versionNumber, double memory, double screen) {
        super(modelName, IMEI, versionNumber, memory, screen, new Oem("Tuşlu"));


    }

    @Override
    public void call() {
        System.out.println("Samsung Arıyor");
    }

    @Override
    public void sms() {
        System.out.println("Samsung Mesaj Atıyor");

    }


    public void fileSharing() {
        System.out.println("Dosya Aktarımı Yapılıyor");

    }

    public void mp3() {
        System.out.println("MP3 Dinleniyor");
    }


}
