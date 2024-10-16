Algoritmo SucesionFibonacci
	Definir number, sucesion, total Como Real
	Escribir "Introduce la cantidad de números de la sucesión de Fibonacci quieres que se muestren"
	leer number
	sucesion<-0
	total<-1
	si (number=1) o (number=2) Entonces
		Escribir "El total tras " number " números en la sucesión de Fibonacci es: 1"
		SiNo Para i<-3 Hasta number Hacer
				sucesion<-total-sucesion
				total<-total+sucesion
			Fin Para
			Escribir "El total tras " number " números en la sucesión de Fibonacci es: " total
	FinSi
FinAlgoritmo
