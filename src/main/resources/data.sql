-- Inserción en la tabla Medication
INSERT INTO medication (id, name, description, dosage) VALUES (1, 'Paracetamol', 'Analgésico y antipirético', '500mg');
INSERT INTO medication (id, name, description, dosage) VALUES (2, 'Ibuprofeno', 'Anti-inflamatorio', '200mg');

-- Inserción en la tabla Disease
INSERT INTO disease (id, name, description) VALUES (1, 'Gripe', 'Infección viral que afecta el sistema respiratorio.');
INSERT INTO disease (id, name, description) VALUES (2, 'Migraña', 'Dolor de cabeza intenso acompañado de náuseas.');

-- Inserción en la tabla Inform
INSERT INTO inform (id, name, description, medication_id, disease_id)
VALUES (1, 'Tratamiento para la gripe', 'Paracetamol puede ayudar a reducir la fiebre y el malestar.', 1, 1);
INSERT INTO inform (id, name, description, medication_id, disease_id)
VALUES (2, 'Tratamiento para migraña', 'El ibuprofeno alivia el dolor asociado a la migraña.', 2, 2);
