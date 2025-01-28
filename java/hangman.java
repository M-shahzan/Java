
import java.util.Random;
import java.util.Scanner;

class play
{
    char word[];
    char guess[];
    int count = 6;
    
    char[] word()
    {
        String animal[] = {"Dog", "Cat", "Elephant", "Lion", "Tiger", "Bear", "Rabbit", "Horse", "Fish", "Bird"};
        String color[] = {"Red", "Blue", "Green", "Yellow", "Purple", "Orange", "Pink", "Brown", "Black", "White"};
        String bird[] = {"duck", "Sparrow", "Eagle", "Pigeon", "Parrot", "Owl", "Crow", "Penguin", "Flamingo", "Woodpecker"};
        Random R = new Random();
        int c = R.nextInt(3);
        if(c==1)
            word = animal[R.nextInt(10)].toLowerCase().toCharArray();
        else if(c==2)
            word = color[R.nextInt(10)].toLowerCase().toCharArray();
        else
            word = bird[R.nextInt(10)].toLowerCase().toCharArray();
        guess = new char[word.length];
        for(int i=0;i<word.length;i++)
        {
            guess[i] = '_';
        }
        return word;
    }
    void check(char ch)
    {
        int wrd = 0;
        boolean chck = false;
        for(int i=0;i<word.length;i++)
        {
            if(word[i]==ch)
                guess[i]=word[i];
        }
        for(int i=0;i<word.length;i++)
        {
            if(word[i]==ch)
            {
                chck = true;
                break;
            }
        }
        if(!chck)
            count--;
        for(int i=0;i<word.length;i++)
        {
            if(word[i]==guess[i])
                wrd++;
        }
        if(wrd==word.length)
        {
            display();
            System.out.println("you win");
            System.exit(0);
        }
    }
    void display()
    {
         for(int i=0;i<word.length;i++)
        {
            System.out.print(guess[i]+" ");
        }
    }
    
}
public class hangman {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System .in);
        play P = new play();
        P.word();
        while(P.count>=0)
        {
            P.display();
            System.out.println("Guess left : "+P.count);
            System.out.println("Enter your guess");
            char guess = S.next().toLowerCase().charAt(0);
            P.check(guess);
            if(P.count==0)
            {
                System.out.println("you loose");
                System.out.println("the word was : ");
                 for(int i=0;i<P.word.length;i++)
                 {
                    System.out.print(P.word[i]);
                 }
                 System.out.println(); 
                 System.exit(0);
            }
        }
    }
}
