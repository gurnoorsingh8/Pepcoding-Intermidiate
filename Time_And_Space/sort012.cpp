#include<iostream>
#include<vector>
using namespace std;

void swap(vector<int>& arr, int i, int j)
{
    cout << "Swapping index " + to_string(i) + " and index " + to_string(j) << endl;
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

void sort01(vector<int>& arr)
{
    int n = arr.size();
    int pt1 = 0;
    int pt2 = n - 1;
    int itr = 0;
    while(itr <= pt2)
    {
        if(arr[itr] == 0)
        {
            swap(arr, pt1++, itr++);
        }
        else if(arr[itr] == 2)
        {
            swap(arr, pt2--, itr);
        }
        else
        {
            itr++;
        }
    }
}

int  main()
{
    int n;
    cin >> n;

    vector<int> arr(n);
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    sort01(arr);
    
    for(int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}