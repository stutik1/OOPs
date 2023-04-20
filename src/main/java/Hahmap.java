import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hahmap {
    public static void main(String args[]){
        // country(K), population(V)
        HashMap<String,Integer> hash = new HashMap<String,Integer>();
        //Insertion
        hash.put("India",2000);
        hash.put("China",9800);
        hash.put("US",4000);
        System.out.println(hash);

        hash.put("India",400);
        System.out.println(hash);

        //Search
        if(hash.containsKey("China")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // get method
        System.out.println(hash.get("China"));
        System.out.println(hash.get("UK"));

        // Iteration in method

        for (Map.Entry<String,Integer> e: hash.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(int i=0;i< hash.size();i++){

        }

        Set<String> keys = hash.keySet();
        for (String key : keys){
            System.out.println(key + " " + hash.get(key));
        }

        // remove method
//        hash.remove("China");
//        System.out.println(hash);
        int x=hash.remove("China");
       System.out.println("x="+x);
        System.out.println("guru "+hash);
    }
}
