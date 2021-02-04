#include<iostream>
#include<vector>

using namespace std;
void input(vector<vector<int>>& arr){
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr[0].size();j++){
            cin>>arr[i][j];
        }
    }
}

void exitPoint(vector<vector<int>>& arr, int row, int col){

    int i=0,j=0,d=0;
    while(true){
        d=(d + arr[i][j])%4;
        if(d==0){
            j++;
            if(j==col) {
                cout<< i << endl << j-1 << endl;
                break;
            }
        }
        else if(d==1){
            i++;
            if(i==row) {
                cout<< i-1 << endl << j << endl;
                break;
            }

        }
        else if(d==2){
            j--;
            if(j==-1) {
                cout<< i << endl << j+1 << endl;
                break;
            }
        }
        else if(d==3){
            i--;
            if(i==-1) {
                cout<< i+1 << endl << j << endl;
                break;
            }
        }
    }

}

int main(){

    int n,m;
    cin>> n >> m;

    vector<vector<int>> arr(n, vector<int>(m,0));
    input(arr);
    exitPoint(arr,n,m);
    return 0;
}