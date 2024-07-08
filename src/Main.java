import java.util.*;



public class Main {
    public static int checkQuantity (Quantity itemQuantity, Quantity coffeeMakerQuantity ) {
        if((itemQuantity.waterQuantity > coffeeMakerQuantity.waterQuantity) || (itemQuantity.milkQuantity > coffeeMakerQuantity.milkQuantity) || (itemQuantity.coffeeQuantity > coffeeMakerQuantity.coffeeQuantity)){
            return 0;
        };
        return 1;
    }
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Item latte = new Item("latte", 20, new Quantity(12, 13, 11));
        Item cappuccino = new Item("cappuccino", 70, new Quantity(32, 23, 41));
        Item mocha = new Item("mocha", 60, new Quantity(12, 13, 9));

        CoffeeMaker coffeeMaker = new CoffeeMaker(
                new ArrayList<>(Arrays.asList(latte, cappuccino, mocha)), new Quantity(100, 100, 100)
        );
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("choose the beverage you want today\n" + coffeeMaker.menu());
            System.out.println("Enter 0 to exit.");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting... Thank you!");
                break;
            }
            switch (choice) {
                case 1:
                    int check = checkQuantity(latte.getQuantity(), coffeeMaker.initialQuantity);
                    if (check == 1) {
                        System.out.println("please pay " + latte.getPrice());
                        System.out.println("Enjoy your " + latte.name);
                        coffeeMaker.reduceQuantity(latte.getQuantity());
                    } else {
                        System.out.println("Not enough ingredients for latte");
                    }
                    break;
                case 2:
                    check = checkQuantity(cappuccino.getQuantity(), coffeeMaker.initialQuantity);
                    if (check == 1) {
                        System.out.println("please pay " + cappuccino.getPrice());
                        System.out.println("Enjoy your " + cappuccino.name);
                        coffeeMaker.reduceQuantity(cappuccino.getQuantity());
                    } else {
                        System.out.println("Not enough ingredients for cappuccino");
                    }

                    break;
                case 3:
                    check = checkQuantity(mocha.getQuantity(), coffeeMaker.initialQuantity);
                    if (check == 1) {
                        System.out.println("please pay " + mocha.getPrice());
                        System.out.println("Enjoy your " + mocha.name);
                        coffeeMaker.reduceQuantity(mocha.getQuantity());
                    } else {
                        System.out.println("Not enough ingredients for Mocha");
                    }
                    break;
                default:
                    System.out.println("please choose a valid choice");
                    break;
            }
        }
    }
}