#include <iostream>
using namespace std;
int main() {
    // Type your code here
  	int p,n,t, k=1;
  	cin>>n;
  	t=n%2;
  	p=n;
  	while(p--)
    {
      if(p%2==t)
      {
        cout<<k+1;
        for(int i=n;i>1; i--)
          cout<<k;
        cout<<"\n";
        k++;
      }
      else
      {
        for(int i=n;i>1; i--)
          cout<<k;
        k++;
        cout<<k<<"\n";
      }
    }
    return 0;
}