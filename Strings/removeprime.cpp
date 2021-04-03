#include<iostream>
#include<vector>
using namespace std;

bool isPrime(int n)
{
    for(int i = 0; i < n; i++)
    {
        if(n % i == 0)
        {
            return false;
        }
    }
    return true;
}

void removePrime(vector<int>& arr)
{
    vector<int> ans;
    for(int ele : arr)
    {
        if(!isPrime(ele))
        {
            ans.push_back(ele);
            // cout << ele;
        }

    }
    arr.clear();
    for(int ele : ans)
    {
        arr.push_back(ele);
    }

    for(int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] <<" ";
    }
    // cout << arr;
}

int main()
{
    int n;
    cin >> n;
    vector<int> arr;
    for(int i = 0 ; i < n; i++)
    {
        cin >> arr[i];
    }
    removePrime(arr);
    return 0;
}
// #include<iostream>
// #include<vector>
// using namespace std;

// bool isprime_(int n){

//         for(int i=2;i*i<=n;i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;

//     }
// void solution(vector<int>& al) {
//         vector<int> ans ;
//         for(int ele : al){
//             if(!isprime_(ele)) ans.push_back(ele);
//         }
//         al.clear();
//         for(int ele : ans) al.push_back(ele);

//     }
// int main(){

//     int n;
//     cin>>n;
//     vector<int> al;
//     for (int i = 0; i < n; i++) {
//         cin>>al[i];
//     }
//     solution(al);
//     for(int ele : al){
//         cout<<ele;
//     }
//     return 0;
// }