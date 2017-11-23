//DZIALA Napisac program, ktory zawiera funkcje fibonacci() zwracajaca ciag liczb o dlugosci n podanej przez uzytkownika.

#include <iostream>
using namespace std;
/*
void fibonacci(int n)
{
	float a=0, b=1;
	for (int i = 0;i < n;i++)
	{
		cout << b << " ";
		b += a;
		a = b - a;
	}
}

int main()
{
	int i;
	cout << "Podaj liczbe:";
	cin >> i;
	fibonacci(i);
	system("pause");
	return 0;
}*/
//WORKS FINENapisac program, ktory zawiera funkcje potega() dzialajaca w sposob rekurencyjny i zwracajaca wybrana liczbe podniesiona do odpowiedniej potegi.
/*
int potega(int a, int n)
{
	if (n == 1)
		return a;
	int s = potega(a, n - 1);
	return a * s;
}
int main()
{
	int i,j;
	cout << "Podaj liczbe ktora chcesz spotegowac: ";
	cin >> i;
	cout << "Podaj potege:";
	cin >> j;
	cout << potega(i, j) << endl;
	system("pause");
	return 0;
}*/
//ELEGANCJA Napisac program, ktory zawiera funkcje fibonacci() dzialajaca w sposob rekurencyjny i zwracajaca wybrany wyraz ciagu n.
/*
int fibonacci(int n)
{
	if (n<3)
		return 1;
	else
	return fibonacci(n - 2) + fibonacci(n - 1);
}

int main()
{

	int n;

	cout << "Podaj nr wyrazu ciagu: ";
	cin >> n;

	cout << n << " wyraz ciagu ma wartosc " << fibonacci(n) << endl;

	system("pause");
	return 0;
}*/
// NOT WORKING Napisac program, ktory zawiera funkcje: wypelnij()- wypelniajaca tablice 10 elementowa oraz srednia()- obliczajaca srednia liczb z tablicy.

int wypelnij(int t[],int size)
{
	int tab[10];
	for (int i = 0;i <= 10;i++)
		for (int j = 0;j <= 10;j++)
			tab[i] = j;
	return tab[10];
}
int srednia()
{
	int t[10],sr=0;
	for (int i = 0;i <= 10;i++)
		sr += t[i];
	sr / 10;
	return sr;
}
int main()
{
	int tb[10],size=10;
	wypelnij(tb, size);
	cout << "Srednia tablicy wynosi:" << srednia();
	system("pause");
	return 0;
}
