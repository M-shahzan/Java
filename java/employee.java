
import java.util.Scanner;

class empDetails
{
    Scanner S = new Scanner(System.in);
    String name,pos;
    double salary;
    void input()
    {
        System.out.println("Enter employee name : ");
        name = S.nextLine();
        System.out.println("Enter employee position :");
        pos = S.next().toLowerCase();
        System.out.println("Enter employee salary");
        salary = S.nextInt();
    }
    void show()
    {
        System.out.println("Employee Name : "+name);
        System.out.println("employee position : "+pos);
        System.out.println("Employee salary : "+salary);
    }
}
class position extends empDetails
{
    void display()
    {
        super.input();
        if("manager".equals(pos))
        {
            salary = salary*(1+20.0/100);
        }
        else if(pos.equals("developer"))
            salary =salary*(1+10.0/100);
        super.show();
    }
}
public class employee {
    public static void main(String args[])
    {
        position P = new position();
        P.display();
    }
}
