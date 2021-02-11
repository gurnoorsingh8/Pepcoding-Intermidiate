#include<iostream>
#include<vector>
using namespace std;

void input(vector<vector<int>>& arr)
{
    for(int i = 0; i < arr.size(); i++)
    {
        for(int j = 0; j < arr[0].size(); j++)
        {
            cin >> arr[i][j];
        }
    }
}

void spiral(vector<vector<int>>& arr)
{
    int n = arr.size();
    int m = arr[0].size();
    int count = n * m;
    int rmin = 0;
    int rmax = n-1;
    int cmin = 0;
    int cmax = m - 1;
    while(count != 0)
    {
        for(int i = rmin; i <= rmax && count > 0; i++)
        {
            cout << arr[i][cmin] << endl;
            count--;
        }
        cmin++;
        for(int i = cmin; i <= cmax && count > 0; i++)
        {
            cout << arr[rmax][i] << endl;
            count--;
        }
        rmax--;
        for(int i = rmax; i >= rmin && count > 0; i--)
        {
            cout << arr[i][cmax] << endl;
            count--;
        }
        cmax--;
        for(int i = cmax; i >= cmin && count > 0; i--)
        {
            cout << arr[rmin][i] << endl;
            count--;
        }
        rmin++;
    }
}

int main()
{
    int n;
    int m;
    cin >> n;
    cin >> m;
    vector<vector<int>> arr(n, vector<int>(m,0));
    input(arr);
    spiral(arr);
}