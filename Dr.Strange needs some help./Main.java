#include<iostream>
using namespace std;
int bact_mult(int , int);
int main()
{
  int m,n,val;
  cin >> m;
  cin >> n;
  cin >> val;
  if(val <= bact_mult(m,n))
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}

int bact_mult(int a, int b)
{
  int prod = 1;
  for(int i=0; i< b; i++)
  {
    prod *= a;
  }
  return prod;
}