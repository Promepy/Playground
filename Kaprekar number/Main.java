#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, k, size=0, a=0,b=1, i = 0,temp;
  cin>>n;
  k = n*n;
  temp = k;
  while(temp>0)
  {
    size++;
    temp = temp/10;
  }
  size /= 2;
  while(i<size)
  {
    b *=10;
    i++;
  }
  i = k%b;
  a =  k/b;
  if(a+i==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}