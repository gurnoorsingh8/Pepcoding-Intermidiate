#include<iostream>
#include<vector>
using namespace std;

int last(vector<int>& arr, int idx, int data)
{
    if(idx == -1)
    {
        return -1;
    }
    if(arr[idx] == data)
    {
        return idx;
    }
    return last(arr, idx - 1, data);
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
    cout << last(arr, n -1, data);
}