#include<stdio.h>
int main()
{
    int l,b,a,p;
    printf("Enter the length of a rectangle\n");
    scanf("%d",&l);
    printf("Enter the breadth of a rectangle\n");
    scanf("%d",&b);
    printf("\n");
    printf("The area of the rectangle is %d\n",l*b);
    printf("the perimeter of the rectangle is %d\n",2*(l+b));
    if (a<p)
    {
        printf("the perimeter is greater than area");
    }
    else if(p<a)
    {
        printf("The area is greater than perimeter");
    }
    else
    {
        printf("the area is equal to perimeter");
    }
    return 0;
}