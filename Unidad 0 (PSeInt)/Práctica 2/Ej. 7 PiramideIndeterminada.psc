Algoritmo PiramideIndeterminada
	Definir number, piramide como entero
	Escribir "Escribe el n�mero de pisos que quieres que tenga la pir�mide"
	Leer number
	Para i<-1 Hasta number Con Paso 1 Hacer
		Para j<-1 Hasta (number-i) Con Paso 1 Hacer
			Escribir Sin Saltar " "
		FinPara
		Para k<-1 Hasta 2*i-1 Con Paso 1 Hacer
			Escribir Sin Saltar "*"
		FinPara
		Escribir ""
	Fin Para
	
FinAlgoritmo
