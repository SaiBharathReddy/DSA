/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner sc = new Scanner(System.in);
         int M=sc.nextInt();
        List<Integer> l=new ArrayList<>();
         for(int i=0;i<M;i++){
             l.add(sc.nextInt());
         }
         Collections.sort(l);
         int len=l.size();
         int max=l.get((len-1));
        int min=l.get(0),k,f=0;
        for(int i=2;i<=max/2;i++){
            k=l.get(0)%i;
            f=0;
            for(int j=1;j<M;j++){
                if((k^(l.get(j)%i))==0){
                    continue;
                }
                else{
                    f=1;
                    break;
                }
         }
         if(f==0){
         System.out.print(i+" ");}
        }
       

        

        // Write your code here

    }
}
