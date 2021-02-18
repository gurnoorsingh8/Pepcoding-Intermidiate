#include<iostream>
using namespace std;
void incDec(int n)
{
    if(n == 0)
    {
        return;
    }
    cout << n << endl;
    incDec(n - 1);
    cout << n << endl;
}

int main()
{
    int n;
    cin >> n;
    incDec(n);
    return 0;
}