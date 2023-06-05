import java.util.Random;
import java.util.Scanner;
public class Selection_sort {
    private int[] a;

    public Selection_sort() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                System.out.println("The number of array must be greater than 0!"); //Display an error message
                System.out.println("Enter number of array:"); //Ask user to re-enter
                continue; //Return to the beginning of while command
            } else { //Execute command if the number is greater than 0 
                a = new int[n]; //Assign the number of element(s) to the array
                Random rand = new Random();
                for (int i = 0; i < n; ++i) {
                    a[i] = rand.nextInt(n); //Choose a random number from 0 to n
                }
                break; //Stop executing
            }
        }
    }

    public void Selectionsort() {
        for (int i =0; i<a.length;i++) {
            int min = i;
            int j;
            for ( j = i+1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min=j;
                }
            }
            int temp = a[min];
            if (min!=i){
                a[min]=a[i];
                a[i]=temp;
            }
        }
    }

    @Override
    public String toString() {
        String srt = "[" + a[0];
        for (int i = 1; i < a.length; ++i) {
            srt += ", " + a[i];
        }
        srt += "]";
        return srt; //To change body of generated methods, choose Tools | Templates.
    }
}
