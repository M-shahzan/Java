
import java.util.Scanner;

class Reverse
{
    Reverse(String str)
    {
        String arr[] = str.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
public class wordRevese {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a sentence to reverse : ");
        String str = S.nextLine();
        System.out.println("The reversed string is : ");
        Reverse R = new Reverse(str);
    }
}
