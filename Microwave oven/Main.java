#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  float time;
  cin>>num;
  cin>>time;
  if(num==1)
    cout<<time;
  else if(num==2)
    cout<<time+time*0.5;
  else if(num==3)
    cout<<time*2.0;
  else if (num>3)
    cout<<"Number of items is more";
}