#include <bits/stdc++.h>
using namespace std;

struct Queue {
    int arr[1000];
    int front = 0 , last = 0;
    /*
        push method : complexity O(1)
    */
    void push(int value) { 
        arr[last] = value;
        last++;
    }
    /*
        pop method : complexity O(1)
    */
    void pop() {
        front++;
    }
    /*
        print method : complexity O(last - front + 1)
    */
    void printQueue() {
        for(int i = front; i < last; i++) {
            cout << arr[i] << ' ';
        }
    }
};

int main()
{
    Queue q;
    q.push(1);
    q.push(2);
    q.push(19);
    q.pop();
    q.printQueue();
    return 0;
}