package org.launchcode;

    public class Main {

        public static void main(String[] args) {
            MenuItem item1 = new MenuItem(10.99, "Caesar Salad", "Appetizer", true);
            MenuItem item2 = new MenuItem(15.99, "Steak Dinner", "Main Course", false);
            // Create more menu items as needed...

            // Test the methods of your MenuItem class here
            item1.printMenuItem();
            // You can use other methods to set and get properties as well.
        }
    }
