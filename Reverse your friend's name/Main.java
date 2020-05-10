#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string name;
  getline(cin, name);
  for( string::reverse_iterator i= name.rbegin(); i<name.rend(); i++)
  {
    cout<<*i;
  }
  return 0;
}