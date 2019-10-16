import java.util.*;

abstract class series
{
    series(){}
    Scanner s = new Scanner(System.in);
    int n;
    double a,d;
    double sum = 0;    
    void getvalues()
    {
        System.out.println("\nEnter a: ");
        a = s.nextDouble();
        System.out.println("\n Enter d: ");
        d = s.nextDouble();
        System.out.println("\n Enter n: ");
        n = s.nextInt();
    }
    abstract void getNterm();
    abstract void sumall();
}
class ap extends series
{
    double x;
    ap(){}
    void getNterm()
    {
        super.getvalues();
        
        x = a + (d)*(n-1); 
        System.out.println("Nth term is: "+x);
    }
    void sumall()
    {
        System.out.println("N terms are:");
        for(int i=0;i<n;i++)
        {
            System.out.print((a+(i*d))+"  ");
        }
        sum = (n/2)*(2*a + (n-1)*d);
        System.out.println("\n SUM of all terms is:" + sum);
        
    }   
}
import java.util.*;
class gp extends series
{
    double x;
    gp(){}
    void getNterm()
    {
        Scanner sc=new Scanner(System.in);
        super.getvalues();
        
        x = a*Math.pow(d, n-1); 
        System.out.println("\n Nth term is: " + x);
    }
    void sumall()
    
    {   
        System.out.println("N terms are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a*Math.pow(d,i)+"  ");
        }
        System.out.println();
        sum = a*(1 - Math.pow(d,n))/(1 - d);
        System.out.println("\n SUM of all terms is:" + sum);
        
    }    
}
import java.util.*;
class series_main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int i,n,ch;
        
           
           System.out.println("\n Enter no. of references to series : ");
            n = s.nextInt();
            series s1[] = new series[n];
            for( i=0;i<n;i++)
            {
                 System.out.println("\n Enter Choice: 1.GP 2.AP  ");
                 ch = s.nextInt();
            
                switch(ch)
                {
                    case 1: s1[i] = new gp();
                            s1[i].getNterm();
                            s1[i].sumall();
                            break;
                    case 2: s1[i] = new ap();
                            s1[i].getNterm();
                            s1[i].sumall();
                            break;
                    

                }
            }    
        }  
    }
