import java.util.Optional;   
public class OptionalSamplePrgm {  
     public static void main(String[] args) {  
       String[] str = new String[10];  
       Optional<String> nullCheckString = Optional.ofNullable(str[5]);
       if(nullCheckString.isPresent()){
           System.out.println(str[5]);
       }
       else {
           System.out.println("string is null");
       }
     }
}
