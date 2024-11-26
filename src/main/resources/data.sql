-- Inserción en la tabla Medication
INSERT INTO medication (id, name, description, dosage) VALUES (1, 'Paracetamol', 'Analgésico y antipirético', '500mg');
INSERT INTO medication (id, name, description, dosage) VALUES (2, 'Ibuprofeno', 'Anti-inflamatorio', '200mg');
INSERT INTO disease (id, name, description) VALUES (1, 'Gripe', 'Infección viral que afecta el sistema respiratorio.');
INSERT INTO disease (id, name, description) VALUES (2, 'Migraña', 'Dolor de cabeza intenso acompañado de náuseas.');
INSERT INTO inform (id, name, description, medication_id, disease_id)
VALUES (1, 'Tratamiento para la gripe', 'Paracetamol puede ayudar a reducir la fiebre y el malestar.', 1, 1);
INSERT INTO inform (id, name, description, medication_id, disease_id)
VALUES (2, 'Tratamiento para migraña', 'El ibuprofeno alivia el dolor asociado a la migraña.', 2, 2);
INSERT INTO patient (name, address, gender, inform_id, age)
VALUES ('Juan Pérez', 'Calle Falsa 123, Ciudad XYZ', 'M', 1, 30);

INSERT INTO patient (name, address, gender, inform_id, age)
VALUES ('Ana Gómez', 'Av. Principal 456, Ciudad ABC', 'F', 2, 25);

INSERT INTO patient (name, address, gender, inform_id, age)
VALUES ('Carlos Rodríguez', 'Calle Mayor 789, Ciudad DEF', 'F', 1, 45);

INSERT INTO patient (name, address, gender, inform_id, age)
VALUES ('Laura Martínez', 'Calle Secundaria 101, Ciudad GHI', 'M', 2, 40);

INSERT INTO patient (name, address, gender, inform_id, age)
VALUES ('José López', 'Calle de la Luna 202, Ciudad JKL', 'F', 1, 50);
