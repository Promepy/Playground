#include <iostream>
#include<string>
using namespace std;
int main() {
  string s;
  cin>>s;
  int x = s.length();
  for(int i=0; i<x; i++)
  {
    int val = (int)s[i];
    if((val>=65 && val<=90) || (val>=97 && val<=122))
    {
      cout<<s[i];
    }
  }
}