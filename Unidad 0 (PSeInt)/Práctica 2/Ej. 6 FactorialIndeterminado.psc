Algoritmo FactorialIndeterminado
	Definir number, factorial Como Real
	Escribir "Escribe el n�mero del cual quieres saber su factorial"
	leer number
	factorial<-1
	Para i<-1 Hasta number Hacer
		factorial<-factorial*i
	Fin Para
	Escribir "El resultado es: " factorial
	
FinAlgoritmo
