#include <bits/stdc++.h>
#define For(i,a,b) for(int i = (a) ; i <= (b) ; i++)
#define Forn(i,a,b) for(int i = (a) ; i >= (b) ; i--)
#define F first
#define S second
#define ll long long
#define db double
#define pii pair<int,int>
#define PB push_back
#define mp make_pair
#define getbit(i,x) ( (x >> i) & 1 )
#define CNT(x) __builtin_popcountll(x)
using namespace std;
const int maxn = 1e4 + 4;
int n, a[maxn] , ans = 0 , p;
vector<int> child[maxn];
long long dfs(int u) {
    long long res = a[u];
    for(int v : child[u]) {
        res += dfs(v);
    }
    return res;
}
int main()
{
    ios_base :: sync_with_stdio(false); cin.tie(0); cout.tie(0);
    cin >> n >> p;
    for(int i = 1 ; i <= n ; i++) {
        cin >> a[i];
        int m;
        cin >> m;
        for(int j = 1 ; j <= m; j++) {
            int v;
            cin >> v;
            child[i].push_back(v);
        }
    }
    cout << dfs(p);
    return 0;
}