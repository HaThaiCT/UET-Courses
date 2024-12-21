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
const int maxn = 1e5;
int par[maxn];
struct Edge{
    int u,v,d;
    Edge (int _u = 0, int _v = 0, int _d = 0) {
        u = _u;
        v = _v;
        d = _d;
    }

    bool operator <(const Edge& other) const {
        return (d < other.d);
    }
};

vector<Edge> kq;

int find_set(int u) {
    return par[u] == u ? u : par[u] = find_set(par[u]);
}


bool union_set(Edge edge) {
    int u = edge.u;
    int v = edge.v;
    int d = edge.d;
    u = find_set(u);
    v = find_set(v);
    if(u == v) return 0;
    kq.push_back(edge);
    par[v] = u;
    return 1;
}


int main()
{
    ios_base :: sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int n,m;
    cin >> n >> m;
    vector<Edge> e; 
    For(i,1,m) {
        int u , v, d;
        cin >> u >> v >> d;
        e.push_back(Edge(u,v,d));
    }
    For(u,1,n) {
        par[u] = u;
    }
    sort(e.begin() , e.end());
    int ans = 0;
    for(Edge edge : e) {
        ans += (int)union_set(edge) * edge.d;
    }
    cout << ans << '\n';
    for(Edge edge : kq) {
        cout << edge.u << ' ' << edge.v << ' ' << edge.d << '\n';
    } 
    return 0;
}