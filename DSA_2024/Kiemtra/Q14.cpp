#include <bits/stdc++.h>
using namespace std;
void insertionSort(int* a , int n){
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
    insertionSort(a , n);
    for(int i = 0; i < n; i++) {
        cout << a[i] << ' ';
    }
    return 0;
}