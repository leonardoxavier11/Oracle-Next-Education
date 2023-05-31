CREATE TABLE consultas (

  id bigint not null auto_increment,
  medico_id bigint not null,
  paciente_id bigint not null,
  data_hora TIMESTAMP not null,
  realizada boolean,
  FOREIGN KEY (medico_id) REFERENCES medicos(id),
  FOREIGN KEY (paciente_id) REFERENCES pacientes(id),

  primary key(id)

);