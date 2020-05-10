#include<iostream>
using namespace std;
int main()
{
  int start, end;
  cin>>start;
  cin>>end;
  for(int i=start+1; i<=end; i++)
  {
    int sum = 1;
    for(int j =2 ; j<i; j++)
    {
      if(i%j==0)
        sum+=j;
    }
    if(sum==i)
      cout<<i<<" ";
  }
}