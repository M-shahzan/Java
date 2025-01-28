#include<stdio.h>
#include<stdlib.h>
struct student{
    char name[50],usn[10],phone[10],branch[15],sem[5];
    struct student *link;
};
struct student *first=NULL,*cur,*prev,*temp;
void insertf();
void insertr();
void display();
void deletef();
void deleter();
int main()
{
    int ch;
    while(1)
    {
        printf("1.insert front\n2.insert rear\n3.delete front\n4.delete rear\n5.display\n6.exit\n");
        printf("enter your choice\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:insertf();
            break;
            case 2:insertr();
            break;
            case 3:deletef();
            break;
            case 4:deleter();
            break;
            case 5:display();
            break;
            case 6:exit(0);
        }
    }
}
void insertf()
{
    temp=(struct student*)malloc(sizeof(struct student));
    printf("enter the name usn branch sem phone\n");
    scanf("%s%s%s%s%s",temp->name,temp->usn,temp->branch,temp->sem,temp->phone);
    temp->link=first;
    first=temp;
}
void insertr()
{
    temp=(struct student*)malloc(sizeof(struct student));
    printf("enter the name usn branch sem phone\n");
    scanf("%s%s%s%s%s",temp->name,temp->usn,temp->branch,temp->sem,temp->phone);
    temp->link=NULL;
    if(first==NULL)
    {
        first=temp;
        return;
    }
    cur=first;
    while(cur->link!=NULL)
        cur=cur->link;
    cur->link=temp;    
}
void display()
{
    int c=0;
    temp=(struct student*)malloc(sizeof(struct student));
    if(first==NULL)
    {
        printf("list is empty");
        return;

    }
    printf("\nName\t\tusn\t\tbranch\t\tsem\t\tphone\n\n");
    temp = first;
    while(temp!=NULL)
    {
        printf("%s\t%s\t%s\t%s\t%s\n",temp->name,temp->usn,temp->branch,temp->sem,temp->phone);
        temp=temp->link;
        c++;
    }
    printf("total = %d\n",c);
}
void deletef()
{
    if(first==NULL)
    {
        printf("list is empty\n");
        return;

    }
    temp=first;
    printf("first node deleted\n");
    first=first->link;
    free(temp);
}
void deleter()
{
    if(first==NULL)
    {
        printf("list is empty\n");
        return;

    }
    if(first->link==NULL)
    {
        printf("contains one  node deleted\n");
        first=NULL;
        return;
    }
    prev=NULL;
    cur=first;
    while(cur->link!=NULL)
    {
        prev=cur;
        cur=cur->link;
    }
    prev->link=NULL;
    printf("last node deleted\n");
    free(cur);
    
}