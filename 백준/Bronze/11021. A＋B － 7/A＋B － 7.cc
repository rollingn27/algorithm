#include <iostream>
using namespace std;

int main () {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int a, b, T;
    
    cin >> T;
    for(int i = 1; i <= T; i++){
        cin >> a >> b;
        cout << "Case #" << i << ": " << a + b << "\n";
    }    
    
    return 0;
}

