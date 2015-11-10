#include<iostream>
#include<cmath>
#include<conio.h>
using namespace std;
bool test(int so);
int main ()
{
	int so;
	cout << "nhap so can kiem tra: ";
	cin >> so;
	while(so <2||so >1000)
	{
		cout<<" nhap lai so (tu 2 den 1000)";
		cin >> so;
	}
	test(so);
	if (test(so)==false)
	cout << so << " khong la so nguyen to";
	else
	cout << so << " la so nguyen to";
	getch();
	return 0;
}
bool test(int so)
{
	int i, j;
	j=sqrt(so);
	for(i=2; i<=j; i++)
		{
			if((so%i)==0)
				return false;
		}
		return true;
}
