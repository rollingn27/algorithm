#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int arr[9];
    int max, idx, n;
    for(int i = 0; i < 9; i++) {
        cin >> n;
        arr[i] = n;
    }
    
    max = arr[0];
    idx = 0;
    for(int i = 0; i < 9; i++) {
        if(max < arr[i]) {
           max = arr[i];
            idx = i;
        }            
    }
    
    cout << max << "\n" << (idx + 1);
        
        
    return 0;
}