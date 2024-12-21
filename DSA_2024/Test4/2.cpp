#include <bits/stdc++.h>
using namespace std;
const int maxn = 1e3 + 5;
int n,m,k;
vector<pair<int,int>> adj[maxn];
int d[maxn];
int main()
{
    cin >> n >> m >> k;
    for(int i = 1; i <= m; i++) {
        int u , v , w;
        cin >> u >> v >> w;
        adj[u].push_back(make_pair(v,w));
    }
    memset(d , 0x3f, sizeof d);
    d[k] = 0;
    priority_queue<pair<int,int> , vector<pair<int,int>>, greater<pair<int,int>>> q;
    q.push(make_pair(0 , k));
    while(!q.empty()) {
        int u = q.top().second;
        int w = q.top().first;
        q.pop();
        if(d[u] < w) continue;
        for(int i = 0; i < adj[u].size(); i++) {
            int v = adj[u][i].first;
            int w1 = adj[u][i].second;
            if(d[v] > d[u] + w1) {
                d[v] = d[u] + w1;
                q.push(make_pair(d[v] , v));
            }
        }
    }
    int ans = -1e9;
    for(int i = 1; i <= n; i++) {
        ans = max(ans , d[i]);
    }
    cout << ans;
    return 0;
}