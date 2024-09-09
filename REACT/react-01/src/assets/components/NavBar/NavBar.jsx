
// Crear componente como funcion de JavaScript, Debe retornar lenguaje
import "./NavBar.css"
import logoNasa from "../../../assets/Image20240710123550.png"
import Button from "../Button/Button"
import { Link } from "react-router-dom"

const NavBar = () =>{
    return (
        <>
            <nav className="navbar--container">
        <div className="navbar--logo">
            <Link to="/">
                <img src= {logoNasa} alt="logo nasa"/>
            </Link>
        </div>
        <div className="navbar--menu">
                <a href="http://open-notify.org/Open-Notify-API/People-In-Space/" target="_blank">Astros</a>
                <a href="https://www.nasa.gov/" target="_blank">Nasa</a>
                <a href="https://www.estacionespacial.com/" target="_blank">ISS</a>
        </div>
        <div className="navbar--search">
                <input type="text" name="search" placeholder="Escribe lo que estas buscando"/>
                {/*<button>Buscar</button>*/}
                <Button text="Buscar"/>
        </div>
    </nav>
        </>
    )
}


export default NavBar