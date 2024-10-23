#include <bits/stdc++.h>
using namespace std;

int n,m;
vector<int> adj[100001];
int d[100001];
int shortest(int x, int y) {
    memset(d , -1, sizeof d);
    queue<int> q;
    q.push(x);
    d[x] = 0;
    while(!q.empty()) {
        int u = q.front();
        q.pop();
        for(int v : adj[u]) {
            if(d[v] == -1) {
                d[v] = d[u] + 1;
                if(v == y) return d[y];
                q.push(v);
            }
        }
    }
    if(d[y] == -1) d[y] = 1e9;
    return d[y];
}
int main()
{
    int x , y;
    cin >> n >> m >> x >> y;
    for(int i = 0; i < m; i++) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
    }
    int ans = min(shortest(x,y) , shortest(y,x));
    cout << ans;
    return 0;
}