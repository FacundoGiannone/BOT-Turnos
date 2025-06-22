

INSERT INTO admin (id, apellido, contraseña, nombre, usuario) VALUES
(1, 'Pérez', 'admin123', 'Laura', 'lperez'),
(2, 'Gómez', 'admin456', 'Carlos', 'cgomez');

INSERT INTO profesionales (id, apellido, especialidad, nombre) VALUES
(1, 'Fernández', 'Dermatología', 'María'),
(2, 'Rodríguez', 'Kinesiología', 'Juan'),
(3, 'López', 'Odontología', 'Lucía'),
(4, 'Martínez', 'Pediatría', 'Fernando'),
(5, 'Sánchez', 'Clínica Médica', 'Verónica');


INSERT INTO servicios (id, nombre, precio) VALUES
(1, 'Consulta dermatológica', 4500),
(2, 'Sesión de kinesiología', 5000),
(3, 'Limpieza dental', 3500),
(4, 'Consulta pediátrica', 4000),
(5, 'Consulta clínica general', 3000),
(6, 'Extracción dental', 7000),
(7, 'Electroterapia', 5500),
(8, 'Control de niño sano', 3800);

INSERT INTO usuarios (id, apellido, nombre, telefono) VALUES
(1, 'Ramírez', 'Ana', '2614123456'),
(2, 'Molina', 'Sergio', '2614234567'),
(3, 'Ruiz', 'Valeria', '2614345678'),
(4, 'Agüero', 'Diego', '2614456789'),
(5, 'Torres', 'Elena', '2614567890'),
(6, 'Moreno', 'Gabriel', '2614678901'),
(7, 'Navarro', 'Rosa', '2614789012'),
(8, 'Castro', 'Iván', '2614890123'),
(9, 'Gutiérrez', 'Luciana', '2614901234'),
(10, 'Silva', 'Nicolás', '2614012345');

INSERT INTO turnos (id, estado, fecha, hora, id_profesional, id_servicio, id_usuario) VALUES
(1, 'pendiente', '2025-06-18', '09:00:00', 1, 1, 1),
(2, 'confirmado', '2025-06-18', '10:00:00', 2, 2, 2),
(3, 'pendiente', '2025-06-19', '11:00:00', 3, 3, 3),
(4, 'cancelado', '2025-06-15', '14:00:00', 4, 4, 4),
(5, 'cancelado', '2025-06-16', '16:00:00', 5, 5, 5),
(6, 'pendiente', '2025-06-20', '10:00:00', 3, 6, 6),
(7, 'confirmado', '2025-06-20', '11:00:00', 2, 7, 7),
(8, 'pendiente', '2025-06-21', '12:00:00', 4, 8, 8),
(9, 'pendiente', '2025-06-21', '13:00:00', 1, 1, 9),
(10, 'confirmado', '2025-06-22', '09:30:00', 2, 2, 10),
(11, 'cancelado', '2025-06-10', '15:00:00', 3, 3, 1),
(12, 'cancelado', '2025-06-11', '16:30:00', 5, 5, 2),
(13, 'cancelado', '2025-06-17', '17:00:00', 4, 4, 3),
(14, 'pendiente', '2025-06-23', '10:00:00', 2, 7, 4),
(15, 'confirmado', '2025-06-24', '11:30:00', 1, 1, 5);


