#include<iostream>
using namespace std;
void stockSpan(int n,int* p)
{
  int c=0,c1=1;
  cout<<c1<<"\n";
  for(int i=1; i<n; i++)
  {
    if(p[i-1]<=p[i])
    {
      c+=2;
      cout<<c<<"\n";
    }
    else
    {
      cout<<c1<<"\n";
    }
    /*
    int span = 1;
    int val = *(p+i);
    for(int j=0; j<=i; j++)
    {
      if(*(p+j)<val)
      {
        span += 1;
      }
    }
    cout<<span<<"\n";*/
  }
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n];
  for(int i=0; i<n; i++)
  {
    cin>>a[i];
  }
  stockSpan(n, a);
}