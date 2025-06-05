#include<stdio.h>
int fib(int n)
{
    if (n==1 || n==2)
    {
        return 1;
    }
    else if(n==0)
    {
        return 0;
    }
    else
    {
        return fib(n-1)+fib(n-2);
    }
}
int main()
{
    int a;
    printf("Enter the number to get fibonacci series number\n");
    scanf("%d",&a);
    printf("The number is %d",fib(a));
    return 0;
}