#include<iostream>
using namespace std;
int gcd(int, int , int);
int min(int, int, int);
int main()
{
  int a,b,c, ans;
  cin>>a>>b>>c;
  cin>> ans;
  if(ans== gcd(a,b,c))
  {
    cout<<"Answer is correct.";
  }
  else
    cout<<"Answer is wrong.";
}

int min(int a, int b, int c)
{
  int m = a;
  if(b<m)
  {
    if(c<b)
    {
      m = c;
    }
    else
    {
      m = b;
    }
  }
}

int gcd(int a, int b, int c)
{
  int m = min(a,b,c);
  while(m>0)
  {
    if(a%m==0 && b%m==0 && c%m==0)
    {
     return m; 
    }
    m--;
  }
  return m;
}