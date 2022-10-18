#include <iostream>
using namespace std;

int main() {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int n, temp, max;    
    cin >> n;    
    int score[n];
    float sum;
    
    for(int i = 0; i < n; i++) {
        cin >> temp;
        score[i] = temp;
    }
    
    max = score[0];
    for(int i = 1; i < n; i++) {
        if(max < score[i])
            max = score[i];
    }
    sum = 0.0;
    
    for(int i = 0; i < n; i++) {
        sum += (float)score[i] / max * 100;
    }
    
    cout << sum / n;
    
    return 0;
}