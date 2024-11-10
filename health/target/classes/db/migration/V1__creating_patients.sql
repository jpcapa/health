CREATE TABLE IF NOT EXISTS patients(
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    gender VARCHAR(10),
    disease_type VARCHAR(100),
    contact_number VARCHAR(15),
    email VARCHAR(255) NOT NULL UNIQUE
);
