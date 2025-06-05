#include<stdio.h>
int main()
{
    int cost;
    int selling;
    printf("Enter a cost Price\n");
    scanf("%d",& cost);
    printf("Enter selling price\n");
    scanf("%d", & selling);
    if (cost < selling)
    {
       printf("selling in profit price\n");
       printf("Total profit is %d", selling-cost);
    }
    else
    {
        printf("Selling in not profit price\n");
        printf("The loss amount is %d\n",cost-selling);
    } 
    return 0;
}