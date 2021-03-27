#include<iostream>
#include<vector>
using namespace std;

void index(string str, char data)
{
    vector<int> arr;
    for(int i = 0; i < str.length(); i++)
    {
        if(str[i] == data)
        {
            arr.push_back(i);
        }
    }
    for(int i = 0; i < arr.size(); i++)
    {
        cout << arr[i];
    }
}

int main()
{
    string str;
    cin >> str;
    int data;
    cin >> data;
    index(str, data);
    return 0;
}