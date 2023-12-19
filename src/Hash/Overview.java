package Hash;

import java.util.HashMap;

public class Overview {
    public static void main(String[] args) {
        Employee e1 =new Employee();
        e1.setId(1);
        e1.setName("siba");

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("siba");

        System.out.println("shallow compare"+ (e1==e2)); //it will check the reference

        System.out.println("deep compare"+ e1.equals(e2)); //it will check the object


        HashMap<String,Employee> hashMap = new HashMap<>();

        hashMap.put("abc",e1);
        hashMap.put("abc",e2);

        System.out.println(hashMap.get("abc"));
    }
}
