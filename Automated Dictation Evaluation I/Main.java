#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string f,s;
  getline(cin,f);
  getline(cin,s);
  int x = f.compare(s);
  if(x==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
}