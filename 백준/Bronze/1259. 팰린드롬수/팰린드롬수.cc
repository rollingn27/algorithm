#include <iostream>

using namespace std;

int main() {

	while (true) {
		string temp_num;

		cin >> temp_num;

		if (temp_num == "0")
			break;
		
		int s_idx = 0;
		int e_idx = temp_num.size() - 1;

		bool flag = true;

		while (s_idx < e_idx) {
			if (temp_num[s_idx] != temp_num[e_idx]) {
				cout << "no" << '\n';
				flag = false;
				break;
			}
			s_idx++;
			e_idx--;
		}
		
		if (flag) {
			cout << "yes" << '\n';
		}
	}

	return 0;
}