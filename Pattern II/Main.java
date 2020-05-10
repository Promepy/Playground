#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int j=0;
  cout<<1<<"\n";
  for(int i=2; i<=n; i++)
  {
    if(i%2==0)
    {
    	for(j=i*(i+1)/2; j>(i-1)*(i)/2+1; j--)
    	{
      		cout<<j<<"*";
    	}
      
    }
    else if(i%2==1)
    {
      	for(j=(i)*(i-1)/2+1; j<(i+1)*(i)/2; j++)
        {
        	cout<<j<<"*";
        }
    }
    cout<<j<<"\n";
  }
}