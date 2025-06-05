#include<stdio.h>
int main()
{
    int a;
    printf("Enter a number\n");
    scanf("%d",&a);
    if (a<0)
    {
        printf("The absolute number is %d",a*-1);
    }
    else
    {
        printf("the absolute number is %d",a);
    }
    return 0;
}