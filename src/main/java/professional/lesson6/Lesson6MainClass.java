package professional.lesson6;

import java.util.ArrayList;

public class Lesson6MainClass {

    //1.
    public int[] array(int[] initialArray) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = initialArray.length - 1; i >=0 ; i--) {
            if (initialArray[i] == 4) {
                break;
            } else {
                integers.add(0,initialArray[i]);
            }
        }
        if (integers.size() == initialArray.length) {
            throw new RuntimeException("no such 4");
        }

        int[] array = new int[integers.size()];

        for (Integer i:integers) {
            array[integers.indexOf(i)] = i;
        }

        return array;
    }
//    2.
        public boolean composition(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1 || arr[i] == 4) {
                    return true;
                }
            }
            return false;
        }
}
