import java.util.*;
class publication
{
    String title;
    double price;
    void getdata()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER TITLE AND PRICE");
        title=sc.nextLine();
        price=sc.nextDouble();
    }
    void putdata()
    {
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }
}
      
import java.util.*;
class book extends publication
{
    int page_count;
    
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of pages");
        page_count=sc.nextInt();
    }
    void putdata()
    {
        super.putdata();
        System.out.println("Pages: "+page_count);
    }
    
        
}

import java.util.*;
class tape extends publication
{
    double playing_time;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter playing time");
        playing_time=sc.nextDouble();
    }
    void putdata()
    {
        super.putdata();
        System.out.println("Playing time: "+playing_time);
    }
}

import java.util.*;
class publidemo
{
    public static void main(String args[])
    { 
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of books");
        m=sc.nextInt();
        System.out.println("Enter number of tapes");
        n=sc.nextInt();
        book b[]=new book[m];
        tape t[]=new tape[n];
        for( ; ;)
        {
        System.out.println("1.BOOK");
        System.out.println("2.TAPE");
        System.out.println("3.exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            for(int i=0;i<m;i++)
            {
                b[i]=new book();
                b[i].getdata();
                b[i].putdata();
            }
            System.out.println("***Books with pages greater than 500***");
            for(int i=0;i<m;i++)
            {
                if(b[i].page_count>=500)
                System.out.print(b[i].title+"    ");
                
                
            }
            System.out.println();
            break;
            case 2:
            for(int i=0;i<n;i++)
            {
                t[i]=new tape();
                t[i].getdata();
                t[i].putdata();
            }
            break;
            case 3:
            System.exit(0);
        }
    }
}
}
        
