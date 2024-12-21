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
void insertion_sort(int *a , int n){
    for(int i = 2 ; i < n - 1 ; i++){
        int pos = i;
        while(pos > 0 && a[pos] < a[pos - 1]){
            swap(a[pos] , a[pos - 1]);
            pos--;
        }
    }
}
int main()
{
    ios_base :: sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int n;
    cin >> n;
    int a[n];
    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }
    insertion_sort(a , n);
    for(int i = 0; i < n; i++) {
        cout << a[i] << ' ';
    }
    return 0;
}