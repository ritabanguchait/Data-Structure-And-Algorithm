#include<stdio.h>
int main()
{
    int a;
    for (int i=0; i<10;i++)
    {
        printf("Enter Your age\n");
        scanf("%d",&i);
        if(i==100)
        {
            goto end;
        }
        else{
            continue;
        }
    }
    end: 
    printf("The man was dead\n");
}