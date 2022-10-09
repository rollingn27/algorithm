#include <iostream>
using namespace std;

int main() {
    
    int A, B;
    
    cin >> A >> B;
    
    double c = (double)A / double(B);
    cout.precision(10);
    cout << c;
    
    return 0;
}