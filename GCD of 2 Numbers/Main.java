#include<iostream>
using namespace std;
int func(int,int);
int main()
{
  //Type your code here.
  int a, b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<func(a,b);
}
int func(int a, int b)
{
  int s =a;
  if(b<a)
    s=b;
  while(s>0)
  {
    if (a%s==0 && b%s==0)
    {
      return s;
    }
    s--;
  }
  return s;
}