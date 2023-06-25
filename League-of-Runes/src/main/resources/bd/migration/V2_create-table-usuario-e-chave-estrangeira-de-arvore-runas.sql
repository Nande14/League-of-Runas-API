CREATE TABLE usuario(
    usu_nome TEXT NOT NULL,
    usu_email TEXT NOT NULL,
    usu_senha TEXT NOT NULL,
    usu_nome_de_conta TEXT PRIMARY KEY
)

ALTER TABLE arvoreRunas
ADD FOREIGN KEY(usu_nome_de_conta)
REFERENCES usuario(usu_nome_de_conta);