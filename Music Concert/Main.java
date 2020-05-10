#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n;
  int *p;
  cin>>n;
  p = (int *) malloc(n*sizeof(int));
  int eve=0,odd=0;
  for(int i=0; i<n; i++)
  {
    cin>>*(p+i);
    if (*(p+i)%2==0)
    {
      eve+=1;
    }
    else
    {
      odd+=1;
    }
  }
  cout<<odd<<"\n";
  cout<<eve;
  return 0;
}