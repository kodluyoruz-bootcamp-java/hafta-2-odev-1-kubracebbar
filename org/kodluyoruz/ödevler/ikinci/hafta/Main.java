package org.kodluyoruz.ödevler.ikinci.hafta;

public class Main {

    public static void main(String[] args) {

Iphone iphone= new Iphone("Kübra","55kc","2001",5.0,4.0);
System.out.println(iphone.getOem());
iphone.yazdır();
iphone.call();
iphone.sms();
iphone.videoCall();
iphone.screenSharing();
Samsung samsung= new Samsung("E5","49g","2020",5.0,4.1);
System.out.println(samsung.getOem());
samsung.yazdır();
samsung.call();
samsung.sms();
samsung.fileSharing();
samsung.mp3();

    }
}
