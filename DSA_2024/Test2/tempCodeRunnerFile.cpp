#include <bits/stdc++.h>
using namespace std;
const int maxn = 1e5 + 5;
int n, d[maxn] = {0};
vector<int> adj[maxn];
bool check = 1;
void dfs(int u , int p) {
    if(adj[u].size() <= 1) {
        if(d[u] > n / 2) check = 0;
        return;
    }
    for(int v : adj[u]) if(v != p) {
        d[v] = d[u] + 1;
        dfs(v , u);
    }
}
int main()
{
    cin >> n;
    for(int i = 0 ; i < n - 1; i++){
        int u,v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    dfs(0,-1);
    if(check == 1) cout << "yes";
    else cout << "no";
    return 0;
}