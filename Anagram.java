
import java.util.Scanner;

class check
{
    int count = 0;
    char[] strArr(String str)
    {
        char temp;
        char[] arr = str.toLowerCase().toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    void compare(char arr1[],char arr2[])
    {  
        if(arr1.length==arr2.length)
        {
            for(char i=0;i<arr1.length;i++)
            {
                if(arr1[i]==arr2[i])
                {
                    count++;
                }
            }
        }
    }
}
public class Anagram {
    public static void main(String args[])
    {
        check Ck = new check();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String str1 = S.next();
        System.out.println("Enter the second String : ");
        String str2 = S.next();
        char arr1[] = Ck.strArr(str1);
        char arr2[] = Ck.strArr(str2);
        Ck.compare(arr1,arr2);
        if(Ck.count==str1.length() && Ck.count==str2.length())
            System.out.println("'"+str1+"' Is an Anagram of '"+str2+"'");
        else
            System.out.println("'"+str1+"' Is not an Anagram of '"+str2+"'");
    }
}