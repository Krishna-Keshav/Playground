#include<stdio.h>
int main()
{
  int n;
  int digit;
  scanf("%d",&n);
  digit=(n/10)%10;
  printf("%d",digit);
  
  return 0;
}