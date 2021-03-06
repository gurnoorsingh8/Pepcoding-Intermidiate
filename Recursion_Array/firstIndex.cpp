#include<iostream>
#include<vector>
using namespace std;

int first(vector<int>& arr, int idx, int data)
{
    if(idx == arr.size())
    {
        return -1;
    }
    if(arr[idx] == data)
    {
        return idx;
    }
    return first(arr, idx + 1, data);
}

void input(vector<int>& arr)
{
    for(int i = 0; i < arr.size(); i++)
    {
        cin >> arr[i];
    }
}

int main()
{
    int n;
    cin >> n;
    vector<int> arr(n);
    input(arr);
    int data;
    cin >> data;
    cout << first(arr, 0, data);
}