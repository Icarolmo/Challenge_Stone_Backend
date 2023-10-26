CREATE TABLE star_products (
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    title VARCHAR(75) NOT NULL,
    price INTEGER NOT NULL,
    zipcode VARCHAR(9) NOT NULL,
    seller VARCHAR(75) NOT NULL,
    thumbnail_hd VARCHAR(200) NOT NULL,
    date_prod DATE NOT NULL
);