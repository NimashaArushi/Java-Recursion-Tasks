
package Recursion;

public class comment {

    
    public static void main(String[] args) {
        // Defining a multi-dimensional array containing Strings and nested Arrays
         Object[]conversation={
             "comment-1",
             new Object[]{"Reply1.1","Reply 1.2"},
             "comment 2",
              new Object[]{"Reply2.1","Reply 2.2"},
             "comment 3",
              new Object[]{"Reply3.1"},
              "comment 4"
              
         };
         // Calling the recursive method and storing the result in 'total'
    int total=countAll(conversation);
    // Printing the final count to the console
        System.out.println("Total Comment and Replies : "+total);
    }

    private static int countAll(Object[] arr) {
        int count=0;
        
        for(Object item:arr){
            if(item instanceof String){
            count++;
            }
            else if(item instanceof Object[]){
                count+=countAll((Object[])item);
            
            }
        }
        
        return count;
        
    }


}