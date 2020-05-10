#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n, prod = 1;
  cin>>n;
  for(int i=1; i<=n; i++)
  {
    prod *= i;
  }
  cout<<prod;
}