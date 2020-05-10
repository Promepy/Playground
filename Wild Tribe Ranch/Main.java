#include<iostream>
using namespace std;
int main()
{
  int max,val;
  cin>>max;
  cin>>val;
  if(max>val)
    cout<<"Yes, you can enter.";
  else if(max==val)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
  	cout<<"Sorry, you can't enter";
}