import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "IVXLCDMDCLX";

        //String str = "MMMCMXCIX";
        map = Dictionary(map);
        System.out.println(ConvectorRomeToInteger(str,map));


    }

    static int ConvectorRomeToInteger(String str, Map<Character, Integer> map){
        List<Integer> array = new ArrayList<>();
        int trueSumm = 0;
        for(char c: str.toCharArray()){
            array.add(map.get(c));
        }
        System.out.println(array);
        trueSumm = array.getLast();
        for(int i=array.size()-2; i>=0; i--){
            if(array.get(i+1) <= array.get(i)){
                trueSumm += array.get(i);

            }

            else{
               trueSumm -= array.get(i);
            }
        }
        return trueSumm;
    }


     static Map<Character, Integer> Dictionary(Map<Character, Integer> map){
         map.put('M', 1000);
         map.put('D', 500);
         map.put('C', 100);
         map.put('L', 50);
         map.put('X', 10);
         map.put('V', 5);
         map.put('I', 1);
        return map;
    }


}