#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units, ext;
  float per;
  cin>>units;
  cout<<"Rs.";
  if(units<=200)
  {
    per = 0.5;
  	ext = 0;
  }
  else if(units<=400)
  {
    per = 0.65;
  	ext = 100;
  }
  else if(units<=600)
  {
    per = 0.80;
  	ext = 200;
  }
  else if(units>600)
  {
    per = 1.25;
  	ext = 425;
  }
  cout<<int(units*per+ext);
}