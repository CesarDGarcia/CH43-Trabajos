import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import {createBrowserRouter, RouterProvider} from "react-router-dom"
import SignInSide from './assets/components/Login/SignIn.jsx'
import Astros from "./assets/components/Astros/Astros.jsx"





const router = createBrowserRouter([
// Aqui voy a crear las rutas. Una ruta se compone de dos elementos: "path" y "elements"
  {
    path: "/", element: <App/>,
  },
  {
    path: "Login", element: <SignInSide />
  },
  {
    path: "astros.api", element: <Astros/>
  }
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router= { router }/>
  </React.StrictMode>,
)
