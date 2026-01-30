
package Recursion;


public class RootFolder {

   
    public static void main(String[] args) {
        Object[]rootfolder={
        50,
            new Object[]{100,200},
        30,
        new Object[]{220,300},
        40
        };
        
        int total=countall(rootfolder);
        System.out.println("File and folders :"+total);
   
    }

private static int countall(Object[] arr) {
    int count=0;
      for(Object item:arr){
      if(item instanceof Integer){
      count++;
      }
      else if(item instanceof Object[]){
      count+=countall((Object[])item);
      }
      }
      return count;
    }
    
}
