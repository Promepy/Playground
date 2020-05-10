#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, f=0, s=1, next;
  cin>>n;
  while(n>2)
  {
    next = f+s;
    f = s;
    s = next;
    n--;
  }
  cout<<next;
}