#include<stdio.h>
int factorial(int n)
{
    if(n==0 || n==1)
    {
        return 1;
    }
    else
    {
        return (n*factorial(n-1));
    }
}
int main()
{
  int a;
  printf("Enter a  Number to calculate factorial Value\n");
  scanf("%d",&a);
  printf("The calculated factorial value is %d",factorial(a));
  return 0;
}