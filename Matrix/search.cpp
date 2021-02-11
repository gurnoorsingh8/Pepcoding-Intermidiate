#include<iostream>
#include<vector>
using  namespace std;

void search(vector<vector<int>>& arr, int data)
{
    int i = arr.size() -1;
    int j = 0;
    while(i >= 0 && j < arr[0].size())
    {
        if(arr[i][j] == data)
        {
            cout<<i<<"\n"<<j;
            return;
        }
        else if(arr[i][j] < data)
        {
            i--;
        }
        else
        {
            j++;
        }
    }
}

int main()
{
    int n;
    cin >> n;
    vector<vector<int>> arr(n, vector<int>(n));
    for(int i = 0; i < n; i++)
        {
        for(int j = 0; j < n; j++)
        {
            cin >> arr[i][j];
        }
    }
    int data;
    cin>>data;
    search(arr, data);
    return  0;
}