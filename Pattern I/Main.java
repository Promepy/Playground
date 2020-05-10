#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=1; i<=4; i++)
  {
    for(int j=1; j<=i; j++)
      cout<<n;
    cout<<"\n";
    n+=1;
  }
  for(int i=4; i>=1; i--)
  {
    n-=1;
    for(int j=1; j<=i; j++)
      cout<<n;
    cout<<"\n";
  }
}