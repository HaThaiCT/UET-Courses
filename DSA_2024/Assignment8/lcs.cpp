
#include <bits/stdc++.h>
using namespace std;
const int maxn = 3e3 + 29;
string s , t;
int ns , nt;
int dp[maxn][maxn] = {0} ;
pair<int,int> trace[maxn][maxn];
vector <char> ans;
int main()
{
    ios_base :: sync_with_stdio(false); cin.tie(0); cout.tie(0);
    cin >> s;
    cin >> t;
    ns = s.size();
    nt = t.size();
    s = " " + s;
    t = " " + t;
    for(int i = 1; i <= ns; i++)
    for(int j = 1; j <= nt; j++){
        if(s[i] == t[j]){
            dp[i][j] = dp[i-1][j-1] + 1;
            trace[i][j] = make_pair(i - 1 , j - 1);
        }
        else{
            if(dp[i-1][j] > dp[i][j-1]) trace[i][j] = make_pair(i - 1 , j);
            else trace[i][j] = make_pair(i , j - 1);
            dp[i][j] = max(dp[i-1][j] , dp[i][j-1]) ;
        }
    }
    while(1){
        if(ns == 0 && nt == 0) break;
        if(s[ns] == t[nt]) ans.push_back(s[ns]);
        int i = trace[ns][nt].first;
        int j = trace[ns][nt].second;
        ns = i;
        nt = j;
    }
    reverse(ans.begin() , ans.end());
    cout << ans.size() << '\n';
    for(char c : ans) cout << c;
    return 0;
}