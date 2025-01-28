
import java.util.Scanner;

class str
{
    String num[] = new String[20];
    int intList3[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    String numList3[] = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    int intList1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    String numList1[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int intList2[] = {11, 12, 13, 14, 15, 16, 17, 18, 19};
    String numList2[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String numList4[] = {"hundred", "thousand", "lakh", "crore"};
    int intList4[] = {100,1000,100000,10000000};
    int out = 0;
    
    void convert(String str)
    {
        int temp=0;
        num = str.split(" ");
        boolean insert;
        for(int i=0;i<num.length;i++)
        {
            insert = false;
            for(int j=0;j<numList1.length;j++)
            {
                if(num[i].equals(numList1[j]))
                    temp=intList1[j];
                else if(num[i].equals(numList2[j]))
                    temp=intList2[j];
                else if(num[i].equals(numList3[j]))
                    temp=intList3[j];
                
            }
            if(i!=num.length-1)
            {
                for(int j=0;j<numList1.length;j++)
                {
                    if(num[i+1].equals(numList1[j]))
                    {
                        temp+=intList1[j];
                        i++;
                        break;
                    }
                }
            }
            if(i!=num.length-1)
            {
                for(int j=0;j<numList4.length;j++)
                {
                    if(num[i+1].equals(numList4[j]))
                    {
                        out+=temp*intList4[j];
                        insert = true;
                        break;
                    }
                }
            }
            if(!insert)
                out+=temp;
            else
                i++;
        }
    }
}
public class NumToStr {
    public static void main(String args[])
    {
        str con = new str();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number  in words : ");
        String str = S.nextLine();
        con.convert(str);
        System.out.println(con.out);
    }
}
