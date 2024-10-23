#include <bits/stdc++.h>
using namespace std;

int n,m;
vector<int> adj[100001];
bool visited[100001];
void dfs(int u) {
    visited[u] = true;
    for(int v : adj[u]) {
        if(!visited[v]) {
            dfs(v);
        }
    }
}
int main()
{
    cin >> n >> m;
    for(int i = 0; i < m; i++) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    int ans = 0;
    for(int i = 1; i <= n ; i++) {
        if(!visited[i]) {
            ans++;
            dfs(i);
        }
    }

    cout << ans;
    
    return 0;
}