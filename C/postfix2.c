#include<stdio.h>
#include<string.h>
#include<math.h>

int main()
{
    char postfix[20];
int s[20],result,op1,op2,i,top=-1;
    printf("Enter the postfix expression ");
    scanf("%s",postfix);
    for(int i=0;i<strlen(postfix);i++)
    {
        if(isdigit(postfix[i]))
        {
          s[++top]=(postfix[i]-'0');  
        }
        else{
            op2=s[top--];
            op1=s[top--];
        
        switch(postfix[i])
        {
            case '+':result=op1+op2;
                break;
            case '-':result=op1-op2;
                break;
            case '*':result=op1*op2;
                break;
            case '/':result=op1/op2;
                break;
            case '%':result=op1%op2;
                break;
            case '^':result=pow(op1,op2);
                break;
                
        }
        s[++top]=result;
    }
    }
    printf("\n result=%d",result);
}