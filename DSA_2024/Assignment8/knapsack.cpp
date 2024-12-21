#include <bits/stdc++.h>
using namespace std;
const int maxn = 1e2;
const int maxw = 1e5;
int n , W , w[maxn] , c[maxn];
int dp[maxn][maxw];

/*
    Cách tham lam : Tìm ra được phương án chưa chắc đã tối ưu nhất nhưng độ phức tạp chỉ mất O(nlogn)
    Cách quy hoạch động : Luôn tìm ra được phương án tối ưu nhất nhưng mất độ phức tạp O(n*W)
 */
void greedy() {
    vector<pair<double,pair<int,int>>> v;
    for (int i = 1; i <= n; i++) v.push_back(make_pair((double)c[i]/w[i], make_pair(c[i],w[i])));
    int sumval = 0;
    int sumweight = 0;
    sort(v.begin(), v.end(), greater<>());
    for (int i = 0; i < n; i++) {
        if (sumweight + v[i].second.second <= W) {
            sumval += v[i].second.first;
            sumweight += v[i].second.second;
        }
    }
    cout << sumval << endl;
}
void dynamic_programing() {
    for(int i = 1; i <= n; i++)
    for(int j = 0; j <= W; j++){
        dp[i][j] = dp[i-1][j];
        if(j >= w[i]) dp[i][j] = max(dp[i][j] , dp[i-1][j - w[i]] + c[i]);
    }
    int answer = 0;
    for(int i = 0; i <= W; i++) {
        answer = max(answer, dp[n][i]);
    }
    cout << answer << endl;
}
int main()
{
    cin >> n >> W;
    for(int i = 1; i <= n; i++) {
        cin >> w[i] >> c[i];
    }
    greedy();
    dynamic_programing();
    return 0;
}