use kibobazar;
SELECT * FROM categorias;
ALTER TABLE productos AUTO_INCREMENT = 1;
INSERT INTO categorias( id_categorias, nombre, descripcion) 
VALUES 
(1, "Vestido","vestidos de diferentes estilos"),
(2, "Short", "shorts de diferentes estilos"),
(3, "Falda", "faldas de diferentes estilos "),
(4, "Blusa", "blusas de diferentes estilos "),
(5, "Camisa", "camisas de diferentes estilos");