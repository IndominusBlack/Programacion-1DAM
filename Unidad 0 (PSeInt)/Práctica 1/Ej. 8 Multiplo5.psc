Algoritmo Multiplo5
	Definir number Como Real
	Escribir "introduce un n�mero"
	Leer number
	Si (number=0) Entonces
		Escribir "tu n�mero es 0"
	SiNo
		si (number%5=0) Entonces
			Escribir "tu n�mero acaba en 5" sin saltar
		sino escribir "tu n�mero no termina en 5" sin saltar
			
		FinSi
	Fin Si
	si (number<0) Entonces
		Escribir " y es negativo"
	FinSi
	si (number>0) Entonces
		Escribir " y es positivo"
	FinSi

FinAlgoritmo
