package technology;

public class Program {
    public static void main(String[] args){
        Computer acer29 = new Computer("Acer-29", 500, 2020);
        Laptop refurbHp = new Laptop("Refurbished HP", 500, 2018, false, false);
        Smartphone myPhone = new Smartphone("Drew's phone", 80, 2016, 1);

        //print em
        System.out.println(acer29);
        System.out.println(refurbHp);
        System.out.println(myPhone);
    }
}
