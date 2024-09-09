// Ciclo for Permite iterar sobre un bloque de codigo, evaluando condiciones e incrementando un contador


/*for (let index = 0; index < array.length; index++) {
    const element = array[index];
    
}*/

// Ciclo for variable global

let numeroDecremento = 5;

/*for (numeroDecremento; numeroDecremento >=1; numeroDecremento-- ){
    console.log(numeroDecremento);
}*/

// Sumar todos los números del 1 al 100 = 5050

let suma = null;

for (let i = 1; i <= 100; i++) {
    suma +=i; //suma = suma + i = 0 + 1 =1+2...
 //   console.log(suma);
}
console.log(suma);


const ch43 = ['miriam', 'alan', 'miguel', 'mitzi', 'juan', 'liz', 'diego', 'mariscal', 'emily', 'arturo', 'sadrak', 'josue', 'saul', 'fernando', 'oscar', 'salvador', 'erick', 'monica', 'cristian', 'felipe', 'pablo', 'cintia', 'brandon'];

for (let i = 0; i < ch43.length; i++){
    console.log(ch43[i]);
}

// Ciclos para Array: "for in" (devuelve los indices) y "for of" (devuelve los elementos del Array)

for (let developer of ch43){
    console.log(developer);
}

for (let developer in ch43){
    console.log(developer);
}

// Encontrar los numeros pares del 247 al 361

for (let i=247; i <= 361; i++) {
    if (i % 2 === 0) {
        console.log(`${i} es numero par`);
    }
}


// -- Ciclo While. Permite recorrer un bloque de codigo mientras se cumpla una condicion

let i = 0;

while (i < 5) {
    i++;
    console.log(i);
}

/*Realizar una cuenta del 1 al 5
let i = 1;
while (i <= 5) {
    console.log(i);
    i++;
*/

// Tomando nuestro Array de ch43, mostrar elementos utilizando un ciclo

let developer = 0;
while (developer < ch43.length) {
    console.log(ch43[developer]);
    developer++;
}


// Imprimir una secuencia de asteriscos, desde 1 a 5 asteriscos

let limite = 5;
let inicio = 0;
let asterisco = '';

while (inicio < limite) {
    asterisco += "*";
    console.log(asterisco);
    inicio++;
}

/* while (condition) {

}*/

// --- Ciclo Do-While. Recorre un bloque de codogo mientras se cumpla una condicion espesifica, pero antes de evaluar dicha condicion ejecutar al menos una vez la instruccion
let j = 1;
do {
    console.log(j);
    j++
} while (j < 5);

let k = 1
do {
    console.log(k);
    k++;
} while (k < 1);


// -- Contro de ciclos. Existen dos sentencias que nos permiten controlar los ciclos: break y continue. Break detiene un ciclo en un punto específico y continue permite que el ciclo continúe pero ejecutando una acción específica en un punto dado.

let cuenta = 0;

while (cuenta < 100){
    cuenta++;
    console.log(cuenta);
    //sentencia break
    if(cuenta === 22) {
        break;
    }
}

for (let contador = 1; contador <= 10; contador++){
    //sentencia continue
    if (contador === 5){
        console.log('Cliente ganador');
        continue;
    }
    console.log(`Cliente número ${contador}`);
}