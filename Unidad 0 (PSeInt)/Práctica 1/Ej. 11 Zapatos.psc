Algoritmo Zapatos
	Definir number Como Real
	Escribir "Introduce el n�mero de zapatos que vas a comprar"
	leer number
	menosdiez<-number*72
	menosveinte<-number*64
	menoscuarenta<-number*48
	si (number>10) y (number<=20) Entonces
		Escribir "El precio tras aplicar el 10% de descuento ser�a: " menosdiez
	FinSi
	si (number>20) y (number<=30) Entonces
		Escribir "El precio tras aplicar el 20% de descuento ser�a: " menosveinte
	FinSi
	si (number>30) Entonces
		Escribir "El precio tras aplicar el 40% de descuento ser�a: " menoscuarenta
	FinSi
	
FinAlgoritmo
