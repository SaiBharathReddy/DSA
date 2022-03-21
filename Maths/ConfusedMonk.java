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
    static long M=1000000007;
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       List<Integer> l=new ArrayList<>();
       for(int i=0;i<N;i++){
           l.add(sc.nextInt());
       }
       Collections.sort(l);
       long a=l.get(0);
       int i=1;
       long prod=a;
       int len=l.size();
       long res=a,k;
       while(i<len){
           k=l.get(i);
        prod=(prod*k)%M;
        i++;
       }
       for(i=1;i<N;i++)

    {

        res=gcd(res,l.get(i));

    }
       //int g=gcd(a,b);
       //System.out.println(g);
       //System.out.println((Math.pow(prod,g));
       //int M=1000000007;
       //System.out.println(M);
    System.out.println(power(prod,res)%M);
    }
    public static long power(long a,long b){
        long res=1;
        while(b>0){
            if(b%2!=0){
                res=(res*a)%M;
            }
            a=(a*a)%M;
            b=b/2;}
            //System.out.println(res);
            return res;
        }
    
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
