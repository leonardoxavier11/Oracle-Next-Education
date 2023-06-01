ALTER TABLE consultas DROP COLUMN data_hora_inicio;
ALTER TABLE consultas DROP COLUMN data_hora_fim;

ALTER TABLE consultas ADD COLUMN data_inicio date;
ALTER TABLE consultas ADD COLUMN hora_inicio time;
ALTER TABLE consultas ADD COLUMN data_fim date;
ALTER TABLE consultas ADD COLUMN hora_fim time;

ALTER TABLE consultas DROP COLUMN realizada;

