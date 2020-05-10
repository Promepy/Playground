#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  	int num, a = 0;
  	cin>>num;
  	while(num>0)
    {
      a = a*10 + num%10;
      num = num/10;
    }
  	cout<<a;
	return 0;
}