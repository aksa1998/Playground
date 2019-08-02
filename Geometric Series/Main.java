#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n,t1,t2,a,r,s1,s2;
  scanf("%d",&n);
  if(n%2==1)
  {a=1;
   r=2;
   t1=(n+1)/2;
   s1=a*pow(r,t1-1);
  printf("%d",s1);}
  else
  {a=1;
   r=3;
   t2=n/2;
   s2=a*pow(r,t2-1);
   printf("%d",s2);
  }
  return 0;
}