#include<iostream>
#include<vector>
using namespace std;

void saddle(vector<vector<int>> arr)
{
    int n = arr.size();
    int m = arr[0].size();
    for(int r = 0; r < n; r++)
    {
        int minn = 1e8;
        int c = 0;

        for(int j = 0; j < m; j++)
        {
            if(arr[r][j] < minn)
            {
                minn = arr[r][j];
                c = j;
            }
        }

        bool saddle = true;
        for(int i = 0; i < m; i++)
        {
            if(arr[i][c] > minn)
            {
                saddle = false;
                break;
            }
        }
        if(saddle)
        {
            cout<<minn;
            return;
        }
    }
    cout<<"Invalid input";
}

int main()
{
    int n;
    cin>>n;
    vector<vector<int>> arr(n, vector<int>(n));
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            cin>>arr[i][j];
        }
    }
    saddle(arr);
}