Algoritmo MediaIndeterminada
	Definir medio, number, mediatotal, suma Como Real
	Escribir "Escribe la cantidad de n�meros de los cuales quieres obtener la media"
	leer number
	suma<-0
	Para i<-1 Hasta number Hacer
		Escribir "Escribe un n�mero"
		Leer medio
		suma<-suma+medio
		Escribir "La suma actual es: " suma
	Fin Para
	mediatotal<-suma/number
	Escribir "La media de todos los n�meros es de: " mediatotal
FinAlgoritmo
