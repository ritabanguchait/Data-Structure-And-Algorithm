#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter the first side of a traingle\n");
    scanf("%d",&a);
    printf("Enter the second side of a traingle\n");
    scanf("%d",&b);
    printf("Enter the third side of a traingle\n");
    scanf("%d",&c);
    if(a+b>c && b+c>a && c+a>b )
    {
        printf("This is a perfect traingle\n");
    }
    else 
    {
        printf("this is not a perfect traingle\n");
    }
    return 0;
}