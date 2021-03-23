#include<iostream>
using namespace std;

void compression(string str)
{
    char prevch = str[0];
    string sb = "";
    int i = 1;
    while(i <= str.length())
    {
        int count = 1;
        while(i < str.length() && prevch == str[i])
        {
            count++;
            prevch = str[i];
            i++;
        }
        sb += prevch;
        sb += to_string(count);
        if(i == str.length())
        {
            break;
        }
        prevch = str[i];
        i++;
    }
    cout << sb;
}

int main()
{
    string str;
    cin >> str;
    compression(str);
}