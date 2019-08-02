#include<stdio.h>

int main()
{
  int i,word=0;
  char str[100];
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  { if(str[i]==' ')
  { word++;}}
  word++;
  printf("%d",word);
  return 0;
}