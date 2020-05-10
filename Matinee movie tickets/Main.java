#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float show;
  cin>>age;
  cin>>show;
  float adult = 8.00f, chi = 4.00f;
  
  if(show==13.30f)
  {
    adult = 5.00f;
    chi = 2.00f;
  }
  if(age>13)
    cout<<"$"<<adult;
  else
    cout<<"$"<<chi;
  cout<<".00";
}