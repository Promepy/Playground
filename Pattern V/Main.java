#include<iostream>
using namespace std;
int main()
{
  int n,las, k=1 ,p=0 , temp=0;
  cin>>n;
  las = n*(n+1);
  for(int i=0; i<n; i++)
  {
    for(int j=0; j<i; j++)
      cout<<"--";
    for(int j=n-i; j>0; j--)
    {
      cout<<k<<"*";
      k+=1;
    }
    for(int j=n-i; j>0; j--)
    {
      temp = las-j+1-p;
      if(j!=1)
        cout<<temp<<"*";
      else
        cout<<temp<<"\n";
    }
    p += n-i;
  }
}
