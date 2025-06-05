#include<stdio.h>
int main()
{
    int a;
    printf("enter a year to check Leapyear or not\n");
    scanf("%d",&a);
    if(a%4==0)
    {
        printf("it's a leapyear\n");
    }
    else
    {
      printf("it's not a leapyear");
    }
   return 0; 
}