#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    
    int n, count, score;
    cin >> n;
    string temp;
    string testCase[n];
    
    for(int i = 0; i < n; i++) {
        cin >> temp;
        testCase[i] = temp;
    }
    
    for(int i = 0; i < n; i++) {
        count = score = 0;
        for(int j = 0; j < testCase[i].length(); j++) {
            if(testCase[i][j] == 'O')
                count++;
            else
                count = 0;
            score += count;
        }
        
        cout << score << "\n";
    }
    
    return 0;
}