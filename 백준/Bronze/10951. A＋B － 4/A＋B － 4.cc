#include <iostream>
using namespace std;

int main() {   
    
    cin.tie(NULL);
    cout.tie(NULL);
    
    int a, b;
    
    while(1) {       
        
        cin >> a >> b;
        if(cin.eof())
            break;
        cout << a + b << "\n";
    }   
    
    return 0;    
}