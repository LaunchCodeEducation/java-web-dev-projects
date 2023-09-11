import org.launchcode.Category;
import org.launchcode.Menu;
import org.launchcode.MenuItem;


import java.util.ArrayList;
import java.util.Date;


public class MenuTest {

    public static void main(String[] args) {
        // Creating some sample menu items
        MenuItem item1 = new MenuItem(5.99, "Bruschetta", Category.APPETIZER, true);
        MenuItem item2 = new MenuItem(15.99, "Chicken Alfredo", Category.MAIN_COURSE, false);
        MenuItem item3 = new MenuItem(7.50, "Chocolate Cake", Category.DESSERT, true);

        // Adding menu items to a list
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);

        // Creating a Menu
        Menu menu = new Menu(new Date(), menuItems);

        // Printing the menu items
      System.out.println("Menu (Last Updated: " + menu.getLastUpdated() + ")");
        for (MenuItem item : menu.getItems()) {
            System.out.println("Description: " + item.getDescription() +
                    "\nCategory: " + item.getCategory() +
                    "\nPrice: $" + item.getPrice() +
                    "\nNew Item: " + (item.isNew() ? "Yes" : "No") + "\n");
        }

        //System.out.println( menu );
    }
}
