#include<stdio.h>
int main()
{
  //your code here
  float p,n,r;
  double s;
  scanf("%f %f %f",&p,&n,&r);
  s=(p*n*r)/100;
  printf("%.6lf ",s);
  return 0;
}