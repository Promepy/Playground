#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1, d2, d3, d4, d5, d6, d7, total=0;
  float sun= 1.50f, sat=1.25f;
  cin>>d1;
  total += d1*100*sun;
  if(d1>8)
    total += (d1-8)*15;
  cin>>d2;
  total += d2*100;
  if(d2>8)
    total += (d2-8)*15;
  cin>>d3;
  total += d3*100;
  if(d3>8)
    total += (d3-8)*15;
  cin>>d4;
  total += d4*100;
  if(d4>8)
    total += (d4-8)*15;
  cin>>d5;
  total += d5*100;
  if(d5>8)
    total += (d5-8)*15;
  cin>>d6;
  total += d6*100;
  if(d6>8)
    total += (d6-8)*15;
  cin>>d7;
  total += d7*100*sat;
  if(d7>8)
    total += (d7-8)*15;
  if(d1+d2+d3+d4+d5+d6+d7 > 40)
  {
    //total += (d1+d2+d3+d4+d5+d6+d7 - 40)*25;
  }
  cout<<total;
}