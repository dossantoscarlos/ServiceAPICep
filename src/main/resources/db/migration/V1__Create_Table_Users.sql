create table users (
    id serial primary key not null,
    username varchar(100) not null,
    password varchar(100) not null
);
