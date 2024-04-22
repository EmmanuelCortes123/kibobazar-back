
SELECT * FROM pedidos;
ALTER TABLE pedidos AUTO_INCREMENT = 1;
INSERT INTO pedidos (id_clientes, id_productos, monto, direccion_envio, direccion_pedido, correo, fecha_pedido, estado_pedido) VALUES
(1, 1, 450.00, "Calle Principal 123, Ciudad", "Calle Principal 123, Ciudad", "maria.garcia@gmail.com", '2024-04-04', "Pendiente"),
(2, 10, 550.00, "Avenida Central 456, Ciudad", "Avenida Central 456, Ciudad", "juan.martinez@gmail.com", '2024-04-06', "Pendiente"),
(3, 6, 360.00, "Calle Secundaria 789, Ciudad", "Calle Secundaria 789, Ciudad", "ana.lopez@gmail.com", '2024-04-08', "Pendiente"),
(4, 15, 450.00, "Avenida Principal 101, Ciudad", "Avenida Principal 101, Ciudad", "carlos.hernandez@gmail.com", '2024-04-10', "Pendiente"),
(5, 20, 550.00, "Calle Secundaria 202, Ciudad", "Calle Secundaria 202, Ciudad", "laura.perez@gmail.com", '2024-04-12', "Pendiente");