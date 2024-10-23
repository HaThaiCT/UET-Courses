#include <bits/stdc++.h>

using namespace std;
const int maxn = 1e5 + 3;
int n,m;
vector<int> adj[maxn];
int main()
{
    ios_base :: sync_with_stdio(false); cin.tie(0); cout.tie(0);
    freopen("jobs.txt","r",stdin);
    freopen("jobs.out","w",stdout);
    cin >> n >> m;
    for(int i = 0; i < m; i++) {
        int u,v;
        cin >> u >> v;
        adj[u].push_back(v);
    }
    return 0;
}