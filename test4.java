import java.util.*;
class student
{
    String usn,name;
    int phoneno;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, usn and sem");
        name=sc.nextLine();
        usn=sc.nextLine();
        phoneno=sc.nextInt();
    }
}
import java.util.*;
class marks extends student
{
    int n,cietot,seetot;
    int CIE[]=new int[20];
    int SEE[]=new int[20];
    int credits[]=new int[20];
    Scanner sc=new Scanner(System.in);
    void getdata()
    {
        super.getdata();
        System.out.println("enter no. of courses");
        n=sc.nextInt();
        System.out.println("Enter cie marks");
        for(int i=0;i<n;i++)
        {
            CIE[i]=sc.nextInt();
        }
        System.out.println("Enter SEE marks");
        for(int i=0;i<n;i++)
        {
            SEE[i]=sc.nextInt();
        }
        System.out.println("Enter credits");
        for(int i=0;i<n;i++)
        {
            credits[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            cietot=cietot+CIE[i];
            seetot=seetot+SEE[i];
        }
    }
    void display()
    {
        System.out.println("NAME: "+name+"\nusn: "+usn+"\nphone number: "+phoneno);
        System.out.println("CIE MARKS:");
        for(int i=0;i<n;i++)
        System.out.print(CIE[i]+"   ");
        System.out.println();
        System.out.println("SEE MARKS:");
        for(int i=0;i<n;i++)
        System.out.print(SEE[i]+"   ");
        System.out.println();
    }
        
}
import java.util.*;
class result extends marks
{
    int tot;
    char grade[]=new char[20];
    void calc()
    {    super.getdata();
        for(int i=0;i<n;i++)
        {
            tot=CIE[i]+SEE[i];
            if(tot>=90)
            grade[i]='S';
            if(tot<90&&tot>=80)
            grade[i]='A';
             if(tot<80&&tot>=70)
            grade[i]='B';
             if(tot<70&&tot>=60)
            grade[i]='C';
             if(tot<60&&tot>=50)
            grade[i]='D';
             if(tot<50)
            grade[i]='F';
        }
    }
    void display()
    {super.display();
        System.out.println("GRADES: ");
        for(int i=0;i<n;i++)
        System.out.print(grade[i]+"   ");
        System.out.println();
    }
}   

import java.util.*;
class studentmain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        result r[]=new result[n];
        for(int i=0;i<n;i++)
        {
            r[i]=new result();
            r[i].calc();
        }
        System.out.println("students who scored better");
        
        for(int i=0;i<n;i++)
        {
            if((r[i].cietot)<(r[i].seetot))
            {
               r[i].display();
            
        }
    }
}
}
                
            
            