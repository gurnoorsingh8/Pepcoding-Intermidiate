#include<iostream>
using namespace std;

void substring(string str)
{
    for(int i = 0; i < str.length(); i++)
    {
        for(int len = 1; i + len <= str.length(); len++)
        {
            cout << str.substr(i, len) << endl;
        }
    }
}

int main()
{
    string str;
    cin >> str;
    substring(str);
    return 0;
}