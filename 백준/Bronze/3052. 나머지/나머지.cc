#include <iostream>
#define divisor 42
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int arr[10];
    int temp;
    int count, kind;
    kind = 0;
    for(int i = 0; i < 10; i++) {
        cin >> temp;
        arr[i] = temp % divisor;
    }
    
    for(int i = 0; i < 10; i++) {
        count = 0;
        for(int j = i + 1; j < 10; j++) {
            if(arr[i] == arr[j])
                count++;
        }
        
        if(count == 0)
            kind++;
    }
    
    
        
    cout << kind;    
    
    return 0;
}