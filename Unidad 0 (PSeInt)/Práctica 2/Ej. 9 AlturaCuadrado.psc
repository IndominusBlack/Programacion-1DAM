Algoritmo AlturaCuadrado
    Definir number, i, j Como Entero
    Escribir "Introduce la altura que quieres que tenga el cuadrado"
    Leer number
    Para i<-1 Hasta number Con Paso 1 Hacer
        Si i=1 O i=number Entonces
            Para j<-1 Hasta number Con Paso 1 Hacer
                Escribir Sin Saltar "*"
            FinPara
        Sino
            Para j<-1 Hasta number Con Paso 1 Hacer
                Si j=1 O j=number Entonces
                    Escribir Sin Saltar "*"
                Sino
                    Escribir Sin Saltar " "
                FinSi
            FinPara
        FinSi
        Escribir ""
    FinPara
FinAlgoritmo
