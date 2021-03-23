#include<iostream>
using namespace std;
void pattern(int cst, int nst, int n, int m)
{
    if(n == 0)
    {
        return;
    }
    cout << "*" << endl;
    pattern(n - 1, m);
}

int main()
{
    int n, m;
    cin >> n >> m;  
    pattern(n, m);
    return 0;
}