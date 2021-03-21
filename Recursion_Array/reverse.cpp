#include<iostream>
#include<vector>
using namespace std;

void input(vector<int>& arr)
{
    for(int i = 0; i < arr.size(); i++)
    {
        cin >> arr[i];
    }
}

void revrse(vector<int>& arr, int idx)
{
    if(idx == -1)
    {
        return;
    }
    cout << arr[idx] << endl;
    revrse(arr, idx - 1);
}

int main()
{
    int n;
    cin >> n;
    vector<int> arr(n);
    input(arr);
    revrse(arr, n - 1);
    return 0;
}