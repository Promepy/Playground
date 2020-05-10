#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n, me;
  cin>>n;
  int a[n];
  for(int i=0; i<n; i++)
  {
    cin>>a[i];
  }
  cin>>me;
  bool found= false;
  for(int i=0; i<n; i++)
  {
    if(a[i]==me)
    {
      found = true;
      break;
    }
  }
  if(found)
  {
    cout<<"She passed her exam";
  }
  else
  {
    cout<<"She failed";
  }
}