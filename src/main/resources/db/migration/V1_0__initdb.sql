CREATE SEQUENCE equipment_seq;

CREATE TABLE sports_equipment (
    id BIGINT primary key default nextval('equipment_seq'),
    name CHARACTER VARYING(50),
    params CHARACTER VARYING,
    age INTEGER,
    conditions CHARACTER VARYING
)