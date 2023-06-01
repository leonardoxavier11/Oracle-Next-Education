ALTER TABLE consultas ADD COLUMN data_hora_fim TIMESTAMP;
ALTER TABLE consultas CHANGE COLUMN data_hora data_hora_inicio TIMESTAMP;

ALTER TABLE medicos ADD COLUMN esta_em_consulta BOOLEAN;
UPDATE medicos SET esta_em_consulta = FALSE;

ALTER TABLE medicos ADD COLUMN realizou_consulta_hoje BOOLEAN;
UPDATE medicos SET realizou_consulta_hoje = FALSE;

