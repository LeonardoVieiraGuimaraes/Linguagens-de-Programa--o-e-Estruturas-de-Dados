#include <iostream>
using namespace std;

int comb(int n, int k)
{

    if (k == 1)
    {
        return n;
    }
    else if (k == n)
    {
        return 1;
    }
    else
    {
        return comb(n - 1, k - 1) + comb(n - 1, k);
    }
    return 0;
}

int main()
{
    int n, k;
    cout << "Enter n: ";
    cin >> n;
    cout << "Enter k: ";
    cin >> k;
    if (k > 0 && k < n)
    {
        cout << "C(" << n << "," << k << ") = " << comb(n, k) << endl;
    }
    else{
        cout << "K deverá ser menor que 5" << endl;
    }
    return 0;
}
