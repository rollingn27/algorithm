#include <iostream>
using namespace std;

int main() {
    // 킹 1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8
    int king, queen, look, bishop, night, pawn;
    cin >> king >> queen >> look >> bishop >> night >> pawn;
    
    cout << 1 - king << ' ' << 1 - queen << ' ' << 2 - look << ' ' << 2 - bishop << ' ' << 2 - night << ' ' << 8 - pawn;
    
    return 0;
}