import java.util.*;
class personal
{
    String name,depart;
    int age;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {
    System.out.println("Enter name , department and age");
    name=sc.nextLine();
    depart=sc.nextLine();
    age=sc.nextInt();
}
}
    
    import java.util.*;
class stud extends personal
{
    Scanner sc=new Scanner(System.in);
    double cgpa;
    void getdata()
    {
        super.getdata();
        System.out.println("Enter cgpa:");
        cgpa=sc.nextDouble();
    }
    void display()
    {
        System.out.println("student name: "+name);
        System.out.println("age: "+age);
        System.out.println("department: "+depart);
        System.out.println("cgpa: "+cgpa);
    }
}
import java.util.*;
class faculty extends personal
{
    Scanner sc =new Scanner(System.in);
    int no_publi;
    void getdata()
    {
        super.getdata();
        System.out.println("enter no. of publications");
        no_publi=sc.nextInt();
    }
    void display()
    {
        System.out.println("faculty name: "+name);
        System.out.println("age: "+age);
        System.out.println("department: "+depart);
        System.out.println("no of publications: "+no_publi);
    }
}

import java.util.*;
class personalmain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of students");
        int m=sc.nextInt();
        System.out.println("enter faculty number");
        int n=sc.nextInt();
        stud st[]=new stud[m];
        faculty f[]=new faculty[n];
        System.out.println("enter "+m+" students details");
        for(int i=0;i<m;i++)
        {
            st[i]=new stud();
            st[i].getdata();
        }
         System.out.println("enter "+n+" faculty details");
        for(int i=0;i<n;i++)
        {
            f[i]=new faculty();
            f[i].getdata();
        }
         System.out.println("YOUNGEST STUDENT");
         int min=st[0].age;
         int pos=0;
         for(int i=0;i<m;i++)
         {
             if(st[i].age<min)
             {
                 min=st[i].age;
                 pos=i;
                }
            }
           System.out.println(st[pos].name);
           System.out.println("FACULTY WITH MOST NO OF PUBLICATION");
         int max=f[0].no_publi;
         int pos1=0;
         for(int i=0;i<n;i++)
         {
             if(f[i].no_publi>max)
             {
                 max=f[i].no_publi;
                 pos1=i;
                }
            }
            f[pos1].display();
        }
    }
            
            
             
      
        