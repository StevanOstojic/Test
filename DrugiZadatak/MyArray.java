package DrugiZadatak;

public class MyArray {
    public int[] array;
    int smallest;
    int largest;

    MyArray(int[] array) {
        this.array = array;
    }

    public int getSmallestNumber(int [] array) {

        for (int i = 0; i < array.length; i++) {
            smallest = array[0];
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }


    public int largestNumber(int[] array) {
        largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public int summAllNumbers(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    public void printAllElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {


        int[] brojevi = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        MyArray array = new MyArray(brojevi);

        System.out.println(array.getSmallestNumber(brojevi));
        array.printAllElements(brojevi);
        System.out.println("");
        System.out.println(array.largestNumber(brojevi));
        System.out.println(array.summAllNumbers(brojevi));
    }
}
