




const url = "https://jsonplaceholder.typicode.com/users";

// Creando el fetch para obtener (GET) datos de una API
fetch(url)
    .then(data => data.json())

    .then(data => {
        console.log(data);
        console.log(data[0]);
        console.log(data[4].name);
    })
    .catch( error => console.error("Es una pijamada real", error));

    const user ={
        clave: "value"
    }

const publicacion = {
    userId: 1986,
    id: 123456789,
    title: "Creando API",
    body: "Estoy consumiendo una API y enviando informacion al servidor remoto para visualizaerlo en la consola"
    }
// --- Creando el fetch para enviar (POST) datos a una API
fetch("https://jsonplaceholder.typicode.com/posts", {
    // Indicar el tipo de metodo HTTP
    method: "POST",
    // Definir los headers
    headers: {"Content-type": "application/json; charset=UTF-8"},
    // Definir el cuerpo del Objeto que se va a enviar a la API
    body: JSON.stringify(publicacion)
    })

    .then(response => response.json())
    .then(response => {
        console.log(response);
    })
    .catch(error =>console.error(error))
    // https://fakestoreapi.com/

//--- asynch - await. Consumir APIs mediante funciones asíncronas
const getUser = async () => {
    try {
        // Controlar el tiempo de ejecución de la función a través de un delay
        await new Promise(resolve => {
            setTimeout(resolve, 3000)
        });

        // Intentar que se cumpla la promesa
        const response = await fetch(`https://fakestoreapi.com/products`);
        const data = await response.json();
        console.log(data);
    }
    catch(error) {
        console.error(error);
    }
};

getUser();
