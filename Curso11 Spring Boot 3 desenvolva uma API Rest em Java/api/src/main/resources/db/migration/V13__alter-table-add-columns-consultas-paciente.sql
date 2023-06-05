ALTER TABLE pacientes ADD COLUMN realizou_consulta_hoje BOOLEAN;
UPDATE pacientes SET realizou_consulta_hoje = FALSE;

