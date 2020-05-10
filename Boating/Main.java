#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int max, adu, chi;
  cin>>max;
  cin>>adu;
  cin>>chi;
  if(max>= adu*75+chi*30)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}