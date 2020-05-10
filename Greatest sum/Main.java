#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n][m];
  int row[n];
  int col[m];
  for(int i=0; i<n; i++)
  {
    row[i] = 0;
    for(int j=0; j<m; j++)
    {
      cin>>a[i][j];
      row[i] += a[i][j];
      if(i==0)
      {
        col[j] = a[i][j];
      }
      else
      {
        col[j]+=a[i][j];
      }
    }
  }
  int maxr = 0, maxc=0;
  cout<<"Sum of rows is ";
  for(int i=0; i<n; i++)
  {
    cout<<row[i]<<" ";
    if(row[maxr]<row[i])
    {
      maxr = i;
    }
  }
  cout<<"\nRow "<<maxr+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(int i=0; i<m; i++)
  {
    cout<<col[i]<<" ";
    if(col[maxc]<col[i])
    {
      maxc = i;
    }
  }
  cout<<"\nColumn "<<maxc+1<<" has maximum sum";
}