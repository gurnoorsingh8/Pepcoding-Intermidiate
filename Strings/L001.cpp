#include<iostream>
using namespace std;

void test1()
{
    string str = "Hello World ";
    str += 'g';  //  complexity O(1)
    str.push_back('o'); // str += 'a' is equal to str.push_back('a')
    
    string str1 = str;
    str1 += " now";  // same thing as above but complexity is O(n)

    char ch = str[3];

    cout << str << " " << str1 << endl;
}

void test2()
{
    string str = "";
    for(int i = 0; i < (int)1e6; i++)
    {
        str += to_string(i);
    }
    cout << str << endl;
}

int main()
{
    test1();
    return 0;
}