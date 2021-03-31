#include<iostream>
using namespace std;

bool isPalindrome(string str)
{
    int i = 0, j = str.length() - 1;
    while(i < j)
    {
        if(str[i++] != str[j--])
        {
            return false;
        }
    }
    return true;
}

int main()
{
    string str;
    cin >> str;
    cout << isPalindrome(str);
}