console.log("------------------ Control de flujo-------------------");

// declaración if else "El hoisting"

let edad = 18;

if(edad >=18 ){
    console.log("Bienvenido");
} else{
    console.log("Video de Youtube");
}

if(edad >=10){
    console.log("Puedes usar internet");
}


edad = null;
if (edad != null){
    console.log("El usuario si está ingresando su edad");
} else {
    console.log("Ingresa tu edad");
}

// Ejemplo con modificación de una variable. 
//--- Crear un programa que determine si nos encontramos en pérdidas o en ganancias
let saldoInicial = 500;
let saldoFinal = 500;
let balance;
if (saldoInicial < saldoFinal) {
    balance = "Estamos en ganancias";
} else {
    balance = "Estamos en pérdidas";
}
// ECMAScript 6 (ES6). Interpolación de cadenas, nos permite unir una cadena de caracteres con variables, utilizando backticks `` y ${variables}
// console.log("En este momento " + balance);
console.log(`En este momento ${balance}`);
if (saldoInicial < saldoFinal) {
    balance = `Ganando como siempre`;
} else if (saldoInicial === saldoFinal) {
    balance = `Estamos tablas`;
} else {
    balance = `Perdiendo como nunca`;
}
console.log(`${balance}`);

//--- Determinar si un número es par o impar
let numero = 17;

if(numero % 2 === 0){
    console.log(`El número ${numero} es par`);
} else {
    console.log(`El número ${numero} es impar`);
}




// --- Operador ternario. Es una forma concisa de escribir una sentencia condicional (if-else). Se utilizan caracteres para evaluar la condición y ejecutar los bloques de código necesarios.
// (condition) ? true : false;
// Determinar si un número es par o impar, pero usando un operador ternario

let num =45286934;

let  parImpar = (num % 2 === 0) ? `El número ${num} es par` : `El número ${num} es impar`;

console.log(parImpar);
// --- Determinar si una persona es un bebé (< 3 años), niño (4 y 11), adolescente (12 a 17), adulto (> 18), pero si es un adulto, determinar si es un adulto joven (18 a 59) o adulto mayor (> 60)
let edadPersona = 127;

if (edadPersona >= 18){
    //console.log("es un adulto");}
    if (edadPersona < 60){
        console.log("Es un adulto joven");
    } else{
        console.log("Es un adulto mayor");
    }
} else if (edadPersona >=12) {
    console.log("Es un adolescente");
} else if(edadPersona >= 4) {
    console.log("Es un niño");
} else {
    console.log("Es un bebé");
}

// ****** Sentencia Switch ***** //


//Determinar si el dia de la semana es laborable (lunes a viernes) o es de descanso (sabado y domingo)

let diaSemana = "sabado";
switch (diaSemana) {
    case "lunes":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "martes":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "miercoles":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "jueves":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "viernes":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "sabado":
        console.log(`El ${diaSemana} es no laborable`);
        break;
    case "domingo":
        console.log(`El ${diaSemana} es laborable`);
        break;
        default:
            console.log("No es un dia de la semana");
}

