#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, sc, i=0;
  cin>>n;
  do
  {
  	cin>>sc;
  	n -= sc;
  	i+=1;
  }
  while(n>0);
  cout<<"The number of turns is "<<i;
}