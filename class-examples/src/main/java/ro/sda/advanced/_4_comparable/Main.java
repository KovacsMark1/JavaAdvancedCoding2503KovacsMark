package ro.sda.advanced._4_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(9);
        array.add(6);
        array.add(4);
        array.add(7);

      //  array.forEach((el) -> System.out.println(el));

        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

        Collections.sort(array);

        System.out.println("^^^^^^^^^^^^^^^^");



    }
}
