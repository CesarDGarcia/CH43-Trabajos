/*Definición  de funciones 

Una funcion es un bloque de codigo que se ejecutara cada que yo la mande a llamar va a contener ciertas instrucciones con base en lo que yo necesite

*/


/*function recomendacion(){
let clima = prompt("¿Que tal el clima el dia de hoy?");
if (clima == "soleado") {
    alert ("Usa bloqueador");
} else {
    alert("ponte sueter");
}
}*/



function saludar () {
    console.log("Hola tonotos pero en función");
    
}

saludar();
saludar();
saludar();



/*function carritoMensaje(nombre, cantidadProductos){
    let carritoMensaje = `Hola, ${nombre} tienes ${cantidadProductos} en tu carrito ¿Procedemos al pago? `

    alert(carritoMensaje);
}
*/
// Funciones anonimas


/*let carritoCompra = function(){
    let nombre = prompt ("Ingresa el nombre");
    let productos = prompt("Ingresa la cantidad de productos");


    let mensaje = `Hola ${nombre}, tienes ${productos} productos en tu carrito`;

    alert(`${mensaje}, ¿Quieres proceder al pago?`);

}

carritoCompra();
*/

/*Return
La palabra reservada return indica que estamos devolviendo un tipo de dato al ejecutar nuestra fincion
*/


function sumar(a, b){
    console.log("El resultado de la suma es: ");
    return a + b;


}

let suma = sumar(15, 48);
console.log(suma);

let suma1= sumar(74, 52);
console.log(suma1);

function bienvenidx(nombre){
    return "Hola, " + nombre + " Ya eres cliente premium";
}

let aviso = bienvenidx("saul");
console.log(aviso);



/*Funciones flecha
Su sintaxis es mas concisa al no tener que utilizar la palabra reservada function, return y si tengo solo un parametro los parentesis ya no son necesarios igual que las llaves 
*/

const saludo = nombre => console.log ("Hola " + nombre);

saludo("Felipe");


const multiplicar =  (c, d) => c * d;
console.log(multiplicar(12,36));


/*Hoisting
Es un comportamiento dentro de js que hace que en la declaracion de variables y funciones se eleven al inicio del contexto en el que estan definidas
*/

function esPar(a){
    let comparar = a % 2 === 0;
    return console.log(`tu numero ${a} es par  ${comparar}`);
}

esPar (50);

const esImpar = r => r % 2 !== 0;

console.log(esImpar(10));


function edades(){
    const today = new Date();
    const cumpleaños = new Date(`august 11 1996`);
    let edad = today.getFullYear() - cumpleaños.getFullYear();
    let m = today.getMonth() - cumpleaños.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < cumpleaños.getDate())) {
        edad--;
    }
    
    return console.log (edad);
}    
edades();