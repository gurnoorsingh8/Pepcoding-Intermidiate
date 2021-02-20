// #include<iostream>
// using namespace std;

// void increasing(int n)
// {
//     if(n == 0)
//     {
//         return;
//     }
//     for(int i = 0; i <= n; i++)
//     {
//         cout << i << endl;
//     }
// }

// int main()
// {
//     int n;
//     cin >> n;
//     increasing(n);
//     return 0;
// }

#include<iostream>
using namespace std;
void increasing(int n)
{
    if(n == 0)
    {
        return;
    }
    increasing(n - 1);
    cout << n << endl;
}

int main()
{
    int n;
    cin >> n;
    increasing(n);
    return 0;
}