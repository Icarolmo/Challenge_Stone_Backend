CREATE TABLE star_purchases (
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    client_id VARCHAR(40) NOT NULL,
    purchase_id VARCHAR(40) NOT NULL,
    value INTEGER NOT NULL,
    date_buy VARCHAR(11) NOT NULL,
    card_number VARCHAR(20) NOT NULL
);