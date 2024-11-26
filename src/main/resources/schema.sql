CREATE TABLE medication (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            description VARCHAR(255),
                            dosage VARCHAR(255)
);

CREATE TABLE disease (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         description VARCHAR(255)
);

CREATE TABLE inform (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        description VARCHAR(255),
                        medication_id BIGINT,
                        disease_id BIGINT,
                        CONSTRAINT fk_medication FOREIGN KEY (medication_id) REFERENCES medication (id),
                        CONSTRAINT fk_disease FOREIGN KEY (disease_id) REFERENCES disease (id)
);
