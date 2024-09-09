/* algoritmo
variables:
let monto de compra
let descuento= 10% 
let resultado

datos:
- descuento
- monto de compra

1. ¿Cuál fue tu monto de compra?
6. if monto de compra <200 --> "no se aplica descuento"
4. if monto de compra >= 1000 --> "tu compra es gratis"
5. if monto de compra >=800 --> resultado= monto de compra * 0.6
6. if monto de compra >=600 --> resultado= monto de compra * 0.7
7. if monto de compra >=400 --> resultado= monto de compra * 0.8
8. if monto de compra >=200 --> resultado= monto de compra * 0.9
alert("El total de tu compra es: " +resultado")
*/

let montodecompra = (prompt ( "¿Cuál fue tu monto de compra?"));
let resultado = parseInt(parseInt(montodecompra) - (montodecompra * .2));
alert(resultado);
