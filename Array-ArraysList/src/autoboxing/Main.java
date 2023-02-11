package autoboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // preferend but unnecesary

        Integer deprecateBoxing  = new Integer(15); // deprecate since jdk 9

        int unboxedInt = boxedInt.intValue();           //unncesary

        //Autoboxing
        Integer autoBoxed = 15;

        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] charactersArray = {'a','b','c','d'};

        System.out.println(Arrays.toString(charactersArray));

        var ourList = getList(1,2,3,4,5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> aList = new ArrayList<>();

        for (int i : varargs){
            aList.add(i);
        }
        return aList;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.000);
    }

    private static double getDoublePrimitive(){
        return 100.00;
    }

    private static int returnAnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }
}
