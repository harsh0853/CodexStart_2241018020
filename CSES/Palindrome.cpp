#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin >> s;

    map<char, int> m;
    for (char c : s)
    {
        m[c]++;
    }

    int odd = 0;
    for (auto p : m)
    {
        if (p.second % 2 == 1)
            odd++;
    }

    if (odd > 1)
    {
        cout << "NO SOLUTION" << endl;
        return 0;
    }

    string start;
    string mid;
    string end;

    for (auto p : m)
    {
        string s(p.second / 2, p.first);
        start += s;
        end += s;
        if (p.second % 2 == 1)
        {
            mid = p.first;
        }
    }

    reverse(end.begin(), end.end());
    cout << start << mid << end << endl;
}
/*Name : Harsh Raj , Reg : 2241018020 , Link : https://cses.fi/problemset/task/1755*/