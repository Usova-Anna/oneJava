

import java.util.Scanner;
public class EggsBread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Купить яйца (true или false): ");
        boolean hasEggs = scan.nextBoolean();
        System.out.println("Купить хлеб (true или false): ");
        boolean hasBread = scan.nextBoolean();
        System.out.println(printPurchases(hasEggs, hasBread));
    }

    public static String printPurchases(boolean hasEggs, boolean hasBread) {
        String purchases=null;
        if (hasEggs == true && hasBread == true) {
            purchases = "Eggs,bread";
        } else if (hasEggs == true && hasBread == false) {
            purchases = "Eggs only";
        } else if (hasEggs == false && hasBread == true) {
            purchases = "Bread only";
        } else if (hasEggs == false && hasBread == false) {
            purchases = "nothing";
        }
        return purchases;
    }
}