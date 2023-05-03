import java.util.*;
public class Main{
    public static void main(String args[]){
        String name = "see / neelu";
        //boolean result = name.equals("neelu");
        //boolean result = name.equalsIgnoreCase("NEElu");
        //int result = name.length();
        //char result = name.charAt(2);
       // int result = name.indexOf("l");
       //boolean result = name.isEmpty();
      // String result1 = name.toUpperCase();
      // String result = name.toLowerCase();
      // String result = name.trim();
      // String result = name.replace("e","a");
     // String  result = name.substring(4);------> rermoves char upto the given index
      String result[] = name.split("/" , 2); -------> [see , neelu]
        System.out.println(Arrays.toString(result));
     
        
    }
}
