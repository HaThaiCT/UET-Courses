#include <bits/stdc++.h>
using namespace std;
const int maxmem = (int)1e4 + 5;
struct Queue{
    int q[maxmem];
    int head = 0;
    int tail = 0;
    void enqueue(int val) {
        q[tail] = val;
        tail++;
    }

    void dequeue() {
        if(head < tail) {
            head++;
        }
    }

    void printQueue() {
        for (int i = head; i < tail; i++) {
            cout << q[i] << ' ';
        }
    }
};

int main()
{
    Queue q;
    int n;
    cin >> n;
    while(n--) {
        string method;
        cin >> method;
        if (method == "enqueue") {
            int x;
            cin >> x;
            q.enqueue(x);
        }
        if (method == "dequeue") {
            q.dequeue();
        }
    }
    q.printQueue();
    return 0;
}