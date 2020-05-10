#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mi;
  int lit, dist;
  cin>>mi;
  cin>>lit;
  cin>>dist;
  if(dist<= lit*mi)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}