#include<stdio.h>
int main()
{
    int x,y;
    printf("Enter the value of X to find location in x-y axis\n");
    scanf("%d",&x);
    printf("Enter the value of Y to find location in X-Y axis\n");
    scanf("%d",&y);
    if(x==0)
    {
        printf("lies in Y axis\n");
    }
    else if (y==0)
    {
        printf("lies in X axis\n");
    }
    else
    {
       printf("lies not in X axis and not in Y axis\n");
    }
    return 0;
}