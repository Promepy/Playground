#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, temp, a=0;
  cin>>n;
  temp = n;
  while(n!=0)
  {
    a += n%10;
    n = n/10;
  }
  if(temp%a==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}