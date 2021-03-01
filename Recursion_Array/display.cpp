#include<iostream>
#include<vector>
using namespace std;

void display(vector<int>& arr, int idx)
{
    if(idx == arr.size())
    {
        return;
    }
    
    cout << arr[idx] << endl;
    display(arr, idx + 1);
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
    display(arr, 0);
}