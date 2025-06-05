#include<stdio.h>
int main()
{
    int num[100];
    int a,b,c=0;
    printf("Enter the number of element\n");
    scanf("%d",&a);
    for(int i=0;i<a;i++)
    {   printf("Enter the %d element:",i);
        scanf("%d",&num[i]);
        c=c+num[i];
    }
    printf("The sum of %d element is %d",a,c);
    return 0;

}