
package Recursion;

import java.util.ArrayList;
import java.util.List;


public class ArrayFlattening {
    public static void main(String[] args) {
       Object[]mixedData={
       10,
           new Object[]{20,new Object[]{30,40}},
           50,
           new Object[]{new Object[]{new Object[]{60}}},
           70
       
       };
        
        List<Integer>flatlist=flatten(mixedData);
        System.out.println("list is: "+flatlist);
    
    }
    
    public static List<Integer>flatten(Object[]arr){
       List<Integer>result=new ArrayList<>();
        
       for(Object item:arr){
       if(item instanceof Integer){
       result.add((Integer)item);
       
       }
       else if(item instanceof Object[]){
       result.addAll(flatten((Object[])item));
       
       }
       
       
       
       }
    return result;
    }
    
}
