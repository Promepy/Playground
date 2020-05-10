#include<iostream>
using namespace std;
int arrayType(int n, int* p)
{
  int eve=0, odd=0;
  for(int i=0; i<n; i++)
  {
    int val = *(p+i);
    if(val%2==0)
      eve++;
    else
      odd++;
  }
  if(eve==n)
    return 1;
  else if(odd==n)
    return 2;
  else
    return 3;
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<"\n";
  for(int i=0; i<n; i++)
  {
    cin>>a[i];
  }
  int result = arrayType(n,a);
  cout<<"The array is ";
  if(result==1)
    cout<<"Even";
  else if(result==2)
    cout<<"Odd";
  else
    cout<<"Mixed";
}