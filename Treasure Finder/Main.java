#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f,s,t,l,ll,m;
  cin>>f;
  cin>>s;
  cin>>t;
  if(f<=s)
  {
    if(s>t)
    {
      m = f;
      ll = t;
      l = s;
      if(t<f)
      {
        ll =f;
        m = t;
      }
    }
    else if(s<=t)
    {
      m = f;
      ll = s;
      l = t;
    }
  }
  else if(f>s)
  {
    if(s>t)
    {
      l = f;
      ll = s;
      m = t;
    }
    else if(s<=t)
    {
      m = s;
      l = t;
      ll = f;
      if(f>t)
      {
        ll = t;
        l = f;
      }
    }
  }
  cout << "The treasure is in box which has number "<<ll<<"\n";
  cout<<"The code to open the box is ";
  if(f%m==0 && s%m==0 && t%m==0)
  {
    cout<<m;
  }
  else
  {
    cout<<1;
  }
}