#include<stdio.h>
int main()
{
 printf("printing thr primary number of 1 to 100\n");
 for(int i=1;i<=100;i++)
 { if (i%2==0 || i%3==0 || i%4==0 || i%5==0 || i%6==0 || i%7==0 || i%8==0 || i%9==0 ||i%10==0 )
 {
    printf("%d\n",i);
 }
 }
 return 0;
}