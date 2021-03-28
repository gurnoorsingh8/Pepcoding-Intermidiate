#include<iostream>
using namespace std;

bool isPalindrome(string s)
{
    int i = 0, j = s.length() - 1;
    while(i < j)
    {
        if(s[i++]) != s.[j--]))
        {
            return false;
        }
    }
    return true;
}

void substring(string str)
{
    for(int i = 0; i < str.length(); i++)
    {
        for(int len = 1; i + len <= str.length(); len++)
        {
            string s = str.substr(i, i + len);
            if(isPalindrome(s))
            {
                System.out.println(s);
            }
        }
    }
}

int main()
{
    string str = scn.nextLine();
    substring(str);
}