#include<iostream>
using namespace std;

void diffOfTwo(string str)
{
    string ans;
    ans += str[0];
    for(int i = 1; i < str.length(); i++)
    {
        int diff = str[i] - str[i-1];
        char ch = str[i];
        ans += to_string(diff);
        ans += ch;
    }
    cout << ans;
}

int main()
{
    string str;
    cin >> str;
    diffOfTwo(str);
}