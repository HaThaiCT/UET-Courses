#include <bits/stdc++.h>
using namespace std;

struct Stack {
    int arr[1000];
    int last = 0;
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
        last--;
    }
    /*
        print method : complexity O(last - front + 1)
    */
    void printStack() {
        for(int i = 0; i < last; i++) {
            cout << arr[i] << ' ';
        }
    }
};

int main()
{
    Stack s;
    s.push(1);
    s.push(2);
    s.push(19);
    s.pop();
    s.printStack();
    return 0;
}