#include <bits/stdc++.h>
using namespace std;
void print_array(int a[] , int n){
    for(int i = 0 ; i < n ; i++){
        cout << a[i] << ' ';
    }
}
void selection_sort(int a[] , int n){
    for(int i = 0 ; i < n - 1 ; i++){
        int min_pos = i;
        for(int j = i + 1 ; j < n ; j++){
            if(a[j] < a[min_pos]){
                min_pos = j;
            }
        }
        swap(a[i] , a[min_pos]);
    }  
}

void bubble_sort(int a[] , int n){
    for(int i = 0 ; i < n - 1; i++){
        for(int j = 0 ; j < n - i - 1 ; j++){
            if(a[j] > a[j + 1]){
                swap(a[j] , a[j + 1]);
            }
        }
    }
}

void insertion_sort(int a[] , int n){
    for(int i = 1 ; i < n ; i++){
        int pos = i;
        while(pos > 0 && a[pos] < a[pos - 1]){
            swap(a[pos] , a[pos - 1]);
            pos--;
        }
    }
}

void merge(int a[] , int l , int mid , int r){
    vector<int> x(a + l , a + mid + 1);
    vector<int> y(a + mid + 1 , a + r + 1);
    int i = 0 , j = 0;
    while(i < x.size() && j < y.size()){
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
    while(i < x.size()){
        a[l] = x[i];
        l++;
        i++;
    }
    while(j < y.size()){
        a[l] = y[j];
        l++;
        j++;
    }
}

void merge_sort(int a[] , int l , int r){
    if(l >= r) return;
    int mid = (l + r) / 2;
    merge_sort(a , l , mid);
    merge_sort(a , mid + 1 , r);
    merge(a , l , mid , r);
}

int partition(int a[] , int l , int r){
    int pivot = a[r];
    int i = l - 1;
    for(int j = l ; j < r ; j++){
        if(a[j] <= pivot){
            i++;
            swap(a[i] , a[j]);
        }
    }
    // dua chot ve giua
    i++;
    swap(a[i] , a[r]);
    return i; // tra ve vi tri cua chot

}

void quick_sort(int a[] , int l , int r){
    if(l >= r) return;
    int p = partition(a , l , r);
    quick_sort(a , l , p - 1);
    quick_sort(a , p + 1 , r);
}

void heapify(int a[] , int n , int i){
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    int largest = i;
    if(l < n && a[l] > a[largest]){
        largest = l;
    }
    if(r < n && a[r] > a[largest]){
        largest = r;
    }
    if(largest != i){
        swap(a[i] , a[largest]);
        heapify(a , n , largest);
    }
}

void heap_sort(int a[] , int n){
    for(int i = n / 2 - 1 ; i >= 0 ; i--){
        heapify(a , n , i);
    }
    for(int i = n - 1 ; i >= 0 ; i--){
        swap(a[i] , a[0]);
        heapify(a , i , 0);
    }
}

void radix_sort(int a[] , int n) {
    int maxval = a[0];
    for(int i = 0 ; i < n ; i++){
        maxval = max(maxval , a[i]);
    }
    int base = 1;
    while(maxval / base > 0) {
        vector<int> v(n);
        vector<int> cnt(10, 0);
        for(int i = 0; i < n; i++) {
            cnt[(a[i] / base) % 10]++;
        }
        for(int i = 1; i < 10; i++) {
            cnt[i] += cnt[i - 1];
        }
        for(int i = n - 1; i >= 0; i--) {
            v[--cnt[(a[i] / base) % 10]] = a[i];
        }
        for(int i = 0; i < n; i++) {
            a[i] = v[i];
        }
        base *= 10;
    }
}

int main()
{
    //freopen("Ex03.inp" , "r" , stdin);
    //freopen("Ex03.out" , "w" , stdout);
    int n;
    cin >> n;
    int a[n];
    for(int i = 0 ; i < n ; i++){
        cin >> a[i];
    }
    //selection_sort(a , n);
    //bubble_sort(a , n);
    //insertion_sort(a , n);
    //merge_sort(a , 0 , n - 1);
    //quick_sort(a , 0 , n - 1);
    //heap_sort(a , n);
    radix_sort(a , n);
    //sort(a , a + n);
    print_array(a , n);

    return 0;
}
