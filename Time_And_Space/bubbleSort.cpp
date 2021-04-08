#include<iostream>
#include<vector>
using namespace std;

void swap(vector<int>& arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void moveToLast(vector<int>& arr, int si, int ei)
{
    for(int i = si+1; i <= ei; i++)
    {
        if(arr[i-1] > arr[i])
        {
            swap(arr, i - 1, i);
        }
    }
}

void bubbleSort(vector<int>& arr, int n)
{
    int ei = n - 1;
    for(int i = 0; i < n; i++)
    {
        moveToLast(arr, 0, ei - i);
    }
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
    bubbleSort(arr, n);
    for (int val: arr)
    {
        cout << to_string(val) + " ";
    }
    return 0;
}