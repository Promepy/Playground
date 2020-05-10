#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
//Your code goes here  
std::cin.getline(str,100);
while(str[count])
{
  count++;
}
for(int i=0; i<(count); i++)
{
  rev[i] = str[count-i-1];
}
rev[count] = '\0';
std::cout<<rev;
}