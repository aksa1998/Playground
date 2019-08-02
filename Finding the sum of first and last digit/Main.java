#include <stdio.h>
int main() {
	//Type your code
  int a,r,sum=0;
  scanf("%d",&a);
  r=a%10;
  while(a>10)
  { a=a/10;}
  sum=r+a;
  printf("%d",sum);
	return 0;
}