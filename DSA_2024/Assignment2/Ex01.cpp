#include <bits/stdc++.h>

using namespace std;

void merge(int a[] , int l , int mid , int r) {
    vector<int> x(a + l , a + mid + 1);
    vector<int> y(a + mid + 1 , a + r + 1);
    int i = 0 , j = 0;
    while(i < x.size() && j < y.size()) {
        if(x[i] < y[j]){
            a[l] = x[i];
            l++;
            i++;
        }
        else{
            a[l] = y[j];
            l++;
            j++;
        }
    }
    while(i < x.size()) {
        a[l] = x[i];
        l++;
        i++;
    }
    while(j < y.size()) {
        a[l] = y[j];
        l++;
        j++;
    }
}

void merge_sort(int a[] , int l , int r) {
    if(l >= r) return;
    int mid = (l + r) / 2;
    merge_sort(a , l , mid);
    merge_sort(a , mid + 1 , r);
    merge(a , l , mid , r);
}

int main()
{
    int n;
    cin >> n;
    int a[n + 1];
    for(int i = 0 ; i < n ; i++) {
        cin >> a[i];
    }
    merge_sort(a , 0 , n - 1);
    a[n] = a[n - 1] + 1;
    long long answer = 0;
    long long count = 1;
    for(int i = 0 ; i < n ; i++) {
        if(a[i] == a[i + 1]) {
            count++;
        }
        else {
            answer += (count * (count - 1)) / 2;
            count = 1;
        }
    }
    cout << answer;
    return 0;
}