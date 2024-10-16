Algoritmo TresCifras
	Definir number Como Real
	Escribir "Introduce un número:"
	Leer number
	Si (number>=100) y (number<1000) o (number<=-100) y (number>-1000)Entonces
		Escribir "tu número tiene tres cifras"
	FinSi
	Si (number<100) o (number>=1000) o (number>-100) o (number<=-1000)Entonces
		Escribir "tu número no tiene tres cifras"
	Fin Si
	
FinAlgoritmo
