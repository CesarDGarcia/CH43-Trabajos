/*variables
Var: Podemos declarar una variable con la palabra var sin inicializarla, ya no es tan utilizada por que tiene un alcance global

Let: Podemos declararla sin inicializarla, sin embargo tiene un alcance local y es una buena practica utilizarla y es de las mas usadas 

Const: se debe inicializar en el momento de la declaracion es una variable de tipo constante por ejemplo Pi=3.1416

Scoope: se refiere a la accesibilidad de las variables y funciones dentro de distintas partes de mi codigo. El scoope determina el tema de la accesibilidad, es decir donde y como vamos a manipular las variables de mi programa (Cuenta de netlfix kids)

Declarar una variable se refiere a decirle a mi programa que la variable existe o esta ahi utilizando var, let y const y de esta manera reservar este espacio de memoria

Inicialización se refiere a agregarle un valor inicial como su nombre lo dice 

let nombre = "Fer" ;

Tipos de datos primitivos 

Se les llama de esta manera por que son los tipos de datos mas baicos dentro de Javascript, es decir los que ya venian con el lenguaje

String: cadena de texto, secuencia de caracteres

let apellidos "Ramirez";
let edad "32";

number: se refiere a valores numericos

let edad = 32

Boolean: se refiere a un verdadero True o falso False

let INE = true

null: se refiere a la ausencia o falta de algun valor 

let comensales = null;

undefinied: se refiere a una variable que se declaro pero no se inicializo

let comensal;





const nombre = " Fer ";

nombre = "luisa";
console.log(nombre);

Encacillamiento es el proceso de conversion automatica o implicita de 
*/


let edad = 32;
let bendis = 2;
let primaveras = "32";
let operacion = edad + primaveras;
//coercion implicita
console.log(operacion);

//coercion explicita
let operacion2 = edad + Number(primaveras);
console.log(operacion2);


//multiples variables


/* let nombre1, nombre2, nombre3;

nombre1 = "Dani";
nombre2 = "Felipe";
nombre3 = "Josue";*/

let nombre1 = "Dani";
let nombre2 = "Felipe";
let nombre3 = "Josue";

console.log(nombre1);
console.log(nombre2);
console.log(nombre3);

//typeof es un metodo que nos sirve para saber que tipo de dato es el que tenemos

console.log(typeof(nombre1));

let comensal;
console.log(comensal);

//conversion de datos de numeros a cadenas de texto

console.log(String(edad));
console.log(typeof String(edad));
console.log(typeof bendis.toString());

//Conversion de cadena de texto a numero

let cambioNumber = console.log(typeof Number(primaveras));
metodoParseInt = console.log(typeof parseInt(primaveras));
metodoParseFloat = console.log(typeof parseFloat(primaveras));


let ine = false;
let cambioBoolean = console.log(Number (ine));
console.log(typeof parseInt(ine));
/*console.log(typeof (ine));
let cambionumber = console.log(typeof Number(ine));
metodoParseInt = console.log(typeof parseInt(ine));
metodoParseFloat = console.log(typeof parseFloat(ine));*/

//Concatenar se refiere a unir strings

/*let nombre4 = prompt("Holi");
alert("Hola" + nombre4);*/

//Ejemplo
let producto = prompt("Ingrese el costo del producto");
let cantidad = prompt("Ingrese el número de producto solicitado");
//let resultado = producto + cantidad;
//alert (resultado);

//let operacion3 = Number(producto) * Number(cantidad);
let resultado = parseFloat(producto) * parseFloat(cantidad);
alert(resultado);

