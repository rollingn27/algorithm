#include <iostream>
using namespace std;

int main() {
    
    ios::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    
    int C, N, sum, count;
    double p, av;
    cin >> C;
    cout << fixed;
    cout.precision(3);
    
    for(int i = 0; i < C; i++) {
        cin >> N;
        int score[N];
        sum = count = 0;
        for(int j = 0; j < N; j++) {
            cin >> score[j];
            sum += score[j];
        }
        av = (double) sum / N;
        
        for(int j = 0; j < N; j++) {            
            
            if(av < score[j])
                count++;
        }
        
        p = (double) count / N * 100;        
        
        cout << p << "%\n";
    }
    
    return 0;
}