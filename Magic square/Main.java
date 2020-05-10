#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n][n];
  int sums[n+n+2];
  for(int i=0; i<n; i++)
  {
    sums[i] = 0;
    for(int j=0; j<n; j++)
    {
      cin>>a[i][j];
      sums[i] += a[i][j];
      if(i==0 && j==0)
        sums[n+n] = 0;
      else if(i==0 && j==n-1)
        sums[n+n+1] = 0;
      if(i==0)
      {
        sums[n+j] = a[i][j];
      }
      else
      {
        sums[n+j] += a[i][j];
      }
      if(i==j)
        sums[n+n] += a[i][j];
      if(i+j==n-1)
        sums[n+n+1] += a[i][j];
    }
  }
  bool isMagic = true;
  int val = sums[0];
  for(int i=0; i< n+n+2; i++)
  {
    if(sums[i]!=val)
    {
      isMagic = false;
      break;
    }
  }
  if(isMagic)
    cout<<"Yes";
  else
    cout<<"No";
}