#include<iostream>
#include<vector>
using namespace std;

void rotate(vector<vector<int>>& arr)
    {
        //Transpose
        int n = arr.size();
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int c1 = 0;
        int c2 = n - 1;
        while(c1 < c2)
        {
            for(int r = 0; r < n; r++)
            {
                int e1 = arr[r][c1];
                int e2 = arr[r][c2];

                arr[r][c1] = e2;
                arr[r][c2] = e1;
            }
            c1++;
            c2--;
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                cout<<arr[i][j]<<" ";
            }
            cout<<endl;
        }
    }

int main()
{
    int n;
    cin >> n;
    vector<vector<int>> arr(n, vector<int> (n));
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            cin>>arr[i][j];
        }
    }
    rotate(arr);
}