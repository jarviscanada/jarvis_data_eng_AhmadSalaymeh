CREATE TABLE IF NOT EXISTS PUBLIC.host_info (
  id SERIAL NOT NULL,
  hostname VARCHAR NOT NULL,
  cpu_number INT,
  cpu_architecture VARCHAR,
  cpu_mhz DECIMAL,
  L2_cache INT,
  total_mem INT,
  "timestamp" TIMESTAMP NOT NULL,
  PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS PUBLIC.host_usage (
  "timestamp" TIMESTAMP NOT NULL,
  host_id SERIAL NOT NULL,
  memory_free INT,
  cpu_idle INT,
  cpu_kernel INT,
  disk_io INT,
  disk_available INT,
  FOREIGN KEY(host_id) REFERENCES host_info(id)
);
INSERT INTO host_info (
  hostname, cpu_number, cpu_architecture,
  cpu_mhz, L2_cache, total_mem, "timestamp"
)
values
  (
    'spry-framework-236416.internal',
    1, 'x86_64', 2300.000, 256, 601324,
    '2019-05-29 16:53:28'
  );
INSERT INTO host_usage (
  "timestamp", host_id, memory_free,
  cpu_idle, cpu_kernel, disk_io, disk_available
)
VALUES
  (
    '2019-05-29 16:53:28', 1, 256, 95,
    0, 0, 31220
  );