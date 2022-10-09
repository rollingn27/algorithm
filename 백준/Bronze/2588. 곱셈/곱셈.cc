#include <iostream>
using namespace std;

int main() {
    int a, b;   
    
    cin >> a >> b;
    
    int b2 = b / 100;
    int b1 = (b - b2 * 100) / 10;
    int b0 = b - b2 * 100 - b1 * 10;
    
    cout << a * b0 << endl;
    cout << a * b1 << endl;
    cout << a * b2 << endl;
    cout << (a * b0) + (a * b1) * 10  + (a * b2) * 100 << endl;    
    
    return 0;
}