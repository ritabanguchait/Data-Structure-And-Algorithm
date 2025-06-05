#include<stdio.h>
int main()
{
    int a;
    printf("Enter a number to check prime or not\n");
    scanf("%d",&a);
    for (int i=2;i<=a-1;i++)
    {
        if(a%i==0)
        {
            printf("%d is a composite number\n",a);

        }
        else
        {
            printf("%d is a prime number\n",a);
        }
    }
    return 0;
}