
package Recursion;

public class calculate {
  
    
    
    public static void main(String[] args) {
           //  Base Case:
      int num=123;
      
        // SUM of Digits
         int sumresult=sumdigits(num);
        System.out.println("Sum of digits is: "+sumresult);
        
        //Product Of Digits
        int productresult=productsigits(num);
        System.out.println("Product of digits is: "+productresult);
 
    }

    private static int sumdigits(int n) {
            // 1. Base case: Stop when the number becomes 0
            if (n == 0) {
           return 0;
         }
     
        // 2. Extract the last digit
        int lastdigit = n % 10;

        // 3. Recursive call: Add last digit to the sum of remaining digits
        return lastdigit + sumdigits(n / 10);
     }

    private static int productsigits(int n) {
       if(n==0){return 1;}
       return(n%10)*productsigits(n/10);
    }
     
     
    }
    

