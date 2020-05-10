#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string ps,s;
  cin>>s;
  ps = s;
  cout<<s<<"\n";
  while(s!="####")
  {
    cin>>s;
    if(ps[ps.length()-1] != s[0])
      break;
    cout<<s<<"\n";
    ps = s;
  }
}