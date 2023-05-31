CREATE TABLE consultas (

  id bigint not null auto_increment,
  medico_id bigint,
  paciente_id bigint,
  data_hora TIMESTAMP,
  realizada boolean,
  FOREIGN KEY (medico_id) REFERENCES medicos(id),
  FOREIGN KEY (paciente_id) REFERENCES pacientes(id),

  primary key(id)

);
