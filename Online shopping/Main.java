#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fam,fdi,fsh,sam,sdi,ssh,aam,adi,ash, ft,st,at;
  cin>>fam;
  cin>>fdi;
  cin>>fsh;
  ft = fam-((int)(fam*fdi/100.0))+fsh;
  cout<<"In Flipkart Rs."<<ft;
  cin>>sam;
  cin>>sdi;
  cin>>ssh;
  st = sam-((int)(sam*sdi/100.0))+ssh;
  cout<<"\nIn Snapdeal Rs."<<st;
  cin>>aam;
  cin>>adi;
  cin>>ash;
  at = aam-((int)(aam*adi/100.0))+ash;
  cout<<"\nIn Amazon Rs."<<at;
  cout<<"\nHe will prefer ";
  if (ft<=st && ft<=at)
    cout<<"Flipkart";
  else if(st<=ft && st<=at)
    cout<<"Snapdeal";
  else
    cout<<"Amazon";
}