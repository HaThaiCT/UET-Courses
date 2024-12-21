#include <iostream>
#include <queue>
#include <unordered_map>

using namespace std;

int main() {
    int Q;
    cin >> Q;

    priority_queue<int, vector<int>, greater<int>> minHeap;
    unordered_map<int, int> count; 

    while (Q--) {
        int type;
        cin >> type;

        if (type == 1) {

            int v;
            cin >> v;
            minHeap.push(v);
            count[v]++;
        } else if (type == 2) {

            int v;
            cin >> v;
            count[v]--; 
        } else if (type == 3) {

            while (!minHeap.empty() && count[minHeap.top()] == 0) {
                minHeap.pop();
            }
            if (!minHeap.empty()) {
                cout << minHeap.top() << endl;
            }
        }
    }

    return 0;
}
