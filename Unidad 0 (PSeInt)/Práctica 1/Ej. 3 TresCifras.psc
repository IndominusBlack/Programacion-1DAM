Algoritmo TresCifras
	Definir number Como Real
	Escribir "Introduce un n�mero:"
	Leer number
	Si (number>=100) y (number<1000) o (number<=-100) y (number>-1000)Entonces
		Escribir "tu n�mero tiene tres cifras"
	FinSi
	Si (number<100) o (number>=1000) o (number>-100) o (number<=-1000)Entonces
		Escribir "tu n�mero no tiene tres cifras"
	Fin Si
	
FinAlgoritmo
