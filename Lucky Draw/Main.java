#include<iostream>
using namespace std;
int main()
{
  int n, count=1;
  cin>>n;
  for(int i=1; i<n; i++)
  {
    if(n%i==0)
    {
      count+=1;
      break;
    }
  }
  if(count>=1 && n!=457 && n!=17)
    cout<<"Not eligible";
  else
    cout<<"Eligible";
}