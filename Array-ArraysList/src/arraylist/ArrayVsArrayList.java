package arraylist;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        // el problema es utlizar esta forma es que no se puede añádir ni quitar elementos
        String[] orignalArray = new String[] {"First", "Second", "Third"};
        var orignalList = Arrays.asList(orignalArray);

        orignalList.set(0,"one");
        System.out.println("list: " + orignalList);
        System.out.println("array: " + Arrays.toString(orignalArray));

        orignalList.sort(Comparator.naturalOrder());
        System.out.println("array" + Arrays.toString(orignalArray));
    }
}
