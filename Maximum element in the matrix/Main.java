#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  int max;
  for(int i=0; i<m; i++)
  {
    for(int j=0; j<n; j++)
    {
      cin>>a[i][j];
      if(i==0 && j==0)
        max = a[i][j];
      else
      {
        if(max<a[i][j])
          max = a[i][j];
      }
    }
  }
  cout<<"The maximum element is "<<max;
}