import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MergeSort {
    public static ArrayList<Integer> createarray(int x){
        ArrayList arrlist = new ArrayList<Integer>();
        Random rd = new Random();
        for (int i = 0; i < x; i++){
            int randomnum = rd.nextInt(100+1);
            arrlist.add(randomnum);            
        }
        
        return arrlist;
    }

    public void splitarray(int startnum, int endnum, ArrayList<Integer> array){

        if (startnum < endnum && (endnum-startnum) >=1){
            int mid = (endnum +startnum)/2;
            splitarray(startnum, mid, array);
            splitarray(mid+1, endnum, array);

            mergearray(startnum, mid, endnum, array);
        }
    }
    public void mergearray(int startnum, int midnum, int endnum, ArrayList<Integer> array){
        ArrayList<Integer> mergedarray = new ArrayList<Integer>();
        int left = startnum;
        int right = midnum + 1;

        while(left <= midnum && right <= endnum){
            if (array.get(left) <= array.get(right)){
                mergedarray.add(array.get(left));
                left++;
            }
            else{
                mergedarray.add(array.get(right));
                right++;
            }
        }
        while(left <= midnum){
            mergedarray.add(array.get(left));
            left++;
        }
        while(right <= endnum){
            mergedarray.add(array.get(right));
            right++;
        }
        int i = 0;
        int j = startnum;
        while(i<mergedarray.size()){
            array.set(j, mergedarray.get(i++));
            j++;
        }
        if (mergedarray.size() >= array.size()){
            System.out.println(Arrays.toString(array.toArray()));
        }
    }

}
