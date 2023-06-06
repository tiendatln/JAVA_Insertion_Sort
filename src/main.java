import java.util.Scanner;
public class main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Array: ");
        Selection_sort ss = new Selection_sort();
        System.out.print("Unsorted Array: "+ss+"\n");
        ss.Selectionsort();
        System.out.print("Sorted Array: "+ss);
    }
}
