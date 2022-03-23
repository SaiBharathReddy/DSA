import java.util.*;
import java.lang.*;
class TestClass {
    static int M=1000000007;
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();                 // Reading input from STDIN
        int d=4;
        int a=5,ini=1,next=6;
        long N,ans;
        //List<Integer> l=new ArrayList<>();
        for(int i=0;i<T;i++){
            N=(s.nextLong())%M;
            ans=((N-1)*(2*a+(N-2)*d))/2;
            //System.out.println(ans);
            System.out.println((ini+(ans%M))%M);
        }

    }
}
