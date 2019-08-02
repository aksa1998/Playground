#include <stdio.h>
int main() {
	//Type your cod
  int a,sd;
  scanf("%d",&a);
  { while(a>=100)
    a/=10;}
  sd=a%10;
   printf("%d",sd);
	return 0;
}