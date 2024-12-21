#include <bits/stdc++.h>
using namespace std;
long long dp[102][102];
int main()
{
    int n;
    cin >> n;
    dp[0][0] = 1;
    for(int i = 1; i <= n; i++)
    for(int j = 0; j <= n; j++) {
        dp[i][j] = dp[i - 1][j] ;
        if(j >= i) dp[i][j] += dp[i - 1][j - i];
    }
    cout << dp[n][n];
    return 0;
}