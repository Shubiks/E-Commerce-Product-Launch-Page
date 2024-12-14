fetch('http://localhost:8080/api/products')
    .then(response => response.json())
    .then(data => {
        const productList = document.getElementById('product-list');
        data.forEach(product => {
            const productDiv = document.createElement('div');
            productDiv.classList.add('product-card');
            productDiv.innerHTML = `
                <img src="${product.imageUrl}" alt="${product.productName}">
                <div class="product-details">
                    <h2>${product.productName}</h2>
                    <div class="rating">⭐ ${product.ratingAverage} | ${product.numberOfReviews} reviews</div>
                    <div class="price">₹${product.finalPrice} 
                        <span class="mrp">₹${product.price}</span> 
                        <span class="discount">(${product.discount}% off)</span>
                    </div>
                    <div class="description">${product.description}</div>
                    <div class="availability">Stock Available: ${product.stockQuantity}</div>
                    <div class="sold-rate">${product.soldRate} bought in past week</div>
                    <div class="prime">Prime FREE Delivery</div>
                    <div class="delivery">Delivery by ${product.deliveryDate}</div>
                    <div class="add-to-cart">
                        <button>Add to cart</button>
                    </div>
                </div>
            `;
            productList.appendChild(productDiv);
        });
    });
