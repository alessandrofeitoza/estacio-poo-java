CREATE TABLE tb_usuarios (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(255) NOT NULL,
  cadastro_em VARCHAR(20) NOT NULL,
  UNIQUE (email)
);

INSERT INTO tb_usuarios 
(nome, senha, email, cadastro_em)
VALUES
('Chiquim das Tapiocas', '123456', 'chiquim@email.com', '2024-09-10 10:00:00');

INSERT INTO tb_usuarios 
(nome, senha, email, cadastro_em)
VALUES
('Maria das Flores', '123456', 'maria@email.com', '2024-07-18 18:23:00');

INSERT INTO tb_usuarios 
(nome, senha, email, cadastro_em)
VALUES
('Zezim das Rapaduras', '234561', 'zezim@email.com', '2023-12-24 09:12:45');


-- buscar todos os dados --
SELECT * FROM tb_usuarios;

-- buscar apenas alguns dados de todos --
SELECT nome, email FROM tb_usuarios; 


SELECT nome, email FROM tb_usuarios
WHERE id='2';


-- UPDATE tb_usuarios SET 
-- nome = 'Mariazinha das Flores';

-- UPDATE tb_funcionarios 
-- SET salario=(salario*1.1) 
-- WHERE id IN (1, 45, 78, 18);

-- UPDATE tb_funcionarios 
-- SET salario=(salario*1.1);


CREATE TABLE tb_posts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    usuario_id INT NOT NULL,
    legenda VARCHAR(255),
    foto VARCHAR(255) NOT NULL,
    data VARCHAR(20) NOT NULL,

    FOREIGN KEY (usuario_id) REFERENCES tb_usuarios(id)
);


INSERT INTO tb_posts (usuario_id, legenda, foto, data)
VALUES 
('2', 'Agora vai', 'foto.jpg', '2024-09-12');


SELECT 
  tb_posts.legenda,
  tb_posts.foto,
  tb_usuarios.nome as autor
FROM tb_posts INNER JOIN 
tb_usuarios ON 
tb_posts.usuario_id = tb_usuarios.id;



-- Orientação Objetos
-- API (GET, POST, PATCH, JSON)
-- Banco de Dados