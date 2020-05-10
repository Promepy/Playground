#include<iostream>
using namespace std;
int func(int);
int sum(int);
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  cout<<func(a);
}
int func(int a)
{
  if(a%10==a)
    return a;
  else
    return func(sum(a));
}
int sum(int a)
{
  int s = 0;
  while(a)
  {
    s+=a%10;
    a=a/10;
  }
  return s;
}