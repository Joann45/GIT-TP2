import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args){
        Map<String, Integer> test = new HashMap<>();
        test.put(null,null);
        test.put("test",2);
        System.out.println(test);
    }
}
