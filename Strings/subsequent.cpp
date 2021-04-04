#include<iostream>
#include<vector>
using namespace std;

void subsequent(string str)
{
    vector<string> arr;
    arr.push_back("");
    for(int i = 0; i < str.length(); i++)
    {
        char ch = str[i];
        int size = arr.size();
        for(int j = 0; j < size; j++)
        {
            arr.push_back(arr[j] + ch);
        }
    }
    for(int i = 0 ; i < arr.size(); i++)
    {
        cout << arr[i] <<" ";
    }
}

int main()
{
    string str;
    cin >> str;
    subsequent(str);
    return 0;
}