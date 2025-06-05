#include<stdio.h>
int main()
{
    int a;
    printf("Enter a number to Check odd or even\n");
    scanf("%d",&a);
    if(a%2==0)
    {
        printf("%d is a even number",a);

    }
    else
    {
       printf("%d is a odd number",a);
    }
 return 0;
}