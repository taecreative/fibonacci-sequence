public class Fibonacci {

   // Recursive implementation
   public static long fibRecursive(int n) {
       if (n <= 1) {
           return n;
       } else {
           return fibRecursive(n-1) + fibRecursive(n-2);
       }
   }

   // Iterative implementation
   public static long fibIterative(int n) {
       if (n <= 1) {
           return n;
       }

       long fib = 1;
       long prevFib = 1;

       for (int i = 2; i <n; i++) {
    	   if(i % 20 ==0) {
    		     }
           long temp = fib;
           fib += prevFib;
           prevFib = temp;
       }

       return fib;
   }

   public static void main(String[] args) {
       int[] inputSizes = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
       System.out.println("Recursive Fibonacci:");
       for (int n : inputSizes) {
           long startTime = System.nanoTime();
           long result = fibRecursive(n);
           long endTime = System.nanoTime();
           long duration = (endTime - startTime);
           System.out.println("Input Size = " + n + " - Time = " + + duration + " ns "+ " - Value = " + result);
       }

       System.out.println("\nIterative Fibonacci:");
       for (int n : inputSizes) {
           long startTime = System.nanoTime();
           long result = fibIterative(n);
           long endTime = System.nanoTime();
           long duration = (endTime - startTime);
           System.out.println("Input Size = " + n + " - Time = " + duration + " ns "  + " - Value = " + result);
       }
   }
}
