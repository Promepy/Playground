#include <cstring>
#include <iostream>
#include<string>
using namespace std;
int main()
{
   //Your code goes here
  char a[100];
  int words = 1;
  cin.getline(a,100);
  int i=0;
  while(a[i])
  {
    if(isspace(a[i]))
      words++;
    i++;
  }
  if(words<=10)
   cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}