/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
import java.util.*;
import java.lang.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
     static long M=1000003;
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        long N,X; 
        //long[][] arr=new long[T][T];                // Reading input from STDIN
        for(int i=0;i<T;i++){
            N=s.nextLong();
            X=s.nextLong();
            if(N>M){
                System.out.println(0);
            }
            // arr[i][0]=N;
            // arr[i][1]=X;
            // System.out.println(i);
            else{
            System.out.println((factorial(N%M)*X)%M);
        }}}
     static long factorial(long n){ 
         long res=1;
         for(int i=2;i<=n;i++){
             res=((res%M)*(i%M))%M;
         }
         return res%M;
//     if (n == 0)    
//     return 1;    
//   else    
//     return(n * factorial((n-1)%M));  
 }    
        

        // Write your code here

}
