INSERT INTO privilegios (privilegios) VALUES ("CLIENTE");
INSERT INTO privilegios (privilegios) VALUES ("ADMIN");

INSERT INTO categorias (nombre, descripcion) VALUES ("Vestido","vestidos de diferentes estilos");
INSERT INTO categorias (nombre, descripcion) VALUES ("Short", "shorts de diferentes estilos");
INSERT INTO categorias (nombre, descripcion) VALUES ("Falda", "faldas de diferentes estilos ");
INSERT INTO categorias (nombre, descripcion) VALUES ("Blusa", "blusas de diferentes estilos ");
INSERT INTO categorias (nombre, descripcion) VALUES ("Camisa", "camisas de diferentes estilos");

INSERT INTO clientes (active, privilegio_id_privilegios, telefono, apellido, contraseña, correo, nombre) VALUES (1, 2,  "5646813295", "Salazar", "mango6", "miguel@salazar.com", "Miguel");
INSERT INTO clientes (active, privilegio_id_privilegios, telefono, apellido, contraseña, correo, nombre) VALUES (0, 1,  "8161684558", "Gonzalez", "mango2", "luis@gonzlez.com", "Luis");
INSERT INTO clientes (active, privilegio_id_privilegios, telefono, apellido, contraseña, correo, nombre) VALUES (1, 2,  "5154572854", "Perez", "mango5", "ximena@perez.com", "Ximena");
INSERT INTO clientes (active, privilegio_id_privilegios, telefono, apellido, contraseña, correo, nombre) VALUES (0, 1,  "2584117754", "Rodriguez", "mango8", "michel@rodriguez.com", "Michel");
INSERT INTO clientes (active, privilegio_id_privilegios, telefono, apellido, contraseña, correo, nombre) VALUES (1, 2,  "5416546466", "Mangel", "mango4", "joel@mangel.com", "Joel");

INSERT INTO productos (precio, categoria_id_categorias, talla, material, medidas, descripcion, imagen, nombre) VALUES (550.00, 1, "S", "Algodón", "Pecho: 38 cm Cintura: 32 cm Largo: 86 cm", "Usado Alice&Olivia Detalles: Ninguno", "https://i.pinimg.com/originals/d0/32/53/d032539e7b06eab008e8b7b8a8073577.jpg", "Vestido sin mangas rosa con negro Alice+Olivia");

INSERT INTO pedidos (fecha_pedido, monto, cliente_id_clientes, id_pedidos, correo, estado_pedido, direccion_envio, direccion_pedido) VALUES ('2024-04-04', 450.00, 1, 1, "maria.garcia@gmail.com", "Pendiente", "Calle Principal 123, Ciudad", "Calle Principal 123, Ciudad");