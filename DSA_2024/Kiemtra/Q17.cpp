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
const int maxn = 1e3 + 5;
int m , n;
int a[maxn][maxn];
int tx[] = {-1 , 0 , 1 , 0};
int ty[] = {0 , 1 , 0 , -1};
bool vst[maxn][maxn] = {0};
int dfs(int i , int j) {
    int res = 1;
    vst[i][j] = 1;
    For(t , 0 , 3) {
        int x = i + tx[t];
        int y = j + ty[t];
        if(x > 0 && x <= m && y > 0 && y <= n) {
            if(!vst[x][y] && a[x][y] == 1) {
                res += dfs(x , y); 
            }
        }
    }
    return res;
}
int main()
{
    ios_base :: sync_with_stdio(false); cin.tie(0); cout.tie(0);
    cin >> m >> n;
    For(i,1,m)
    For(j,1,n) {
        cin >> a[i][j];
    }
    int ans = 0;
    For(i,1,m)
    For(j,1,n) if(!vst[i][j] && a[i][j] == 1) {
        ans = max(ans , dfs(i , j));
    }
    cout << ans;
    return 0;
}