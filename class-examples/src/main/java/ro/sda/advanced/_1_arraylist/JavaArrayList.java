package ro.sda.advanced._1_arraylist;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static <MyClass> void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("String 1 ");
        myList.add("String 2 ");
        myList.add("String 3 ");
        myList.add("String 4 ");

        myList.remove(1);


      for (String s : myList){
          System.out.println(s);
      }

        System.out.println(myList.contains("String 3"));
      List<MyClass> anotherList = new ArrayList<>();
    }
}
