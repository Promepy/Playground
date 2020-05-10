#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, count=0;
  float score=0.0f;
  cin>>n;
  while((n>0) && count<3)
  {
    if(n%2==1)
    {
      score += 1.0f;
      count++;
    }
    else
    {
      score -= 0.5f;
    }
    cin>>n;
  }
  if(n<0)
    score -= 1.0f;
  cout<<score;
}