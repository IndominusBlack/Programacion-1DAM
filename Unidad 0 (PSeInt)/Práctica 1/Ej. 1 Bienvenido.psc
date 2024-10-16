Algoritmo Bienvenido
	Definir nombre, apellidos, sexo Como Caracter
	Escribir "Escribe tu nombre";
	Leer nombre;
	Escribir "Escribe tus apellidos";
	Leer apellidos;
	Escribir "Escribe tu sexo";
	Leer sexo;
	Si (sexo="hombre" o sexo="varón" o sexo="masculino") Entonces
		escribir "Bienvenido, Sr. " sin saltar
	Fin Si
	Si (sexo="mujer" o sexo="hembra" o sexo="femenino") Entonces
		escribir "Bienvenida, Sra. " Sin saltar
	FinSi
	Escribir  nombre " " apellidos
FinAlgoritmo
