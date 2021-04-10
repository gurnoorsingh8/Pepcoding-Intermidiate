#include<iostream>
#include<vector>
using namespace std;

void insertionSort(vector<int>& arr)
{
        //write your code here
    for(int  i  =  1; i < arr.size(); i++)
    {
        for(int j = i - 1; j >= 0; j--)
        {
            if(isGreater(arr, j, j+1))
            {
                swap(arr, j, j+1);
            }
            else
            {
                break;
            }
            
    }
}

    // used for swapping ith and jth elements of array
void swap(vector<int>& arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

    // return true if jth element is greater than ith element
bool isGreater(vector<int>& arr, int j, int i)
{
    if (arr[i] < arr[j])
    {
        return true;
    }
    else
    {
        return false;
    }
}

void print(vector<int>& arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i];
    }
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
    insertionSort(arr);
    print(arr);
}