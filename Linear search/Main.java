#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,searc,is=0;
  scanf("%d",&n);
        int arr[n];
        for(i=0;i<n;i++)
        {scanf("%d",&arr[i]);
        }
   scanf("%d",&searc);
        for(i=0;i<n;i++)
        {if(arr[i]==searc)
        {printf("%d",i+1);
        return 0;}
        }
        printf("%d isn't present in the array.",searc);
  return 0;
}
  