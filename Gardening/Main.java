#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,val;
  cin>>r;
  cin>>c;
  cin>>val;
  if(val>r && val<=2*r)
  {
    cout<<"It is a mango tree";
  }
  else if(val>(c-2)*r && val<=(c-1)*r)
    cout<<"It is a mango tree";
  else
  	cout<<"It is not a mango tree";
}