
public class App {
    public static void main(String[] args) {
        System.out.print("Enter number of Array: ");
        Insertion_Sort IS = new Insertion_Sort();
        System.out.print("Unsorted Array: "+IS+"\n");
        IS.InsertionSort();
        System.out.print("Sorted Array: "+IS+ "\n");
    }
}
