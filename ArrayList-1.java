/*NOTE: ArrayList ---> package*/

import java.util.ArrayList;
public class Main{
    public static void main(String args[]){
     
     ArrayList<String> food = new ArrayList<String>();
     
     food.add("pizza");
     food.add("handburgger");
     food.add("hotdogs");
      
     food.set(0, "Sushi");
     
     for(int i=0; i<food.size();i++){
         System.out.println(food.get(i));
     }
     } 
}
