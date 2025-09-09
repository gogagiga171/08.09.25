#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<int> numbers;

    numbers.push_back(10);
    numbers.push_back(20);
    numbers.push_back(30);

    for (int n : numbers) {
        cout << n << " ";
    }
    cout << endl;

    if (numbers.size() > 1) {
        numbers.erase(numbers.begin() + 1);
    }

    for (int n : numbers) {
        cout << n << " ";
    }
    cout << endl;

    return 0;
}
