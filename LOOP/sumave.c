#include<stdio.h>
int main()
{   int a;
    float sum=0;
    printf("Enter 10 number to calculate sum and average\n");
    for(int i=1;i<=10;i++)
    {
        scanf("%d",&a);
        sum=sum+a;
    }
    printf("the sum of 10 number is %f\n",sum);
    printf("the average of 10 number is %f\n",sum/10);
    return 0;
}