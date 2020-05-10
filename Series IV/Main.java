#include<iostream>
using namespace std;
int main()
{
  int n, i=-1, inc=1, t;
  cin>>n;
  i+=inc;
  t=n%2;
  while(n--)
  {
    cout<<2*i<<" ";
    if(n%2==t)
      inc+=2;
    i+=inc;
  }
}