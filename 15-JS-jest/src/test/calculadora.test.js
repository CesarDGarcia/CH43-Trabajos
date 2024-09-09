// Crear pruebas unitarias para cada método del objeto calculadora (sumar, restar, multiplicar, dividir), para evaluar división entre 0 y para obtener un valor cercano al esperado
// Importar la función u objeto que voy a testear.
const calculator = require('../modules/calculadora')
// Estructura de una prueba unitaria en Jest: test('string', callback => {expect(function).toBe(resultado)})
test('Suma de dos números', () => {
    expect(calculator.suma(10,20)).toBe(31)
});
test ('resta de dos números', () => {
    expect(calculator.resta(10,1)).toBe(9);
})
test ('multiplicación de dos números', () => {
    expect(calculator.multiplicacion(10,10)).toBe(100);
})
test ('división de dos números', () => {
    expect(calculator.division(10,2)).toBe(5);
})
test ('división de dos números', () => {
    expect(calculator.division(10,0)).not.toBeUndefined();
})
test ('división de dos números', () => {
    expect(calculator.division(55,77)).toBeCloseTo(0.71);
})
// resta, multiplicación, división, división entre 0 y la de número aproximado