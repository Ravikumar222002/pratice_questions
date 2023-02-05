package questions.arrays;

import java.util.HashMap;
import java.util.Map;

public class TestNestedMap {

    public static void main(String[] args) {

        Map<String, Map<String, String>> employeeMap = new HashMap<>();

        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("Permanent", "Florida");
        addressMap.put("Postal", "Canada");
        employeeMap.put("Alex1", addressMap);

        Map<String, String> addressMap2 = new HashMap<>();
        addressMap2.put("Permanent2", "Florida2");
        addressMap2.put("Postal2", "Canada2");
        employeeMap.put("Alex2", addressMap2);

        System.out.println("map: " + employeeMap);
        System.out.println("map value: " + employeeMap.keySet());

        for(String map : employeeMap.keySet()){
            System.out.println("values of key :" + employeeMap.get(map));
        }

        for(String map : employeeMap.keySet()){
            for (Map.Entry<String,String> e :employeeMap.get(map).entrySet()){
                 if(e.getKey() == "Postal2"){
                     System.out.println(e.getValue());
                 }
            }
        }

    }
}
