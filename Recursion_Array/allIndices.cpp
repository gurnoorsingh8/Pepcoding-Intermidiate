#include<iostream>
#include<vector>
using namespace std;

void solution(vector<int>& arr, int idx, int num)
{
    if(idx == arr.size())
    {
        return;
    }
    if(arr[idx] == num)
    {
        cout << idx << " ";
    }
    solution(arr, idx + 1, num);
}

int main()
{
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int num;
    cin >> num;
    solution(arr, 0, num);
    return 0;
}