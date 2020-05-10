#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row, colm, tree;
  cin>>row;
  cin>>colm;
  cin>>tree;
  int n = colm;
  if(tree<=n || tree%n==1 || tree%n==0)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}