#include<stdio.h>
int main()
{
  //Type your code here
  int n,t1=1,t2=0,i,next;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  { printf("%d ",t2);
   next=t1+t2;
   t2=t1;
     t1=next;
  
  
  }  
  return 0;
}