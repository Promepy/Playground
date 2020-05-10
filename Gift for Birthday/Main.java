#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int year;
  cin>>year;
  cout<<year<<" is ";
  if (year % 4 == 0) {
        if (year % 100 == 0) {
            // the year is a leap year if it is divisible by 400.
            if (year % 400 == 0)
                cout<<"";
            else
                cout<<"not ";
        } else
            cout<<"";
    } else
        cout<<"not ";
  cout<<"a leap year";
}