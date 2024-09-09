/*operadores aritmeticos
suma +
resta -
multiplicacion *
division /
-- decremento
++ incremento

operadores de comparación
= asigna/ es un operador de asignación
== operador de igualdad/ con este operador vamos a verificar si un valor es igual a otro 
=== operador de estricta igualdad se refiere a que no solo sea el mismo valor sino un tipo de mismo dato

let edad = 32;
let primaveras = "32";

console.log(edad === primaveras)

< Menor que
> Mayor que

<= menor o igual que
>= mayor o igual que

!= distinto



Operadores logicos

&& and
|| or
! not

ejemplo1 = num1 < num4;
ejemplo2 = num3 == num5
console.log(ejemplo1 && ejemplo2);

let num1 = 12;
let num2 = 24;
let num3 = 36;
let num4 = 65;
let num5 = 54;
let num6 = 21;
let num7 = 14;
let num8 = 8;

operacion = (num1 < num2 || num4 < num3) && (num1 == num4 && num5 != num3);
console.log(operacion);

operacion2 = (num8 == num1 && num6 >= num2 ) || (num3 < num7 || num4 != num5 );
console.log(operacion2);
*/

/* Ejercicio para poder validar el descuento en nuestro carrito de compra

si el tortal de mi carrito es mayor o igual a $1000, obtendras un descuento del 10%
Si el total de mi carrito es mayor o igual a $500, obtendras un 5% de descuento
Si el total de mi carrito es mayor o igual a $200, obtendras un 2% de descuento
*/

/*let totalCarrito = 850;
let descuento = 0;
let precioFinal = 0;

if(totalCarrito >= 1000) {
    descuento = 0.1;
} else if(totalCarrito >= 500){
    descuento = 0.05;
} else if(totalCarrito >= 200) {
    descuento = 0.02;
} else{
    descuento = 0;
}

precioFinal = totalCarrito - (descuento * totalCarrito);
alert(precioFinal);
console.log(precioFinal);*/

let descuento = 0;
let precioFinal = 0;
let envio = 189;

let totalCarrito = prompt("¿Cuanto compraste?");

if(precioFinal >= 599){
    descuento = 0.06;
} else if(precioFinal <= 999){
    descuento = 0.08;
} else if(precioFinal >= 1599){
    descuento = 0;
}

precioFinal= (parseInt(totalCarrito) + envio) - (totalCarrito * descuento);
alert(precioFinal);