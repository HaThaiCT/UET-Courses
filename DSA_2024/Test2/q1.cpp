#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--) {
        string x;
        cin >> x;
        stack<char> s;
        bool check = 1;
        for(char c : x) {
            if(c == '(' || c == '{' || c == '[') {
                s.push(c);
            }
            else {

                char target;
                if(c == ')') target = '(';
                if(c == '}') target = '{';
                if(c == ']') target = '[';
                    char top = s.top();
                    
                    if(top == target) {
                        s.pop();
                    }
                    else check = 0;
            }
        }
        if(check == 1 && s.empty()) cout << "yes";
        else cout << "no";
        cout << '\n';
    }
    return 0;
}