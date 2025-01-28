#include<stdio.h>
#define hash_size 5
int ht[hash_size];
int main()
{
FILE *fp;
int i,key,hv,index;
char name[20];
for(i=0;i<hash_size;i++) // Initialize the hash table
ht[i]=-1;
fp=fopen("emp.txt","r"); // open file for reading
while(!feof(fp)) // until eof
{
fscanf(fp,"%d%s",&key,name);
hv=key%hash_size;
if(ht[hv]==-1)
ht[hv]=key;
else
{
printf("\nCollision for key%d:\n",key);
for(i=0;i<hash_size;i++)
{
index=(hv+i)%hash_size;
if(ht[index]==-1)
{
ht[index]=key;
printf("Collission solved used linear probing\n");
break;
}
}
}
}
if(i==hash_size)

printf("\nHash table is full\n");
printf("---------\n");
printf("\nHash Table\n");
printf("---------\n");
printf("Address\tKey\n");
for(i=0;i<hash_size;i++)
printf("%d\t%d\n",i,ht[i]);
fclose(fp);
return 0;
}