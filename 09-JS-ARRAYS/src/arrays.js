/*** Creando Arrays  ***/
// --- Opción 1. Para inicializar un Array puedo escribir de manera directa los elementos dentro de los corchetes


let shopping = ['pan', 'leche', 'espinacas', 'huevos', 'carne'];

// --- opcion 2. A partir de un Array vacio iremos agregando elementos por cada indice

let cars = []; //Array vacio
//Agrego elementos llamando al array y el index de cada elemento 

    cars[0] = 'volkswagen';
    cars[1] = 'mazda';
    cars[2] = 'kia';
    cars[3] = 'audi';

// --- Opcion 3. Mandar a llamar el Array como objeto. Al ser un objeto posee su propia clase (Array)

let cantantes = new Array('luis miguel', 'Wendy Sulca', 'Jose Jose', 'Justin Bieber', 'Los llayras', 'Los panchos', 'Molotov');

// Imprimiendo en consola los tres Arrays
console.log(shopping);
console.log(cars);
console.log(cantantes);

// Acceder a un elemento del Array mediante su indice

let accesoElemento = `Sebastian se come ${shopping[0]} mientras conduce su ${cars[3]}`; 

console.log(accesoElemento);

// Metodo de Arrays

// longitud de un Array (.length)

let longitudCantantes = cantantes.length;
console.log(longitudCantantes);

// --- Acceder al ultimo elemento de cualquier Arrat (Array.length-1)
let ultimoElemento = cantantes[cantantes.length-1];

console.log(ultimoElemento);

// Creando un nuevo Array para probar mis metodos

const ch43 = ['miriam', 'alan', 'miguel', 'mitzi', 'juan', 'liz', 'diego', 'mariscal', 'emily', 'arturo', 'sadrak', 'josue', 'saul', 'fernando', 'oscar', 'salvador', 'erick', 'monica', 'cristian', 'felipe', 'pablo', 'cintia', 'brandon'];

console.log(ch43);

// --- pop(); elimina el último elemento del Array
ch43.pop();
console.log(ch43);
// --- push(); agregamos un nuevo elemento al final del Array
ch43.push('brandon');
console.log(ch43);

// --- unshift(); agregar un nuevo elemento al inicio del Array
ch43.unshift('alan');
console.log(ch43);


// --- shift();


// --- sort(); ordena un Array de manera ascendente tomando como referencia la tabla ASCII
ch43.sort();
console.log(ch43);
// --- reverse(); invierte el orden del Array
ch43.reverse();
console.log(ch43);
// --- indexOf(); me devuelve el índice del primer valor (elemento) encontrado en un Array
let indiceElemento = ch43.indexOf('cristian');
console.log(indiceElemento);
let indiceElemento2 = ch43.indexOf('zhaid');
console.log(indiceElemento2); // -1 no existe el elemento dentro del Array
// --- forEach(); me devuelve todos los elementos del array. Itera sobre cada elemento y lo imprime uno por uno.
ch43.forEach((developers) => console.log(developers));
// --- map(); crea un nuevo Array con los resultados de la llamada a la función indicada, aplicado a cada uno de los elementos
const developers = ch43.map((developer) => `Hola ${developer}`);
console.log(developers);

/**** Arrays multidimensionales ****/
const comidas = ['Tamalito de chipilin', 'Cochinita', 'Lechón', 'Tacos envenenados', 'Guajolota', 'Torta ahogada', 'Carne asada', 'Machetes', 'Enchiladas queretanas', 'Tacos de canasta'];
const estados = ['Cdmx', 'Zacatecas', 'Tabasco', 'Jalisco', 'Chihuahua', 'EdoMex', 'Yucatán', 'Queretaro', 'Tlaxcala', 'Quintana Roo'];
const menu = [comidas, estados];
console.log(menu);

let shopping2 = [
    ['pan', 'leche', 'huevo', 'queso', 'espinacas', 'carne'],
    ['verdura', 'frutas', 'lacteos'],
    ['congelados', 'maricos', 'carnes', 'postres']
];

console.log(shopping2);

// Mandando a llamar un elemento del array multidimensional
let comida1 = (menu[0][1]);
console.log(comida1); //Output: cochinita
let estado1 = (menu[1][6]);
console.log(estado1); //Output: Yucatán
// Manipulando Arrays multidimensionales
let producto = `El producto ${shopping2[0][1]} pertenece a la categoría de ${shopping2[1][2]}`;
console.log(producto);