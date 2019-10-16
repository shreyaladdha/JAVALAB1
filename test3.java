abstract class solid
{
    abstract void Calculate_area();
    abstract void Calculate_volume();
}
import java.util.*;
class cylinder extends solid
{
    double vol,area;
    int r,h;
    Scanner sc =new Scanner(System.in);
    
    void getdata()
    {
        System.out.println("ENTER RADIUS AND HEIGHT OF CYLINDER");
        r=sc.nextInt();
        h=sc.nextInt();
    }
    void Calculate_area()
    {
        area=(2*3.14*r*h)+(2*3.14*r*r);
        System.out.println("AREA OF CYLINDER: "+area);
    }
    void Calculate_volume()
    {
        vol=2*3.14*r*h;
        System.out.println("VOLUME OF CYLINDER: "+vol);
    }
}

import java.util.*;
class cone extends solid
{
    double vol,area;
    int r,h;
    Scanner sc =new Scanner(System.in);
    
    void getdata()
    {
        System.out.println("ENTER RADIUS AND HEIGHT OF CONE");
        r=sc.nextInt();
        h=sc.nextInt();
    }
    void Calculate_area()
    {
        area=(3.14*r)*(r+Math.sqrt((h*h)+(r*r)));
        System.out.println("AREA OF CONE: "+area);
    }
    void Calculate_volume()
    {
        vol=(3.14*r*r*h)/3;
        System.out.println("VOLUME OF CONE: "+vol);
    }
}

import java.util.*;
class sphere extends solid
{
    double vol,area;
    int r;
    Scanner sc =new Scanner(System.in);
    
    void getdata()
    {
        System.out.println("ENTER RADIUS OF SPHERE");
        r=sc.nextInt();
        
    }
    void Calculate_area()
    {
        area=4*3.14*r*r;
        System.out.println("AREA OF SPHERE: "+area);
    }
    void Calculate_volume()
    {
        vol=(4/3)*3.14*r*r*r;
        System.out.println("VOLUME OF SPHERE: "+vol);
    }
}
import java.util.*;
class solidmain
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        cylinder cy=new cylinder();
        cone co=new cone();
        sphere sp=new sphere();
        for(;;)
        {
        System.out.println("1.Cylinder");
        System.out.println("2.Cone");
        System.out.println("3.sphere");
        System.out.println("4.exit");
        n=sc.nextInt();
        switch(n)
        {
            case 1: cy.getdata();
                    cy.Calculate_area();
                    cy.Calculate_volume();
                    break;
            case 2:co.getdata();
                    co.Calculate_area();
                    co.Calculate_volume();
                    break;
            case 3:sp.getdata();
                    sp.Calculate_area();
                    sp.Calculate_volume();
                    break;
            case 4: System.exit(0);
        }
    }
}
}
                    
            
        
        
        
       
