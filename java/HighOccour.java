
import java.util.Scanner;

class check
{
    check(int arr[])
    {
        int count1 = 0;
        
        int ele = 0;
        for(int i=0;i<arr.length;i++)
        {
            int count2 = 0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    count2++;
            }
            if(count2>count1)
            {
                count1 = count2;
                ele = arr[i];
            }
        }
        System.out.println("Highest Occouring element is : "+ele);
    }
}
public class HighOccour {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the size if array:");
        int n =S.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = S.nextInt();
        }
        check ck = new check(arr);
        
    }
}
