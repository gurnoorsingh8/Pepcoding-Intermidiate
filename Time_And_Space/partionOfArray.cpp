#include<iostream>
#include<vector>
using namespace std;

void partition(vector<int>& arr, int pivot)
{
    int i = 0;
    int j = 0;
        
    while(i < arr.size())
    {
        if(arr[i] > pivot)
        {
            i++;
        }
        else
        {
            swap(arr, i, j);
            i++;
            j++;
        }
    }
}

void swap(vector<int>& arr, int i, int j)
{
    cout << "Swapping " + to_string(arr[i]) + " and " + to_string(arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void print(vector<int>& arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

void main()
{
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int pivot;
    cin >> pivot;
    partition(arr, pivot);
    print(arr);
}