Algoritmo TerminaCero
	definir number Como Entero
	Escribir "escribe un número"
	leer number
	Si (number=0) Entonces
		Escribir "tu número es 0"
	SiNo
		si (number%10=0) Entonces
			Escribir "tu número acaba en 0" sin saltar
		sino escribir "tu número no termina en 0" sin saltar
			
		FinSi
	Fin Si
	si (number<0) Entonces
		Escribir " y es negativo"
	FinSi
	si (number>0) Entonces
		Escribir " y es positivo"
	FinSi
	
FinAlgoritmo
