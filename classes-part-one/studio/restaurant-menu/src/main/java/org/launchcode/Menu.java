package src.main.java.org.launchcode;
import java.util.ArrayList;
import java.util.Date;



public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    Date d1;
    public void addMenuItem(MenuItem menuItem) {
        items.add(menuItem);
        d1 = new Date();
    }

    public void displayMenu(){
        System.out.println("\n Menu:");
        for(MenuItem item: items){
            if(item.isNewEntry()) {
                System.out.println("\t" + item.getMenuItem());
            }
            }
        System.out.println("\n" + "Last updated: " + d1);
    }
}