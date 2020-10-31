import java.util.*;
public class project22
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int mon,day,year,ndays;
        System.out.println("PROJECT ALLOTMENT DATE");
        System.out.print("Day  \t   \t:  \t");
        day=in.nextInt();
        System.out.print("Month  \t   \t:  \t");
        mon=in.nextInt();
        System.out.print("Year  \t   \t:  \t");
        year=in.nextInt();
        System.out.print("Number of days \t : \t");
        ndays=in.nextInt();
        project22 g=new project22();
 
        int day1[]={31,28,31,30,31,30,31,31,30,31,30,31};int day2[]={31,29,31,30,31,30,31,31,30,31,30,31};
        if(year%4!=0)
        {
            g.date(day,mon,year,ndays,day1);
        }
        else if(year%4==0)
        {
            g.date(day,mon,year,ndays,day2);
        }
        
    }
    public void date(int day,int mon,int year,int ndays,int day1[])
        {
        int sub=ndays+day;int newday=0;
        int c= mon-1;
        
         if(sub > day1[c])
         {
             do
             {
                sub=sub-day1[c];
                if(mon==12)
                {
                     mon=1;year++;c=11;
                }
                else if(mon==1)
                {
                    mon++;c=0;
                }
                else
                {
                      mon++; c++;
                } 
             }while(day1[c]<sub);
            newday=sub-1;
         }
         else if(sub < day1[mon-1])
         {
            newday=sub-1;
         }
        
        System.out.println("PROJECT SUBMISSION DATE");
        System.out.println("Day  \t   \t:  \t"+newday);
        
        System.out.println("Month  \t   \t:  \t"+mon);
        
        System.out.println("Year  \t   \t:  \t"+year);
    }
}
       
        
