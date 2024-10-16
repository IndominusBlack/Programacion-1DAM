Algoritmo CalculadoraSimple
	definir num1, num2 Como Real
	Definir op Como Caracter
	Escribir "introduce un número"
	leer num1
	Escribir "introduce otro número"
	leer num2
	Escribir "introduce la operación que quieres realizar (suma, resta, multiplicación o división)"
	leer op
	Si (op="suma") Entonces
		escribir "El resultado es " num1+num2
	Fin Si
	si (op="resta") Entonces
		Escribir "El resultado es " num1-num2
	FinSi
	si (op="multiplicación") Entonces
		Escribir "El resultado es " num1*num2
	FinSi
	si (op="división") Entonces
		Escribir "El resultado es " num1/num2
	FinSi
FinAlgoritmo
