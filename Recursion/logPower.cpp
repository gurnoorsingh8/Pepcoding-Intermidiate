#include<iostream>
using namespace std;

int linearPower(int x, int n)
{
    if(n == 0)
    {
        return 1;
    }
    int ans = linearPower(x, n - 1);
    return ans * x;
}

int main()
{
    int x, n;
    cin >> x >> n;
    cout << linearPower(x, n);
    return 0;
}