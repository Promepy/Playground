#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int max, n;
  cin>>n;
  int a[n];
  max = -1;
  for(int i=0; i<n; i++)
  {
    cin>>a[i];
    if(i==0)
      max = a[i];
    else
    {
      if(a[i] > max)
        max = a[i];
    }
  }
  cout<<max;
}