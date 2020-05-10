#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, loc, val;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  int a[n+1];
  cout<<"Enter the elements in the array"<<"\n";
  for(int i=0; i<n; i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>loc;
  if(loc<1 || loc>=n)
  {
    cout<<"Invalid Input"<<"\n";
  }
  else
  {
    cout<<"Enter the value to insert"<<"\n";
    cin>>val;
    int k=n;
    while(k>=loc)
    {
      a[k] = a[k-1];
      k--;
    }
    a[k] = val;
    cout<<"Array after insertion is"<<"\n";
    for(int i=0; i<n+1; i++)
    {
      cout<<a[i]<<"\n";
    }
  }
}