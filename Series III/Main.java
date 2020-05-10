#include<iostream>
using namespace std;
int main()
{
  int n, i=6, inc=5;
  cin>>n;
  while(n--)
  {
    cout<<i<<" ";
    i+=inc;
    inc+=5;
  }
}