Algoritmo CalculadoraSimple
	definir num1, num2 Como Real
	Definir op Como Caracter
	Escribir "introduce un n�mero"
	leer num1
	Escribir "introduce otro n�mero"
	leer num2
	Escribir "introduce la operaci�n que quieres realizar (suma, resta, multiplicaci�n o divisi�n)"
	leer op
	Si (op="suma") Entonces
		escribir "El resultado es " num1+num2
	Fin Si
	si (op="resta") Entonces
		Escribir "El resultado es " num1-num2
	FinSi
	si (op="multiplicaci�n") Entonces
		Escribir "El resultado es " num1*num2
	FinSi
	si (op="divisi�n") Entonces
		Escribir "El resultado es " num1/num2
	FinSi
FinAlgoritmo
