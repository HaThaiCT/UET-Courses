/*
    Method 1 : Using for loop , the complexity is O(n)
    Method 2 : Using recursion function , the complexity is O(log2(n))
*/

#include <bits/stdc++.h>
using namespace std;
long long method1(int n){
    long long ans = 1;
    for(int i = 0; i < n; i++) {
        ans = ans * 2;
    }
    return ans;
}
long long method2(int n) {
    if(n == 0) return 1;
    long long res = method2(n / 2);
    res = res * res;
    if(n % 2 == 1) return (2 * res);
    return res;
}
int main()
{
    int n;
    cin >> n;
    cout << method1(n) << '\n';
    cout << method2(n);
    return 0;
}