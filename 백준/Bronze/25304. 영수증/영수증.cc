#include <iostream>
using namespace std;

int main() {
    
    int total, kind, price, count, sum;
    cin >> total;
    cin >> kind;
    sum = 0;
    for(int i = 0; i < kind; i++) {
        cin >> price >> count;
        sum += price * count;
    }
    
    if(total == sum)
        cout << "Yes";
    else
        cout << "No";
    
    return 0;
}