#include<iostream>
using namespace std;
int func(int);
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  cout<<"The factorial of "<<a<<" is "<<func(a);
}
int func(int a)
{
  if(a==0 || a==1)
    return 1;
  else
    return a*func(a-1);
}