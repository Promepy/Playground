#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s, test("the");
  getline(cin,s);
  int found=-1;
  do
  {

    found = s.find(test,found+1);
    if(found!=-1)
    {
      s = s.substr(0,found)+s.substr(found+4);
    }

  }while(found!=-1);
  cout<<s;
}