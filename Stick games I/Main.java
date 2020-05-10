#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  int m = a;
  if(b<m)
  {
    m =b;
  }
  if(m%2==0)
  {
    cout<<"Mani Iyer";
  }
  else
  {
    cout<<"Arun Gupta";
  }
}