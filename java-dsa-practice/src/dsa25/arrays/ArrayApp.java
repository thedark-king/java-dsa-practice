package dsa25.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayApp {

    public static void main(String[] args){
        //ArrayLists implementation
        List<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Ram");
        names.add("Raj");
        names.add("Ramesh");

        System.out.println(names.get(1));




        //Array's implementation
        int[] num = new int[10];
        for(int i=0; i<10; i++){
            num[i]=i;
        }

//        for(int i=0; i<10;i++){
//            System.out.println(num[i]);
//        }
    }
}
