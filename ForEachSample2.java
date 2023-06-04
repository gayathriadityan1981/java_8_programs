import java.util.ArrayList;  
import java.util.List;  
public class ForEachSample2 {  
     public static void main(String[] args) {  
        List<String> subList = new ArrayList<String>();  
        subList.add("Maths");  
        subList.add("English");  
        subList.add("French");  
        subList.add("Sanskrit");
        subList.add("Abacus");
        System.out.println("------------Subject List--------------"); 
        subList.forEach(sub->System.out.println(sub));
     }
}
