#include<iostream>
using namespace std;
int printresult(int *p, int n, int s)
{
  int sum=0;
  for(int i=0; i<n; i++)
  {
    sum+= *(p+i);
  }
  if(sum<=s)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
}
int main()
{
  //Type your code here.
  int n,s;
  cin>>n;
  cin>>s;
  int a[n];
  for(int i=0; i<n; i++)
  {
    cin>>a[i];
  }
  printresult(a, n, s);
}