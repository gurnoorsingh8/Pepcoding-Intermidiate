#include<iostream>
using namespace std;

void toggleCase(string str)
{
    string ans = "";
    for(int i = 0; i < str.length(); i++)
    {
        char ch = str[i];
        if(ch >= 'a' && ch <= 'z')
        {
            ans += (ch - 'a' + 'A');
        }
        else
        {
            ans += (ch - 'A' + 'a');
        }
    }
    cout << ans;
}

int main()
{
    string str;
    cin >> str;
    toggleCase(str);
}