#include<stdio.h>
#include<conio.h>
#include<iostream.h>

using namespace std;

int main()
{
    long long jumlah,harga[10000],uang,a,b,x,y;
    while(scanf("%lld",&jumlah)!=EOF)
    {
        for(a=0;a<jumlah;a++)
        {
            scanf("%lld",&harga[a]);
        }
        scanf("%lld",&uang);
        sort(harga,harga+jumlah);
        
        //brute force
        for(a=0;a<jumlah-1;a++)
        {
            for(b=a+1;b<=jumlah-1;b++)
            {
                if((harga[a]+harga[b])==uang)
                {
                    if((harga[a]>harga[b])&&(harga[a]-harga[b]<uang))
                    {
                        x=a;
                        y=b;
                    }
                    if((harga[b]-harga[a])<uang)
                    {
                        x=a;
                        y=b;
                    }
                }
            }
        }
        printf("Peter should buy books whose prices are %lld and %lld.\n",harga[x],harga[y]);
		printf("\n");
    }
    getch();
    return 0;
}
                
