#include <string>
#include <iostream>
using namespace std;
//KURDE DZIA£A Napisac prosty QUIZ z 5 pytaniami z odpowiedziami typu string. Na koniec program ma wypisac ilosc zdobytych punktow.
/*
int main()
{
	string a, b, c, d, e;
	int suma = 0;
	cout << "Nazwa monitora: ";
	cin >> a;
	if (a == "Samsung") 
		suma++;
	cout << "Nazwa obudowy: ";
	cin >> b;
	if (b == "Modecom")
		suma++;
	cout << "Nazwa programu: ";
	cin >> c;
	if (c == "Visual")
		suma++;
	cout << "Nazwa projektu: ";
	cin >> d;
	if (d == "Projekt 3")
		suma++;
	cout << "Nazwa gita: ";
	cin >> e;
	if (e == "Github")
		suma++;
	cout << "Zdobyles " << suma << " punktow." << endl;
	system("pause");
	return 0;
}*/
//KURDE DZIALA Napisac program, ktory oblicza sume liczb w danej tablicy. Przy napotkanej wartosci mniejszej niz 0, program powinien sie zakonczyc. uzyc break i continue
/*int main()
{
	int tab[10] = { 1,1,1,0,1,1,1,1,1,1 };
	int suma = 0;
	for (int i = 0;i <= 10;i++)
	{
		if (tab[i] != 0)
			suma = suma + tab[i];
		else
			break;
	}
	cout << "Suma wynosi: " << suma << endl;
	system("pause");
	return 0;
}*/
//SIEMANKO DZIALA Napisac program (switch-case), ktory zamieni podana z klawiatury liczbe na odpowiednia nazwe miesiaca np.: 2->Luty
/*int main()
{
	int m;
	cout << "Podaj numer miesiaca: " << endl;
	cin >> m;
	switch (m)
	{
	case 1:
		cout << "Styczen" << endl; break;
	case 2:
		cout << "Luty" << endl; break;
	case 3:
		cout << "Marzec" << endl; break;
	case 4:
		cout << "Kwiecien" << endl; break;
	case 5:
		cout << "Maj" << endl; break;
	case 6:
		cout << "Czerwiec" << endl; break;
	case 7:
		cout << "Lipiec" << endl; break;
	case 8:
		cout << "Sierpien" << endl; break;
	case 9:
		cout << "Wrzesien" << endl; break;
	case 10:
		cout << "Pazdziernik" << endl; break;
	case 11:
		cout << "Listopad" << endl; break;
	case 12:
		cout << "Grudzien" << endl; break;
	}
	system("pause");
	return 0;
}*/
// JEZD kalkulator na switch-case
/*int main()
{
	int a, b, wybor;
	cout << " Menu wyboru: " << endl;
	cout << "[1.] Dodawanie " << endl;
	cout << "[2.] Odejmowanie " << endl;
	cout << "[3.] Mnozenie " << endl;
	cout << "[4.] Dzielenie " << endl;

	cout << " Twoj wybor to: " << endl;
	cin >> wybor;
	switch (wybor)
	{
	case 1:
		cout << "Podaj pierwsz¹ liczbe: ";
		cin >> a;
		cout << "Podaj drug¹ liczbe: ";
		cin >> b;
		cout << "Twoj wynik to : " << a + b << endl;
		break;

	case 2:
		cout << "Podaj pierwsz¹ liczbe: ";
		cin >> a;
		cout << "Podaj drug¹ liczbe: ";
		cin >> b;
		cout << "Twoj wynik to: " << a - b << endl;
		break;

	case 3:
		cout << "Podaj pierwsza liczbe: ";
		cin >> a;
		cout << "Podaj drug¹ liczbe: ";
		cin >> b;
		cout << "Twoj wynik to: " << a * b << endl;
		break;

	case 4:
		cout << "Podaj pierwsz¹ liczbe: ";
		cin >> a;
		cout << "Podaj drug¹ liczbe: ";
		cin >> b;
		cout << "Twoj wynik to: " << a / b << endl;
		break;
	}
	system("pause");
	return 0;
}*/
// ELEGANCKO pole kwadratu na funkcji globalnej
/*int pole(int a,int b)
{
	return a*b;
}
int main()
{
	int x, y;
	cout << "Podaj X:";
	cin >> x;
	cout << "Podaj Y:";
	cin >> y;
	cout << "Pole wynosi: " << pole(x, y) << endl;
	system("pause");
	return 0;asdasd
}*/
// WZOR KIEPSKI ALE DZIALA funkcja z liczaca stopnie Farenheita na Celsjusza
int temp(int c)
{
	return 32 + (9 / 5)*c;
}
int main()
{
	int f;
	cout << "Podaj temp w stopniach fahrenheita: ";
	cin >> f;
	cout << "Temperatura w stopniach Celsjusza wynosi: " << temp(f) << endl;;
	system("pause");
	return 0;
}