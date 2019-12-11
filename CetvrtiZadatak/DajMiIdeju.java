package CetvrtiZadatak;

import java.util.*;

public class DajMiIdeju {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rijecenica = "";

        System.out.println("Molimo unesite neke rijeci");

        do {
            System.out.println("Unesite rijec!");
            String novaRijec = input.next();
            if (novaRijec.equals("kraj")) {
                break;
            }else
            rijecenica = rijecenica + " " + novaRijec;

        } while (true);

        System.out.println(rijecenica);
    }
}
