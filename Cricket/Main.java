#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int tn, tr, cr, cb, to;
  float nuo, crr, rrr;
  cin>>tn;
  cin>>tr;
  cin>>cr;
  cin>>cb;
  to = tn/6;
  cout<<to<<"\n";
  nuo = cb/6+(cb%6)/10.0;
  cout<<nuo<<"\n";
  crr = cr/nuo;
  crr = (crr*10)+0.5;
  crr = ((float )((int)(crr))) / 10;
  cout<<crr<<"\n";
  rrr = tr/50.0;
  rrr = (rrr*10)+0.5;
  rrr = ((float )((int)(rrr))) / 10;
  cout<<rrr<<"\n";
  if(crr>=rrr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}