/*NOTE: ArrayList ---> package*/

import java.util.ArrayList;
public class Main{
    public static void main(String args[]){
     
     ArrayList<String> food = new ArrayList<String>();
     
     food.add("pizza");
     food.add("handburgger");
     food.add("hotdogs");
      
     food.set(0, "Sushi");
     food.remove(2);
     //food.clear();-----> clear the whole output data   
        for(int i=0; i<food.size();i++){
         System.out.println(food.get(i));
     }
     } 
}
