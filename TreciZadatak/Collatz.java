package TreciZadatak;

import java.util.*;

public class Collatz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Molimo unesite neki broj");
        int broj = input.nextInt();

        while (broj != 1) {

            if (broj == 1) {
                break;
            } else if (broj % 2 == 0) {
                broj = broj / 2;
            } else if (broj % 2 != 0) {
                broj = (3 * broj) + 1;
            }
            System.out.println(broj);
        }
    }
}
