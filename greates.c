#include<stdio.h> 
int main()
{
    int a,b,c;
    printf("Enter first number\n");
    scanf("%d",&a);
    printf("Enter second Number\n");
    scanf("%d",&b);
    printf("Enter the third number\n");
    scanf("%d",&c);
    if (a>b && a>c)
    {
        printf("%d is greatest number betweeen three number\n",a);
    }
    else if(b>a && b>c)
    {
        printf("%d is the greatest number between three number\n",b);
    }
    else
    {
        printf("%d is the greater number between three number",c);
    }
}