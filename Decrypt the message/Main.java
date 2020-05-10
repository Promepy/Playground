#include<iostream>
using namespace std;
int main()
{
  int n1, n2, sum=0;
  cin>>n1;
  cin>>n2;
  int i = 1;
  while(i<n1+n2)
  {
    if((n1+n2)%i==0)
    {
      sum+=i;
    }
    i+=1;
  }
  if(sum==n1+n2)
  {
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }
}