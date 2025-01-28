#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define max 20
int s[max],top=-1,ch;
int i,temp,ele;
void push();
void pop();
void pali();
void display();
int main()
{
    while(1)
    {
        printf("1.push\n2.pop\n3.Palindrome\n4.display\n5.exit\n");
        printf("enter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:push();
            break;
            case 2:pop();
            break;
            case 3:pali();
            break;
            case 4:display();
            break;
            case 5:exit(0);
        }
    }
}
void push()
{
    if(top+1==max)
    {
        printf("stack ia full\n");
        return;
    }
    printf("enter the ele");
    scanf("%d",&ele);
    s[++top]=ele;
}
void pop()
{
    if(top==-1)
    {
        printf("stack is empty\n");
        return;
    }
    printf("popped %d",s[top--]);
}
void display()
{
    if(top==-1)
    {
        printf("stack is empty\n");
        return;
    }
    for(i=top;i>=0;i--)
        printf("%d\n",s[i]);  
}
void pali()
{
    char a[100],b[100];
    int count=0,l;
    printf("enter to check: ");
    scanf("%s",a);
    l=strlen(a);
    for(int i=0;i<l;i++)
    {
        b[i]=a[l-i-1];
    }
    b[l]='\0';
    if(strcmp(a,b)==0)
        printf("it is palindrome\n");
    else
        printf("it is not palindrome\n");
}