package org.kodluyoruz.ödevler.ikinci.hafta;

public class Iphone extends Telephones {

    public Iphone(String modelName, String IMEI, String versionNumber, double memory, double screen) {
        super(modelName, IMEI, versionNumber, memory, screen, new Oem("Dokunmatik"));

    }

    @Override
    public void call() {
        System.out.println("Iphone Arıyor");
    }

    @Override
    public void sms() {
        System.out.println("Iphone Mesaj Atıyor");
    }
     public void screenSharing(){

         System.out.println("Ekran Paylaşılıyor");
     }

     public void videoCall(){
        System.out.println("Görüntülü Konuşma Yapılıyor");
    }

}
