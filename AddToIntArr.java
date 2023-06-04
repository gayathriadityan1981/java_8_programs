import java.util.*;
import  java.util.stream.Collectors;  

public class AddToIntArr {
    public static void main(String[] args) {
        /* Add 5 to each element in an integer array
        */
        List<Integer> intList = new ArrayList();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        List<Integer> result = intList.stream().map(i-> i+5).collect(Collectors.toList());
        System.out.println("Result :" + result.toString());
    }
}
