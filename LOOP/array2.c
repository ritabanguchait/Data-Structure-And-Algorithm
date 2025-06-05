#include<stdio.h>
int main()
{
    int num[100];
    int k=0,a;
    printf("Enter the number of element you want to enter\n");
    scanf("%d",&a);
    printf("Enter the the %d number to get reverse order\n",a);
    for(int i=0;i<a;i++)
    {
        printf("Enter the %d element:",i);
        scanf("%d",&num[i]);
        k=k+1;
    }
    printf("The reverse order of the element show below\n");
    for(int j=a-1;j>=0;j--)
    {
       printf("%d",num[j]);
       
    }
 return 0;
}