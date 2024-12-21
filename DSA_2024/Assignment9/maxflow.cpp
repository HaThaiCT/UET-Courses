#include <bits/stdc++.h>
using namespace std;

const int MAX = 100; 

int capacity[MAX][MAX]; 
int flow[MAX][MAX];     
vector<int> adj[MAX];   


bool bfs(int s, int t, vector<int>& parent) {
    fill(parent.begin(), parent.end(), -1); 
    queue<int> q;
    q.push(s);
    parent[s] = s;

    while (!q.empty()) {
        int cur = q.front();
        q.pop();

        for (int next : adj[cur]) {
            if (parent[next] == -1 && capacity[cur][next] - flow[cur][next] > 0) {
                parent[next] = cur;
                if (next == t) return true; 
                q.push(next);
            }
        }
    }
    return false;
}

int maxFlow(int s, int t, int n) {
    memset(flow, 0, sizeof(flow)); 
    vector<int> parent(n);        
    int max_flow = 0;

    while (bfs(s, t, parent)) {
        int path_flow = INT_MAX;

        for (int v = t; v != s; v = parent[v]) {
            int u = parent[v];
            path_flow = min(path_flow, capacity[u][v] - flow[u][v]);
        }


        for (int v = t; v != s; v = parent[v]) {
            int u = parent[v];
            flow[u][v] += path_flow;
            flow[v][u] -= path_flow;
        }

        max_flow += path_flow;
    }

    return max_flow;
}

void printMinCut(int s, int n) {
    vector<bool> visited(n, false);
    queue<int> q;
    q.push(s);
    visited[s] = true;

    while (!q.empty()) {
        int u = q.front();
        q.pop();

        for (int v : adj[u]) {
            if (!visited[v] && capacity[u][v] - flow[u][v] > 0) {
                visited[v] = true;
                q.push(v);
            }
        }
    }

    cout << "Min-cut edges:\n";
    for (int u = 0; u < n; u++) {
        for (int v : adj[u]) {
            if (visited[u] && !visited[v] && capacity[u][v] > 0) {
                cout << u << " -> " << v << endl;
            }
        }
    }
}

int main() {
    int n, m, s, t; 
    cin >> n >> m >> s >> t;

    for (int i = 0; i < m; i++) {
        int u, v, c;
        cin >> u >> v >> c;
        capacity[u][v] = c;
        adj[u].push_back(v);
        adj[v].push_back(u); 
    }


    int result = maxFlow(s, t, n);
    cout << "Maximum Flow: " << result << endl;
    printMinCut(s, n);

    return 0;
}
