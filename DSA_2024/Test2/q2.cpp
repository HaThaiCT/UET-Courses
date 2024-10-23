#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    stack<int> s;
    cin >> n;
    while(n--){
        int t;
        cin >> t;
        if(t == 1){
            int x;
            cin >> x;
            s.push(x);
        }
        if(t == 2){
            if(!s.empty()) s.pop();
        }
        if(t == 3){
            cout << s.top() << '\n';
        }
    }
    return 0;
}