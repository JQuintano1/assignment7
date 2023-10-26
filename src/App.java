import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class App extends MergeSort {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter length of array ");
        int arrlength = scnr.nextInt();
       
        ArrayList presortarray = new ArrayList<Integer>();
        presortarray = createarray(arrlength);
        
        
        MergeSort sorter = new MergeSort();
        sorter.splitarray(0, presortarray.size()-1, presortarray);
        
        
    }
}
