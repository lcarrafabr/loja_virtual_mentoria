SELECT constraint_name FROM information_schema.key_column_usage
WHERE table_name = 'usuarios_acesso'
AND column_name = 'acesso_id'
and constraint_name <> 'unique_acesso_user';

ALTER TABLE usuarios_acesso DROP FOREIGN KEY acesso_fk;

ALTER TABLE usuarios_acesso DROP INDEX UK_8bak9jswon2id2jbunuqlfl9e;