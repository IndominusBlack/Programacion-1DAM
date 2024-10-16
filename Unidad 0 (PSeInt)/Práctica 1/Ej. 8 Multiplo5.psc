Algoritmo Multiplo5
	Definir number Como Real
	Escribir "introduce un número"
	Leer number
	Si (number=0) Entonces
		Escribir "tu número es 0"
	SiNo
		si (number%5=0) Entonces
			Escribir "tu número acaba en 5" sin saltar
		sino escribir "tu número no termina en 5" sin saltar
			
		FinSi
	Fin Si
	si (number<0) Entonces
		Escribir " y es negativo"
	FinSi
	si (number>0) Entonces
		Escribir " y es positivo"
	FinSi

FinAlgoritmo
