#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sum=0, m,n;
  cin>>n>>m;
  int a[n][m];
  for(int i=0; i<n; i++)
  {
    for(int j=0; j<m; j++)
    {
      cin>>a[i][j];
      if(i==0 || i==n-1 || i+j==n-1)
        sum+=a[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}