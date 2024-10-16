Algoritmo SumaIndeterminada
	Definir  number, sumando, sumado Como Entero
	Escribir "Escribe el número de números que quieres sumar"
	leer number
	Para i<-1 Hasta number Hacer
		Escribir "Introduce un número: "
		leer sumando
		sumado <- sumado + sumando
		Escribir "La suma es: " sumado
	Fin Para
	Escribir "La suma final de los " number " números es: " sumado
	
FinAlgoritmo
