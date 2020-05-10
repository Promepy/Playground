#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  int row[m];
  for(int i=0; i<m; i++)
  {
    for(int j=0; j<n; j++)
    {
      cin>>a[i][j];
      if(j==0)
      {
        row[i] = a[i][j];
      }
      else
      {
        if(row[i]<a[i][j])
          row[i] = a[i][j];
      }
    }
  }
  for(int i=0; i<m; i++)
  {
    cout<<row[i]<<"\n";
  }
}