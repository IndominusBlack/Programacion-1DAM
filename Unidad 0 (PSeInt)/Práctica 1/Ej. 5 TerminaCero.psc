Algoritmo TerminaCero
	definir number Como Entero
	Escribir "escribe un n�mero"
	leer number
	Si (number=0) Entonces
		Escribir "tu n�mero es 0"
	SiNo
		si (number%10=0) Entonces
			Escribir "tu n�mero acaba en 0" sin saltar
		sino escribir "tu n�mero no termina en 0" sin saltar
			
		FinSi
	Fin Si
	si (number<0) Entonces
		Escribir " y es negativo"
	FinSi
	si (number>0) Entonces
		Escribir " y es positivo"
	FinSi
	
FinAlgoritmo
