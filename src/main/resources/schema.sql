# create table if not exists Taco(
#     id int NOT NULL AUTO_INCREMENT,
#     name varchar(50) not null ,
#     createAt timestamp not null,
#     primary key (id)
# )ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists Ingredient (
    id bigint NOT NULL AUTO_INCREMENT,
    method varchar(200) NOT NULL,
    name VARCHAR(200) NOT NULL,
    type varchar(20) NOT NULL,
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# create table if not exists Taco_Ingredient(
#     taco int,
#     ingredient int
# )ENGINE=InnoDB DEFAULT CHARSET=utf8;
#
# alter table Taco_Ingredient add foreign key (taco) references Taco(id);
# alter table Taco_Ingredient add foreign key (ingredient) references Ingredient(id);
#
# create table if not exists Taco_Order(
#     id int NOT NULL AUTO_INCREMENT,
#     deliveryName varchar(50) not null,
#     deliveryStreet varchar(50) not null,
#     deliveryCity varchar(50) not null,
#     deliveryState varchar(50) not null,
#     deliveryZip varchar(50) not null,
#     ccNumber varchar(16) not null,
#     ccCVV varchar(3) not null,
#     placeAt timestamp not null,
#     oid int,
#     primary key (id)
# )ENGINE=InnoDB DEFAULT CHARSET=utf8;
#
# # create table if not exists Taco_Order_Tacos(
# #     tacoOrder bigint not null ,
# #     taco bigint not null
# # );
#
# # alter table Taco_Order_Tacos add foreign key (tacoOrder) references Taco_Order(id);
# alter table Taco_Order add foreign key (oid) references Taco(id);
#
