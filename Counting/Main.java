#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  int v=0,co=0,w=0,d=0,sy=0;
  for(int i=0; i<str.length(); i++)
  {
    if (ispunct(str[i]))
      sy++;
    else if(isdigit(str[i]))
      d++;
    else if(isspace(str[i]))
      w++;
    else if(isalpha(str[i]))
    {
      char c= str[i];
       int isLowercaseVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

    // evaluates to 1 (true) if c is an uppercase vowel
    	int isUppercaseVowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
      if(isLowercaseVowel || isUppercaseVowel)
      {
        v++;
      }
      else
      {
        co++;
      }
    }
  }
  cout<<"Vowels:"<<v<<"\n";
  cout<<"Consonants:"<<co<<"\n";
  cout<<"White Spaces:"<<w<<"\n";
  cout<<"Digits:"<<d<<"\n";
  cout<<"Symbols:"<<sy<<"\n";
}