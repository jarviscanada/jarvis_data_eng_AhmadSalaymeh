CREATE DATABASE host_agent;
\c host_agent;

CREATE TABLE IF NOT EXISTS host_info (
  id SERIAL NOT NULL,
  hostname VARCHAR NOT NULL,
  cpu_number INT,
  cpu_architecture VARCHAR,
  cpu_model     varchar,
  cpu_mhz DECIMAL,
  L2_cache INT,
  total_mem INT,
  "timestamp" TIMESTAMP NOT NULL,
  PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS host_usage (
  "timestamp" TIMESTAMP NOT NULL,
  host_id SERIAL NOT NULL,
  memory_free INT,
  cpu_idle INT,
  cpu_kernel INT,
  disk_io INT,
  disk_available INT,
  PRIMARY KEY ("timestamp",host_id),
  FOREIGN KEY(host_id) REFERENCES host_info(id)
);