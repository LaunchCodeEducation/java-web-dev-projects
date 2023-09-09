package main.java.org.launchcode;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        MenuItem steakSandwich = new MenuItem("Steak Sammie", 8.50, "Tasty, greasy sandwich with garlic aioli", "Main course");
        MenuItem poutine = new MenuItem("Poutine", 6.00, "Steak fries topped with gravy and cheese curds", "appetizer");
        MenuItem mousse = new MenuItem("Mousse", 6.00, "Airy chocolate dessert", "appetizer");

        menu.addMenuItem(steakSandwich);
        menu.addMenuItem(poutine);
        menu.addMenuItem(mousse);

        menu.displayMenu();
    }
}
