#include<stdio.h>
float weightgm (float n)
{
    return n*1000;
}
float weightkg (float n)
{
    return n/1000;
}
float distancefeet (float n)
{
    return n/12;
}
float distanceinch(float n)
{
    return n*12;
}
float weightpkg (float n)
{
    return n/0.454;
}
float weightpound(float n)
{
    return n*0.454;
}
int main()
{
    int a,c;
    float b;
    top:
    printf("Please select an option\n");
    printf("1. Kg to Gm\n2. Gm to Kg\n3. Feet to Inch\n4. Inch to Feet\n5. Kg to pound\n6. Pound to Kg\n7. For Exit\n");
    printf("Enter your Option\n");
    scanf("%d",&a);
    switch (a)
    {
    case 1:
    printf("Enter your value\n");
    scanf("%f",&b);
    printf("The converted value is %f gm\n",weightgm(b));
    break;
    case 2:
    printf("Enter your value\n");
    scanf("%f",&b);
    printf("The converted value is %f kg\n",weightkg(b));
    break;
    case 3:
    printf("Enter your value\n");
    scanf("%f",&b);
    printf("The converted value is %f inch\n",distanceinch(b));
    break;
    case 4:
    printf("Enter your value\n");
    scanf("%f",&b);
    printf("the converted value is %f feet\n",distancefeet(b));
    break;
    case 5:
    printf("Enter your value\n");
    scanf("%f",&b);
    printf("The converted value is %f pound\n",weightpkg(b));
    break;
    case 6:
    printf("Enter your value\n");
    scanf("%f",&b);
    printf("The converted value is %f kg\n",weightpound(b));
    break;
    case 7:
    goto end;
    break;
    default:
    printf("Oops!! Wrong Input\n");
    }
    rg:
    printf(">>Press 1 to Continue\n>>Press 2 to Exit\n");
    scanf("%d",&c);
    if (c==1)
    {
        goto top;
    }
    else if (c==2)
    {
        goto end;
    }
    else
    {
        printf("Oops!!! Wrong Input, try again\n");
        goto rg;

    }
    end:
    printf("Thank You!!! Use Again\n");
    return 0;
}
