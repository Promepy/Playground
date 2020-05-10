#include<iostream>
using namespace std;
int func(int);
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  cout<<"The term "<<a<<" in the fibonacci series is "<<func(a);
}
int func(int a)
{
  if(a==1)
    return 0;
  else if(a==2)
    return 1;
  else
    return func(a-1)+func(a-2);
}