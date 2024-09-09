# Crear un nuevo paquete de npm

## Pasos para crear el proyecto
1. Inicializar CLI en el directorio del proyecto y ejecutar el comand
``` shell
npm init
```
2. Seguir las instrucciones de CLI: package name (nombre único), version, description, entry point (index.js), test command, git repository, keywords, authors, license.

3. Podemos observar que se crea el archivo `package.json` con la informacion que proporcionamos
4. Como definimos un entry point con el nombre `index.js`, hay que crear dicho archivo en main ya que aquí ejecutaremos nuestro package.
5. Crear una carpeta llamada `modules` en donde vivirá nuestro módulo (lógica de nuestro package)
6. Dentro de la carpeta modules, crear el archivo `parImpar.js`para programar la logica del package. Aqui programamos la funcion que nos permite determinar si un numero es par o impar

7.Exportamos la funcion creada utilizando el comando 
```Javascript
export default determinarParImpar;
```
8. Importar mi funcion wn `ìndex.js`para poder utilizarla.
```javascript
import function from route
```
9. Modificar `package.json` para permitir la ejecución de módulos de EcmaScript (ES modules) agregando `"type": "module"` debajo de la clave-valor de `"main": "index.js"`

10. Ejecutar el archivo `index.js`con el comando
```bash
node index.js
```

## Pasos para publicar un package en npm
1. Registrarse en el sitio web de npm
[npm](https://www.npmjs.com/)
2. Ejecutar el comando de inicio de sesión de npm
```bash
npm login
```
3. publicar nuestro package en npm CLI con visibilidad publica
```bash
npm publish --access=public
```