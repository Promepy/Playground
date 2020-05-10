#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, num, eve=0,odd=0;
  cin>>n;
  for(int i=0; i<n; i++)
  {
    cin>>num;
    if(num%2==0)
      eve+=num;
    else
      odd+=num;
  }
  cout<<"The sum of the even numbers in the array is "<<eve<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<odd;
}