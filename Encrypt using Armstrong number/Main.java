#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  	int size = 0, temp=n, sum =0;
  	while(temp)
    {
      	size+=1;
      	temp = temp/10;
    }
  	temp = n;
    while(temp)
    {
      sum += power(temp%10, size);
      temp = temp/10;
    }
  	if(sum==n)
    {
      return 1;
    }
  	return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}