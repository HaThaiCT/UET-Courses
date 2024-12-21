#include <bits/stdc++.h>
using namespace std;
const int maxn = 1e5 + 5;
int n,m;
set<int> adj[maxn];
bool vst[maxn] = {0};
void dfs(int u) {
    vst[u] = 1;
    cout << u << ' ';
    
    for(int v : adj[u]) if(!vst[v]) {
        dfs(v);
    }
    
}
int main()
{
    cin >> n >> m;
    for(int i = 1; i <= m; i++) {
        int u,v;
        cin >> u >> v;
        adj[u].insert(v);
        adj[v].insert(u);
    }
    
    dfs(1);
    return 0;
}