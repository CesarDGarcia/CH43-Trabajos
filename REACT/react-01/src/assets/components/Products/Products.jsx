import "./Products.css"

const Products = ({ image, title, descrption, price }) => {
    return (
        <>
        <div className="card--container">
            <div className="product--card">
                <img src={image} alt=""/>
                <h2>{title}</h2>
                <p>{descrption}</p>
                <h3>{price}</h3>
            </div>
        </div>
        </>
    )
}


export default Products