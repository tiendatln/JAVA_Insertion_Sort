import java.util.Random;
import java.util.Scanner;

public class Insertion_Sort {
    private int[] a;

    public Insertion_Sort() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                System.out.println("The number of Array must be greater than 0!");
                System.out.print("Enter number of Array: ");
                continue;
            } else {
                a = new int[n];
                Random rand = new Random();
                for (int i = 0; i < n; i++) {
                    a[i] = rand.nextInt(n);
                }
                break;
            }
        }
    }

    public void InsertionSort() {
        for (int i = 1; i < a.length; i++) {
            int number = a[i];//Assign number equal to element at position i
            for (int j = i - 1; j >= 0; j--) {//loop in element j equal i-1 to 0
                if (a[j + 1] < a[j]) {//Execute command if number of array j+1 smaller a[j]
                    a[j + 1] = a[j];
                    a[j] = number;
                }

            }

        }
    }
    /*
    *
    
    *
    */
    @Override
    public String toString() {
        String srt = "[" + a[0];
        for (int i = 1; i < a.length; i++) {
            srt += ", " + a[i];
        }
        srt += "]";
        return srt; //To change body of generated methods, choose Tools | Templates.
    }
}
