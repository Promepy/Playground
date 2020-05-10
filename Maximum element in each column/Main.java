#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int marr[n];
  int a[m][n];
  for(int i=0; i<m; i++)
  {
    for(int j=0; j<n; j++)
    {
      cin>>a[i][j];
      if(i==0)
      {
        marr[j] = a[i][j];
      }
      else
      {
        if(marr[j]<a[i][j])
        {
          marr[j] = a[i][j];
        }
      }
    }
  }
  for(int j=0; j<n; j++)
  {
    cout<<marr[j]<<"\n";
  }
}