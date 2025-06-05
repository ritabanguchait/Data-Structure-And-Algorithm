#include<stdio.h>
int main()
{
    int a;
    for(int i=0;i<10;i++)
    {   printf("Enter ur age\n");
        scanf("%d",&i);
        if(i>10)
        {
            break;
        }
    }
    return 0;
}