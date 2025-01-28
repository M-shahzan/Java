#include<stdio.h>
#include<stdlib.h>
char str[100],pat[50],rep[50],nstr[100];
int i=0,j=0,k=0;l,exist,n=0;
void findAndReplace();
int main()
{

    printf("enter the string:");
    gets(str);
    printf("enter the patern:");
    gets(pat);
    printf("enter replacement:");
    gets(rep);
    findAndReplace();
}
void findAndReplace()
{
    while(str[i]!='\0')
    {
        j=0,k=i;
        while(str[k]==pat[j]&&pat[j]!='\0')
        {
            j++;
            k++;
        }
        if(pat[j]=='\0')
        {
            exist=1;
            for(int l=0;str[l]!='\0';l++)
            {
                nstr[n++]=rep[l];
                i=k;

            }
        }
        else
            nstr[n++]=str[i++];
    }
    if(!exist)
        printf("patern does not exist\n");
    else
    {
        nstr[n]='\0';
        printf("after replacinng:");
        puts(nstr);
    }
}
