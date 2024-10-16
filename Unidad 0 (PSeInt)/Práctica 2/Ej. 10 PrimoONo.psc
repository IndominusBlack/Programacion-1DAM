Algoritmo PrimoONo
	Definir number, contador Como Entero
	Escribir "Escribe el número del que quieras saber si es primo o no"
	Leer number
	contador<-2
	Para i<-1 Hasta number con paso 1 Hacer
		Mientras (contador<number) y (number%contador<>0) Hacer
			contador<-contador+1
		FinMientras
	FinPara
	Si (contador=number) Entonces
		Escribir number " es primo"
	SiNo
		Escribir number " no es primo"
	FinSi
FinAlgoritmo