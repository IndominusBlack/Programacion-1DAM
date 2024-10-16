Algoritmo AumentoSueldo
	Definir number Como Real
	Escribir "Introduce el sueldo del empleado"
	Leer number
	masdoce<-number+((number/100)*12)
	masquince<-number+((number/100)*15)
	si (number>=500.000) Entonces
		Escribir "El sueldo tras el incremento es " masquince "euros"
	FinSi
	si (number<500.000) Entonces
		Escribir "El sueldo tras el incremento es " masdoce "euros"
	FinSi
FinAlgoritmo
