#include<iostream>
using namespace std;
int func(int, int);
int main()
{
  //Type your code here.
  int a, n;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>n;
  cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<func(a,n);
}
int func(int a, int n)
{
  if(n==1)
    return a;
  return a*func(a,n-1);
}