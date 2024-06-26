USE kibobazar;


SELECT * FROM productos;
ALTER TABLE productos AUTO_INCREMENT = 1;
INSERT INTO productos( id_categorias,nombre, talla, imagen, material,  descripcion, medidas, precio) 
VALUES 
(1,"Vestido sin mangas rosa con negro Alice+Olivia", "S", "https://i.pinimg.com/originals/d0/32/53/d032539e7b06eab008e8b7b8a8073577.jpg", "Algodón", "Usado Alice&Olivia Detalles: Ninguno", "Pecho: 38 cm Cintura: 32 cm Largo: 86 cm", 550),
(1,"Vestido sin mangas Dee Elle", "S", "https://i.pinimg.com/originals/4d/7f/d9/4d7fd9397c38722de3578916d2de90a6.jpg", "Algodón", "Usado Ninguno Marca:DEE ELLE Detalles: Ninguno", "Pecho: 33cm Cintura: 31 cm Largo: 82 cm", 350),
(1,"Vestido al hombro con flores marca Princess Polly", "XS", "https://i.pinimg.com/originals/72/15/48/721548d2a9590c76e7c51bd2d1057f6b.jpg", "Poliester", "Seminuevo Princess Polly Detalles: Ninguno", "Pecho: 27 cm Cintura: 26 cm Largo: 71 cm", 360),
(1,"Vestido negro con maya  marca ABS", "XS", "https://i.pinimg.com/originals/75/e0/08/75e008e3c34555e568828cad06412094.jpg", "nylon", "Usado ABS Detalles: Ninguno", "Pecho: 39 cm Cintura: 39 cm Largo: 89 cm", 450),
(1,"Vestido sin mangas rosa con negro Alice+Olivia", "XS", "https://i.pinimg.com/originals/49/83/7d/49837d1615d806dee14301f191a1dc6a.jpg", "nylon", "Usado Alice&Olivia Detalles: Ninguno", "Pecho: 38 cm Cintura: 32 cm Largo: 66 cm", 550),
(1,"Vestido manga larga rosa mexicano Zara", "S", "https://i.pinimg.com/originals/9b/4b/cd/9b4bcd2ee54e9f8554651dea93a5d5b5.jpg", "Algodón", "Nuevo Zara Detalles: Ninguno", "Pecho: 42 cm Cintura: 29 cm Largo: 82 cm", 450),
(1,"Vestido con flores marca Princess Polly", "S", "https://www.pinterest.com.mx/pin/410601691044381998/", "nylon", "Seminuevo Princess Polly Detalles: Ninguno", "Pecho: 36 cm Cintura: 32 cm Largo: 78 cm", 380),
(1,"Vestido sin mangas con encaje marca BB Dakota", "XS", "https://i.pinimg.com/originals/ee/81/cb/ee81cbfe2acbe749a42079037cf6c0f8.jpg", "seda", "Usado bb dakota Detalles: Ninguno", "Pecho: 39 cm Cintura: 36 cm Largo: 94 cm", 220),
(2,"Short blanco marca For All 7 Mankind", "XS", "https://i.pinimg.com/originals/7c/b0/03/7cb00303b49429c987ad9ca9a94b2a62.jpg", "mezclilla", "Seminuevo FOR ALL 7 MANKIND Detalles: Ninguno", "Cintura: 39 cm Cadera: 44 cm Largo: 31 cm", 300),
(2,"Short tricolor marca Wild Fable", "S", "https://i.pinimg.com/originals/d2/34/73/d23473e044277c74e80ee4a05d7580d1.jpg", "mezclilla", "Seminuevo  WILD FABLE Detalles: Ninguno", "Cintura: 41 cm Cadera: 49 cm Largo: 36 cm", 200),
(2,"Short formal beige marca Reformation", "M", "https://i.pinimg.com/originals/28/c2/52/28c252e2d56c759a05c7a25b7f6628b5.jpg", "Algodón", "Usado REFORMATION Detalles: Ninguno", "Cintura: 42 cm Cadera: 50 cm Largo: 36 cm", 300),
(2,"Short casual rosa marca Subdo", "XS", "https://i.pinimg.com/originals/da/f8/0a/daf80a75354748873a4a7147a0bb63b6.jpg", "Algodón", "Seminuevo SUBDO Detalles: Ninguno", "Cintura: 39 cm Cadera: 44 cm Largo: 40 cm", 260),
(2,"Short de mezclilla marca Zara", "M", "https://i.pinimg.com/originals/23/93/4b/23934b32fddc4a8759529548f73c46b1.jpg", "mezclilla", "Seminuevo Zara Detalles: Ninguno", "Cintura: 42 cm Cadera: 50 cm Largo: 36 cm", 250),
(2,"Short azul y blanco marca Madewell", "M", "https://i.pinimg.com/originals/a1/2a/8b/a12a8bfe726928b569cc12d9146f6487.jpg", "Algodón", "Seminuevo Madewell Detalles: Ninguno", "Cintura: 41 cm Cadera: 48 cm Largo: 33 cm", 250),
(3,"Falda animal print leopardo marca Mother Superior", "M", "https://i.pinimg.com/originals/fb/a5/23/fba523c93da402d713f84b6a19c7813a.jpg", "mezclilla", "Seminuevo Mother superior Detalles: Ninguno", "Cintura: 41 cm Cadera: 49 cm Largo: 39 cm", 300),
(3,"Falda blanca con flores marca Zara", "L", "https://i.pinimg.com/originals/52/ff/b2/52ffb241f5a01ab70c7e46d5f9435ffa.jpg", "lino", "Nuevo Zara Detalles: Ninguno", "Cintura: 41 cm Cadera: 49 cm Largo: 38 cm", 350),
(3,"Falda de flores con holanes marca Pablo", "L", "https://i.pinimg.com/originals/cd/54/5e/cd545e48962738937f31b557538b3327.jpg", "Algodón", "Usado Pablo Detalles: Ninguno", "Cintura: 37 cm Cadera: 57 cm Largo: 40 cm", 260),
(3,"Falda verde con estampado de leopardo marca R13", "M", "https://i.pinimg.com/originals/3a/62/df/3a62dfa1ae4cb2155f3632100a31465f.jpg", "mezclilla", "Usado R13 Detalles: Ninguno", "Cintura: 42 cm Cadera: 49 cm Largo: 38 cm", 300),
(3,"Falda leopaedo marca Topshop", "S", "https://i.pinimg.com/originals/68/29/05/6829059c3cdbaef8be8468fb6c44ccec.jpg", "Algodón", "Seminuevo TOPSHOP Detalles: Ninguno", "Cintura: 37 cm Cadera: 49 cm Largo: 45 cm", 300),
(3,"Falda negra tipo cuero marca Topshop", "S", "https://i.pinimg.com/originals/1b/42/a9/1b42a9676594a6c564964d62d1a54efa.jpg", "Poliester", "Usado TOPSHOP Detalles: Ninguno", "Cintura: 37 cm Cadera: 47 cm Largo: 42 cm", 300),
(3,"Falda negra elegante marca Intermix", "M", "https://i.pinimg.com/originals/a2/97/6a/a2976a3b1b0f6e07434872f8aec23df9.jpg", "Poliester", "Seminuevo INTERMIX Detalles: Ninguno", "Cintura: 39 cm Cadera: 42 cm Largo: 40 cm", 350),
(4,"Blusa azul marca Zara", "M", "https://i.pinimg.com/originals/4c/86/e3/4c86e3ee66b110c4037db01132daeb4f.jpg", "Poliester", "Nuevo Zara Detalles: Ninguno", "Pecho: 36 cm Cintura: 32 cm Largo: 46 cm", 150),
(4,"Blusa forma casual leopardo marca Joie", "L", "https://www.pinterest.com.mx/pin/410601691044424783/", "seda", "Seminuevo JOIE Detalles: Ninguno", "Pecho: 56 cm Cintura: 51 cm Largo: 59 cm", 350),
(4,"Blusa leopardo marca Ganni", "XS", "https://i.pinimg.com/originals/1b/49/3f/1b493f4a11336826a7ee1ea019ad9a9a.jpg", "Poliester", "Usado GANNI Detalles: Ninguno", "Pecho: 38 cm Cintura: 33 cm Largo: 56 cm", 250),
(4,"Blusa negra espalda descubierta marca Prettylittlething", "XS", "https://i.pinimg.com/originals/c2/2a/79/c22a792eb8a29030e4606ab9753b60cf.jpg", "Algodón", "Nuevo PRETTYLITTLETHING Detalles: Ninguno", "Pecho: 38 cm Cintura: 33 cm Largo: 42cm", 200),
(4,"Blusa larga negra marca Brandy Melville", "L", "https://i.pinimg.com/originals/01/e9/8e/01e98e396c0e5d91d6c2430a01b0aef1.jpg", "Algodón", "Seminuevo Brandy Melville Detalles: Ninguno", "Pecho: 51 cm Cintura: 52 cm Largo: 75 cm", 200),
(4,"Blusa croptop marca Urban Outfitters", "M", "https://i.pinimg.com/originals/6e/6b/c9/6e6bc9e9ffe4bd8edd293b5ba67a14e8.jpg", "Algodón", "Usado URBAN OUTFITTERS Detalles: Ninguno", "Pecho: 43 cm Cintura: 43 cm Largo: 31 cm", 150),
(4,"Blusa con estampado marino marca Jcrew", "L", "https://i.pinimg.com/originals/67/76/8a/67768a3eddadcdddf3d529f364009ebe.jpg", "Algodón", "Usado jcrew Detalles: Ninguno", "Pecho: 46 cm Cintura: 46 cm Largo: 56 cm", 100),
(4,"Blusa  de estrellas marca Jcrew", "L", "https://i.pinimg.com/736x/08/54/57/0854571745550d1d12f0b237ff53f994.jpg", "Algodón", "Seminuevo jcrew Detalles: Ninguno", "Pecho: 46 cm Cintura: 46 cm Largo: 56 cm", 100),
(1,"Vestido strapless zara", "S","https://i.pinimg.com/originals/26/9b/e8/269be8210b4f3c062b400e3b029fbba2.jpg","poliester", "marca zara estado nuevo detalles ninguno", "Pecho : 38 cm Cintura : 32 cm Largo: 60 cm", "450");


SELECT * FROM categorias;
ALTER TABLE productos AUTO_INCREMENT = 1;
INSERT INTO categorias( nombre, descripcion) 
VALUES 
("Vestido","vestidos de diferentes estilos"),
("Short", "shorts de diferentes estilos"),
("Falda", "faldas de diferentes estilos "),
("Blusa", "blusas de diferentes estilos "),
("Camisa", "camisas de diferentes estilos");

SELECT * FROM privilegios;
ALTER TABLE privilegios AUTO_INCREMENT = 1;
INSERT INTO privilegios(privilegios)
VALUES
("Administrador"),
("Usuario");

SELECT * FROM clientes;
ALTER TABLE clientes AUTO_INCREMENT = 1;
INSERT INTO clientes (id_privilegios,nombre,apellido,correo,telefono,contraseña) VALUES
(2,"María", "Hernández", "maria.garcia@gmail.com", "555-123-4567", "contraseña123"),
(2,"Juan", "López", "juan.martinez@gmail.com", "555-234-5678", "segura123"),
(2,"Ana", "Pérez", "ana.lopez@gmail.com", "555-345-6789", "clave123"),
(2,"Carlos", "González", "carlos.hernandez@gmail.com", "555-456-7890", "password123"),
(2,"Laura", "Martínez", "laura.perez@gmail.com", "555-567-8901", "secreta123"),
(2,"Javier", "Sánchez", "javier.rodriguez@gmail.com", "555-678-9012", "clave-secreta"),
(2,"Sofía", "Gómez", "sofia.sanchez@gmail.com", "555-789-0123", "123456"),
(2,"José", "Martínez", "jose.gonzalez@gmail.com", "555-890-1234", "987654"),
(2,"Ana", "González", "ana.martinez@gmail.com", "555-901-2345", "qwerty123"),
(2,"Daniel", "López", "daniel.rodriguez@gmail.com", "555-012-3456", "contraseña456");

SELECT * FROM pedidos;
ALTER TABLE pedidos AUTO_INCREMENT = 1;
INSERT INTO pedidos (id_clientes, id_productos, monto, direccion_envio, direccion_pedido, correo, fecha_pedido, estado_pedido) VALUES
(1, 1, 450.00, "Calle Principal 123, Ciudad", "Calle Principal 123, Ciudad", "maria.garcia@gmail.com", '2024-04-04', "Pendiente"),
(2, 10, 550.00, "Avenida Central 456, Ciudad", "Avenida Central 456, Ciudad", "juan.martinez@gmail.com", '2024-04-06', "Pendiente"),
(3, 6, 360.00, "Calle Secundaria 789, Ciudad", "Calle Secundaria 789, Ciudad", "ana.lopez@gmail.com", '2024-04-08', "Pendiente"),
(4, 15, 450.00, "Avenida Principal 101, Ciudad", "Avenida Principal 101, Ciudad", "carlos.hernandez@gmail.com", '2024-04-10', "Pendiente"),
(5, 20, 550.00, "Calle Secundaria 202, Ciudad", "Calle Secundaria 202, Ciudad", "laura.perez@gmail.com", '2024-04-12', "Pendiente");
