Algoritmo SumaIndeterminada
	Definir  number, sumando, sumado Como Entero
	Escribir "Escribe el n�mero de n�meros que quieres sumar"
	leer number
	Para i<-1 Hasta number Hacer
		Escribir "Introduce un n�mero: "
		leer sumando
		sumado <- sumado + sumando
		Escribir "La suma es: " sumado
	Fin Para
	Escribir "La suma final de los " number " n�meros es: " sumado
	
FinAlgoritmo
