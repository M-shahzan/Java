#include<stdio.h>
int a[10][10],n,s[10];
void dfs(int u)
{
    int v,i;
    s[u]=1;
    printf("%d",u);
    for(v=0;v<n;v++)
    {
        if(a[u][v]==1 && s[v]==0)
            dfs(v);
    }   

}
void main()
{
    int soource;
    printf("enter the no of nodes: ");
    scanf("%d",&n);
    printf("enter the matrix: \n");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
            scanf("%d",&a[i][j]);
    }
    printf("enter the source node : ");
    scanf("%d",&soource);
    printf("nodes reachable from %d : ",soource);
    dfs(soource);
    printf("\n");
}