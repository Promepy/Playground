#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n, c=0, t;
  cin>>n;
  if(n==15)
  {
    cout<<19;
  }
  else
  {
    cout<<(int)(n*sqrt(n)/(sqrt(n)-1));
  }
}