#include<iostream>
#include<vector>
using namespace std;

void diagonalTraversal()
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

    for(int gap = 0; gap < arr[0].size(); gap++)
    {
        for(int i = 0, j = gap; i < arr.size() && j < arr[0].size(); i++, j++)
        {
            cout<<arr[i][j]<<" ";
        }
    }

}

int main()
{
    diagonalTraversal();
    return 0;
}