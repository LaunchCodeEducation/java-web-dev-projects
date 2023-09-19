
package technology;

public class techdemo {

    public static void main(String[] args) {


        Computer comp = new Computer("Generic Brand", 512, 16);
        comp.powerOn();
        comp.powerOff();


        Laptop laptop = new Laptop("Dell", 1024, 32, 15.6);
        laptop.powerOn();
        laptop.fold();
        laptop.powerOff();


        SmartPhone phone = new SmartPhone("Apple", 256, 4, "12MP");
        phone.powerOn();
        phone.takePhoto();
        phone.powerOff();

    }
}
