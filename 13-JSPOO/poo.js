/* POO
Clase: se refiere a nuestro molde o plantilla para que podamos crear objetos
Constructor: Es una caracteristica especifica de las clases que nos ayuda a construir al objeto
Objeto: Es lo que construimos a traves de la clase y el constructor pero con atributos espesificos


Abstraccion: se refiere a reducir al objeto lo mas posible
Herencia:  Cuenta con la palabra reservada extends y con ella podemos heredar atributos de una clasea otra
Encapsulamiento: Consiste en como voy a manejar los datos y hasta donde van a tener acceso misusuarios 
Polimosrfismo: Consiste en ver como se comporta un objeto de forma distinta ante un msimo método de acuerdo a sus propiedades

Principios Solid
Principios de Responsabilidad Unica (SRP): se refiere a que cada que asignamos una clase , objeto, etc debe ser unica
Principio de Abierto/Cerrado (OCP) : se refiere a que debemos poder extender el código ya existente de ser necesario
Principio de sustitución de Liskov (LSP) : se refiere a que podemos tener cualquier tipo de dato dentro de mi objeto y al peretenecer a la misma clase no debe afectar el comportamiento de mi objeto 
Principios de Segregación de interfaces (ISP) : se refiere a que es mejor tener distintas interfaces especificas a una sola muy grande 
Principio de inversión de dependencias (DIP) : se refiere a que en lugar de que el código dependa de detalles especificos lo haga a tra ves de abstracciones 

*/



class ch43 {//Toda la cohorte 43 (Todxs sus integrantes)
    constructor(nombre, apellido, email, edad){//caracteristicas de la clase ch43
        this.name = nombre;
        this.lastName = apellido;
        this.email = email;
        this.age = edad;
        this.info = ` Holi soy ${this.name} ${this.lastName}, mi correo es ${this.email} y mi edad es ${this.age}`

    }

    infoIntegrantes(){
        console.log(this.info);
    }

}

class participante extends ch43 {
    constructor(nombre, apellido, email, edad, telefono){
        super (nombre, apellido, email, edad);
        this.number = telefono;
    }

    //Metodos estaticos, no necesita que la clase se defina para poder ser creado 
    static canvas() {
        console.log("Ya estas registrdx");
    }
}

class instruccion extends ch43{
    constructor(nombre, apellido, edad, email, licenciatura){
        super(nombre, apellido, email, edad)
        this.deGree = licenciatura;
    }

    static darSesiones (){
        console.log("Hoy no tienes sesión");
    }

    //Metodos getters y setters 
    //set : podemos modificar un valor 
    //get : obtener un valor o crear

    set setDeGree(newDeGree) {
        this.deGree = newDeGree;
    }

    get getDeGree(){
        return this.deGree;
    }

    
}

class mentoria extends ch43 {
    constructor(nombre, apellido, edad, email, mentores){
    super(nombre, apellido, edad, email)
    this.mentores = mentores;

    }

    set setMentoria(newMentor){
        this.deMentor = newMentor;
    }

    get getMentoria(){
        return this.deMentor;
    }
}




const inte1 = new participante("Aparicio", "Huerta", "aparicio@gmail.com", 29, "5574986321");
const inte2 = new ch43("Yareri", "Arcos", "yare@gmail.com", 29);
const inte3 = new instruccion("Daniel", "Maldonado", "dani@gmail.com", 35, "Licenciatura");
const inte4 = new ch43("Tadeo", "Zepeda", "tadeo@gmail.com", 26);
const inte5 = new participante("Adrian", "Becerra", "adrian@gmail.com", 24, "5521457896");
const inte6 = new participante("Alan", "Pacheco", "alan@gmail.com", 29, "5574102030");
const inte7 = new participante("Lizbeth", "Zarazua", "liz@gmail.com", 25, "55214587");

//console.log(inte7.info);

inte5.infoIntegrantes();
inte1.infoIntegrantes();
inte3.infoIntegrantes();


participante.canvas();
instruccion.darSesiones();

inte3.setDeGree = "Maestria";
console.log(inte3.deGree);




fetch(`ejemplo.json`)
    .then(response => response.json())
    .then(data => {
        data.forEach(participanteData =>{
            const { nombre, apellido, email, edad, telefono} = participanteData;
            const nuevoParticipante = new participante(nombre, apellido, email, edad, telefono);
            nuevoParticipante.infoIntegrantes();
        })
    })
    .catch(error => {
        alert (`Hubo un error al cargar los datos`)
        console.error(`Èrror el cargar`, error)
    });