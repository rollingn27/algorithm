#include <iostream>
using namespace std;

int main() {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int ori, count, newNum, one, ten;
    
    cin >> ori;
    
    count = 0;    
    newNum = ori;
    
    while(1) {
        count++;
        ten = newNum / 10;
        one = newNum % 10;                
        newNum = one * 10 + (ten + one) % 10;
        
        if(ori == newNum)
            break;
    }
    
    cout << count;
    
    return 0;
}