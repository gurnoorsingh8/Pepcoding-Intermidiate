#include<iostream>
#include<vector>
using namespace std;

int minArray(vector<int>& arr, int idx)
{
    if(idx == arr.size())
    {
        return 1e8;
    }
    int minOfSmallSeg = minArray(arr, idx +1);
    return min(arr[idx], minOfSmallSeg);
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
    cout << minArray(arr, 0);
}