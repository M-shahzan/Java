import java.util.Scanner;

class Staff 
{
    int id;
    String name;
    String phone;
    double salary;
    void input() 
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Staff ID: ");
        id = S.nextInt();
        S.nextLine();
        System.out.println("Enter Staff Name: ");
        name = S.nextLine();
        System.out.println("Enter Staff Phone: ");
        phone = S.nextLine();
        System.out.println("Enter Staff Salary: ");
        salary = S.nextDouble();
    }
    void display() 
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
    }
}
class Teaching extends Staff {
    String domain;
    int publc;
    void input() 
    {
        super.input();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Domain: ");
        domain = S.nextLine();
        System.out.println("Enter Number of Publications: ");
        publc = S.nextInt();
    }
    void display() 
    {
        super.display();
        System.out.println("Domain: " + domain);
        System.out.println("Publications: " + publc);
    }
}
class Technical extends Staff {
    String skills;
    void input() 
    {
        super.input();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Skills: ");
        skills = S.nextLine();
    }
    void display() 
    {
        super.display();
        System.out.println("Skills: " + skills);
    }
}
class Contract extends Staff {
    int period;
    void input() 
    {
        super.input();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Contract Period (in months): ");
        period = S.nextInt();
    }
    void display() 
    {
        super.display();
        System.out.println("Contract Period: " + period + " months");
    }
}
public class staffDetails {
    public static void main(String args[]) 
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the number of Teaching staff: ");
        int teachingCount = S.nextInt();
        S.nextLine();

        System.out.println("Enter the number of Technical staff: ");
        int technicalCount = S.nextInt();
        S.nextLine();

        System.out.println("Enter the number of Contract staff: ");
        int contractCount = S.nextInt();
        S.nextLine();

        Teaching[] teachingStaff = new Teaching[teachingCount];
        Technical[] technicalStaff = new Technical[technicalCount];
        Contract[] contractStaff = new Contract[contractCount];
        System.out.println("Enter the details of Teaching staff: ");
        for (int i = 0; i < teachingCount; i++) 
        {
            teachingStaff[i] = new Teaching();
            teachingStaff[i].input();
        }
        System.out.println("Enter the details of Technical staff: ");
        for (int i = 0; i < technicalCount; i++) 
        {
            technicalStaff[i] = new Technical();
            technicalStaff[i].input();
        }
        System.out.println("Enter the details of Contract staff: ");
        for (int i = 0; i < contractCount; i++) {
            contractStaff[i] = new Contract();
            contractStaff[i].input();
        }
        System.out.println("Teaching staff: ");
        for (int i = 0; i < teachingCount; i++) 
            teachingStaff[i].display();
        System.out.println("Technical staff: ");
        for (int i = 0; i < technicalCount; i++) 
            technicalStaff[i].display();
        System.out.println("Contract staff: ");
        for (int i = 0; i < contractCount; i++) 
            contractStaff[i].display();
    }
}