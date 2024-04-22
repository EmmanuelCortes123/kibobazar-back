
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