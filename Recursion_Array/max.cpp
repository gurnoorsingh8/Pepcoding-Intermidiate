#include<iostream>
#include<vector>
using namespace std;

int maxArray(vector<int>& arr, int idx)
{
    if(idx == arr.size())
    {
        return -1e8;
    }
    int maxOfSmallSeg = maxArray(arr, idx +1);
    return max(arr[idx], maxOfSmallSeg);
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
    cout << maxArray(arr, 0);
}