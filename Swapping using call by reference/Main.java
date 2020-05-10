#include<iostream>
using namespace std;
void swap(int &, int &);
int main()
{
  int a, b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}
void swap(int &p, int &g)
{
  int love = p;
  p = g;
  g = love;
}