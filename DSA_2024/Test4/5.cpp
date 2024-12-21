#include <bits/stdc++.h>
using namespace std;
const int maxn = 1e5 + 5;
int n,k,a[maxn];
int target_sum = 0;
bool ok = 0, used[maxn] = {0};
void Try(int i, int sum) {
    if (i > n) {
        //bool right = 1;
        // for(int j = 1; j <= n; j ++) if(used[j] == 0) {
        //     right = 0;
        //     break;
        // }
        //if(sum == target_sum) {
            cout << "yes";
            exit(0);
       // }
        return;
    }
    for(int j = 1; j <= n; j++) if(used[j] == 0 && sum + a[j] <= target_sum) {
        used[j] = 1;
        if(sum + a[j] < target_sum) Try(i + 1 , sum + a[j]);
        else Try(i + 1 , 0);
        used[j] = 0;
    }
}
int main()
{
    cin >> n >> k;
    
    for(int i = 1; i <=n ; i++) {
        cin >> a[i];
        target_sum += a[i];
    }
    target_sum /= k;
    sort(a + 1 , a + 1 + n, greater<int>());
    Try(1 , 0);
    cout << "no";
    return 0;
}