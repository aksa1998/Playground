#include <stdio.h>
int main() {
	//Type your code
  int input,i,fact=1;
  scanf("%d",&input);
  for(i=1;i<=input;i++)
    fact=fact*i;
  printf("%d",fact);
	return 0;
}