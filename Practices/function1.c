#include<stdio.h>
int multipliction(int a, int b)
{
    return a*b;
}
int main()
{
    int a,b;
    printf("Enter a number to multipliction\n");
    scanf("%d",&a);
    printf("Enter second number to multipliction\n");
    scanf("%d",&b);
    printf("The multipliction of two number is %d",multipliction(a,b));
    return 0;

}