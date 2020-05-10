#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int i, c=0;
  cin>>i;
  do
  {
    i = i/10;
    c++;
  }while(i>0);
  cout<<c;
}