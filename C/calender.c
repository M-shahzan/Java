#include<stdio.h>
#include<stdlib.h>
struct day
{
    char *name;
    int date;
    char *desc;
};
void create(struct day calander[7])
{
    for(int i=0;i<7;i++)
    {
        calander[i].name=(char *)malloc(50*sizeof(char));
        calander[i].desc=(char *)malloc(200*sizeof(char));
        printf("enter name of day:");
        scanf("%s",calander[i].name);
        printf("enter date:");
        scanf("%d",&calander[i].date);
        printf("enter desc:");
        getchar();
        scanf("%[^\n]",calander[i].desc);
    }
}
void display(struct day calander[7])
{
    for(int i=0;i<7;i++)
    {
        printf("day : %s\ndate : %d\ndescription : %s\n\n",calander[i].name,calander[i].date,calander[i].desc);
    }
}
int main()
{
    struct day *calander = (struct day*)malloc(7*sizeof(struct day));
    if(calander==NULL)
    {
        printf("allocation failed\n");
        return 1;
    }
    create(calander);
    display(calander);
    for(int i=0;i<7;i++)
    {
        free(calander[i].name);
        free(calander[i].desc);
    }
    free(calander);
}