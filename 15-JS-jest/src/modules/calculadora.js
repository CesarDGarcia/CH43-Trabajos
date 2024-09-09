// Aqui vamos a crear el codigo que se evaluara, es decir, una calculadora para sumar, restar, multiplicar y dividir dos numeros enteros

const calculadora = {
    suma(a,b) {
        return a +b;
    },
    resta(a,b) {
        return a - b;
    },
    multiplicacion(a,b) {
        return a * b;
    },
    division(a,b) {
        return a / b;
    }
}

// ESModules: export default funcion
// CommonJs: module.exports = function;
module.exports = calculadora;