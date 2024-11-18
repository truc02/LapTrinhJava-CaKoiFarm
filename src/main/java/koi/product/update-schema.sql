CREATE TABLE product
(
    id        bigint IDENTITY (1, 1) NOT NULL,
    name      varchar(255),
    category  varchar(255),
    price     float(53),
    address   varchar(255),
    bedrooms  int,
    bathrooms int,
    area      float(53),
    floor     int,
    parking   varchar(255),
    image_url varchar(255),
    CONSTRAINT pk_product PRIMARY KEY (id)
)
GO