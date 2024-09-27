#include <bits/stdc++.h>
using namespace std;

const int maxmem = 1e4 + 5;

struct Stack{
    int top = 0;
    int s[maxmem];

    void push(int x) {
        s[top++] = x;
    }

    void pop() {
        if (top > 0) {
            top--;
        }
    }

    void printStack() {
        for(int i = 0 ; i < top ; i++) {
            cout << s[i] << ' ';
        }
    }
};

int main()
{
    Stack s;
    int n;
    cin >> n;
    while(n--) {
        string method;
        cin >> method;
        if(method == "push") {
            int x;
            cin >> x;
            s.push(x);
        }
        if(method == "pop") {
            s.pop();
        }
    }
    s.printStack();
    return 0;
}