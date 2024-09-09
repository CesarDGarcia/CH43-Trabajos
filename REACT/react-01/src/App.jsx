
import './App.css'
import NavBar from './assets/components/NavBar/NavBar'
import Button from './assets/components/Button/Button'
import Products from './assets/components/Products/Products'
import Footer from './assets/components/Footer/Footer';
import BasicCard from './assets/components/Card/BasicCard';
import SignInSide from './assets/components/Login/SignIn';




function App() {
  const tenisMorados="https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/82/6142201/1.jpg?2933";
  const tenisDark="https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/01/241417/1.jpg?6747";
  const tenisBrown="https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/06/4410121/1.jpg?4437";

  return (
    <>
      <NavBar/>
      <h1>React</h1>

      <Button
      text="boton"/>

      <Products
      image= {tenisMorados}
      title="Tenis morados"
      description="Fabricados en Mexico con materiales reciclados"
      price="$ 2599.00"
      />
      <Products
      image={tenisDark}
      title="Tenis Speed Dark"
      description="Velocidad al maximo con los tenis runners"
      price="$ 1598.00"
      />
      <Products
      image={tenisBrown}
      title="Tenis Camel"
      description="Vive a la vanguardia con estos tenis elegantes tenis que puedes usar en cualquier lugar"
      price="$ 574.00"
      />

      <hr/>
      <h2 style={ {color: "#fff176"}}>Material UI - Componentes</h2>
      {/*Ejemplo de MUI */}
      <div style={{display: "flex", justifyContent: "center"}}>
      <BasicCard/>
      </div>
      {/* Footer */ }
      <Footer/>
    </>
  )
}

export default App
