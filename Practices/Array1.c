#include<stdio.h>
int main()
{
    int num[10];
    printf("Enter the student 10 NUmber to store\n");
    for (int i=0;i<10;i++)
    {
        scanf("%d",&num[i]);
        
    }
    printf("The stored 10 number is show below\n");
    for(int j=0;j<10;j++)
    {
        printf("%d\n",num[j]);
    }
    return 0;
}