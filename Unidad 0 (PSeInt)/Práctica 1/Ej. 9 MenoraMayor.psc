Algoritmo MenoraMayor
	Definir num1, num2, num3 Como Real
	Escribir "Escribe un n�mero"
	leer num1
	Escribir "Escribe otro n�mero"
	leer num2
	Escribir "Escribe otro n�mero"
	leer num3
	si (num1<num2) y (num2<num3) Entonces
		Escribir "Los n�meros de menor a mayor son: " num1 ", " num2 " y " num3
	FinSi
	si (num1<num3) y (num3<num2) Entonces
		Escribir "Los n�meros de menor a mayor son: " num1 ", " num3 " y " num2
	FinSi
	si (num2<num1) y (num1<num3) Entonces
		Escribir "Los n�meros de menor a mayor son: " num2 ", " num1 " y " num3
	FinSi
	si (num2<num3) y (num3<num1) Entonces
		Escribir "Los n�meros de menor a mayor son: " num2 ", " num3 " y " num1
	FinSi
	si (num3<num1) y (num1<num2) Entonces
		Escribir "Los n�meros de menor a mayor son: " num3 ", " num1 " y " num2
	FinSi
	si (num3<num2) y (num2<num1) Entonces
		Escribir "Los n�meros de menor a mayor son: " num3 ", " num2 " y " num1
	FinSi
	si (num1=num2) y (num1=num3) Entonces
		Escribir "Los n�meros son iguales"
	FinSi
FinAlgoritmo
