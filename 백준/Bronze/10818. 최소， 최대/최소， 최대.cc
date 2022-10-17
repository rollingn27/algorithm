#include <iostream>
using namespace std;

int main() {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int a, b, max, min;
    cin >> a;
    
    int arr[a];    
    
    for(int i = 0; i < a; i++) {
        cin >> b;
        arr[i] = b;
    }   
    
    max = min = arr[0];
    
    for(int i = 0; i < a; i++) {                
        if(max < arr[i])
            max = arr[i];
        if(min > arr[i])
            min = arr[i];
    }
    
    cout << min << " " << max;
    
    return 0;
}