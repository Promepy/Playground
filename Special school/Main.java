#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s,rs;
  cin>>s;
  cin>>rs;
  string t(s.rbegin(), s.rend());
  int x = t.compare(rs);
  if(x==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}