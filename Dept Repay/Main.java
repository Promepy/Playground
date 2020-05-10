#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int pri,rofi, noy;
  float intr, amo, disc, fin;
  cin>>pri;
  cin>>rofi;
  cin>>noy;
  intr = pri*rofi*noy/100;
  cout<<intr<<"\n";
  amo = pri+intr;
  cout<<amo<<"\n";
  disc = 2*intr/100.00f;
  cout<<disc<<"\n";
  fin = amo - disc;
  cout<<fin<<"\n";
}