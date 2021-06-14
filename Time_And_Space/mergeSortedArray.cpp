#include<iostream>
#include<vector>
using namespace std;

vector<int> solution(vector<int>& A, vector<int>& B)
{
    int n = A.size();
    int m = B.size();
    if(n == 0 || m == 0)
    {
        return n == 0 ? B : A;
    }
    int i = 0;
    int j = 0;
    int k = 0;
    vector<int> ans(n + m, 0);

    while(i < n && j < m)
    {
        if(A[i] < B[j])
        {
            ans[k++] = A[i++];
        }
        else
        {
            ans[k++] = B[j++];
        }
    }
    while(i < n)
    {
        ans[k++] = A[i++];
    }
    while(j < m)
    {
        ans[k++] = B[j++];
    }

    return ans;
}

int main()
{
    int n;

    cin >> n;

    vector<int> A(n);

    for(int i = 0; i < n; i++)
    {
        cin >> A[i];
    }
    int m;
    cin >> m;
    vector<int> B(m);
    for(int i = 0; i < m; i++)
    {
        cin >> B[i];
    }
    vector<int> merge = solution(A, B);
    for(int i = 0; i < n + m; i++)
    {
        cout << merge[i] << " ";
    }
    return 0;
}