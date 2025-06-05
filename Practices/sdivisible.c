#include<stdio.h>
int main()
{
    int a;
    printf("Enter a number\n");
    scanf("%d",&a);
    if(a%3==0 && a%5==0)
    {
        printf("%d is divisible by 5 and 3",a);
    }
    else if ( a%3==0)
    {
        printf("%d is divisible by 3",a);
    }
    else if ( a%5==0)
    {
        printf("%d is divisible by 5",a);
    }
    else
    {
        printf("%d is not divisible by 5 and 3",a);
    }
    return 0;
}