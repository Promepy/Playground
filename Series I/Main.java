#include<iostream>
using namespace std;
int main()
{
  int n, prev=0;
  cin>>n;
  cout<<prev+0.5<<" ";
  for(int i = 1; i<n; i++)
  {
    int a = 1;
    for(int j = 1; j<i; j++)
      a*=3;
    prev += a;
    cout<<prev+0.5<<" ";
  }
}