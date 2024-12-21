#include <bits/stdc++.h>
using namespace std;
const int maxn = 1e5 + 5;
int n , a[maxn];
long long dp[maxn];
int main()
{
    cin >> n;
    for(int i = 1; i <= n; i++){
        cin >> a[i];
        dp[i] = a[i];
    } 
    long long ans = dp[1];
    for(int i = 2; i <= n; i++) {
        dp[i] = max(dp[i] , dp[i - 1] + a[i]);
        ans = max(ans , dp[i]);
    }
    cout << ans;
    return 0;
}