// Reto 1
const personasBanco = ["Sofia", "David", "Juan"];
console.log(personasBanco);

personasBanco.push("Sara", "Agustin");
console.log(personasBanco);

personasBanco.unshift("Renata");
personasBanco.push("Elena");
console.log(personasBanco);

//Reto 2
let xValue=100;

for (xValue; xValue > 0; xValue--  ){
    console.log(xValue - 0.5);
}

// Reto 3
let n = 100;
let i = 0
while ( i <= n - 1){
    i++;
    console.log(`[${i}]`);
}

// Reto 4 Debe regresar 10 numeros impares

let k;
cuenta = 0;

for (k=0; k <= 20; k++){
    if(k === 13){
        break;
    }
    if(k % 2 === 0) {
        continue;
    }
    cuenta++
}
console.log(`Hay ${cuenta} números impares`)

/* Reto 5
let c = 100;
let primo = 1;

for(primo; primo < c; primo++){
    if (primo % === )
}
*/ 

// Reto 6
let j = 5;
let l = 0;
let suma = null;
while (l <= j ){
    suma += 1;
    l++;
    console.log(suma);
}

