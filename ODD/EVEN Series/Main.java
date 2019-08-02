#include<stdio.h>
int main()
{int a,d,s,n,t;
 scanf("%d",&n);
  if(n%2==1)
  { a=0,d=2;
   t=(n+1)/2;
   s=a+(t-1)*d;
   printf("%d",s);}
	else
    { a=0,d=1;
     t=n/2;
  s=a+(t-1)*d;
  printf("%d",s);}
return 0;
}
	
