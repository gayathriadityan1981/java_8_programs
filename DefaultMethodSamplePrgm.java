   
public class DefaultMethodSamplePrgm implements DefaultMethodRepository{  
     public static void main(String[] args) {  
      DerivedClass obj = new
      DerivedClass();
      obj.defaultMethodSample();
     }
}
class DerivedClass implements DefaultMethodRepository{
 
}
 interface DefaultMethodRepository {
    default void defaultMethodSample() {
        System.out.println("I am in defaultMethodSample method");
    }
}
