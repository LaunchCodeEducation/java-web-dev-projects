package org.launchcode;

public class Main {

    public static void main(String[] args) {


        MenuItem steakSandwich = new MenuItem("Steak Sammie", 8.50, "Tasty, greasy sandwich with garlic aioli", "main course");
        MenuItem poutine = new MenuItem("Poutine", 6.00, "Steak fries topped with gravy and cheese curds", "appetizer");
        MenuItem mousse = new MenuItem("Mousse", 6.00, "Airy chocolate dessert", "dessert");
        MenuItem cordonbleu = new MenuItem("Cordon Bleu", 8.00, "Succulent, lightly breaded chicken breast topped with ham crumbles and swiss", "main course");
        MenuItem steakSandwich2 = new MenuItem("Steak Sammie", 8.50, "Tasty, greasy sandwich with garlic aioli", "main course");
        System.out.println(steakSandwich.isNew());

        // TODO: print first item
        System.out.println(steakSandwich);
// TODO: Create menu

        Menu menu = new Menu();
        menu.addMenuItem(steakSandwich);
        menu.addMenuItem(poutine);
        menu.addMenuItem(mousse);
        menu.addMenuItem(cordonbleu);

        System.out.println(menu);

        menu.removeItem(steakSandwich);
        System.out.println(menu);

        //TODO Test equals method

        System.out.println(mousse.equals(cordonbleu));

        //TODO Try to add a duplicate item
        menu.addMenuItem(steakSandwich2);
        System.out.println(menu);


        menu.displayMenu();
    }
}
