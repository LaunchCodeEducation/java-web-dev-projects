package technology;

public class Program {

    public static void main(String[] args){

        Laptop macbook = new Laptop("MacBook", "Mac", 2002, 2000, 14.5, 4.0);
        Laptop macbookAir = new Laptop("MacBook", "Mac", 2002, 2000, 14.5, 4.0);
        Laptop macbook2 = new Laptop("MacBook", "Mac", 2002, 2000, 14.5, 4.0);
        SmartPhone iphoneXR = new SmartPhone("IOS", "Iphone", 2016, 150.00, 10.00);



        System.out.println(macbook.getId());
        System.out.println(macbookAir.getId());
        System.out.println(macbook2.getId());
        System.out.println(iphoneXR.getId());
        System.out.println(macbook);
        System.out.println(iphoneXR);

    }
}
