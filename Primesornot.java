import java.util.*;
class Primesornot
{
    static int N=10000005;
    public static int prime[]=new int[N];
    public static void sieve()
    {
        for(int i=0;i<N;i++)
        {
            prime[i]=1;
        }
        prime[0]=0;
        prime[1]=0;
        for(int x=2;x*x<N;x++)
        {
            if(prime[x]==1)
            {
                for(int i=x*x;i<N;i+=x)
                {
                    prime[i]=0;
                }
            }
        }
    }
    public static void main(String args[])
    {
        sieve();
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n;
            n=sc.nextInt();
            if(prime[n]==1)           
            System.out.println("Yes");
            else
            System.out.println("No");
            t--;
        }
    }
}

output:

3
2
Yes
4
No
5
Yes