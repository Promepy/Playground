#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1, c1, d2, c2;
  cin>>d1;
  cin>>c1;
  cin>>d2;
  cin>>c2;
  if(c1+c2>99)
  {
    cout<< d1+d2+1<<"\n";
    cout<< c1+c2-100;
  }
  else
  {
    cout<<d1+d2<<"\n";
    cout<<c1+c2;
  }
}