#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<algorithm>
int main()
{
  int i,j,k;
  int n,total_pi=0,total_si=0,pi,si;
  double av=0;
  scanf("%d",&n);
  
  while(n--)
  {
   scanf("%d%d",&pi,&si);
   total_pi+=pi;
   total_si+=si;
  }
  av=0;
  av=(double)((total_si*100)/total_pi);
  if(av>=90&&av<=100)
   printf("A\n");
  else if(av>=80&&av<=89)
   printf("B\n");
  else if(av>=70&&av<=79)
   printf("C\n");
  else if(av>=60&&av<=69)
   printf("D\n");
  else
   printf("F\n");


system("pause");

return 0;

}
