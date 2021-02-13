#include<iostream>
#include<vector>
using namespace std;

//Display Elements Of Array
void display(vector<int>& arr, int idx)
{
    if(idx == arr.size())
    {
        return;
    }
    cout << arr[idx] << endl;
    display(arr, idx + 1);
}

//Display Reverse Of Array
void displayReverse(vector<int>& arr, int idx)
{
    if(idx == arr.size())
    {
        return;
    }
    display(arr, idx + 1);
    cout << arr[idx] << endl; 
}

//Find Maximum Element Of Array
int maxOfArray(vector<int>& arr, int idx)
{
    if(idx == arr.size())
    {
        return -1e8;
    }
    return max(arr[idx], maxOfArray(arr, idx + 1));
}

//Find Minimum Element of Array
int minOfArray(vector<int>& arr, int idx)
{
    if(idx == arr.size())
    {
        return 1e8;
    }
    return min(arr[idx], minOfArray(arr, idx + 1));
}

int main()
{
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    // display(arr, 0);
    // displayReverse(arr, 0);
    // cout << maxOfArray(arr, 0);
    // cout << minOfArray(arr, 0);
    return 0;
}