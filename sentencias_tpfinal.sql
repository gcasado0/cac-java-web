CREATE DATABASE tpfinal DEFAULT CHARACTER SET utf8;
USE tpfinal;
GRANT ALL ON tpfinal.* TO 'gustavo'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;
exit;


CREATE TABLE `orador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `titulo` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `resumen` varchar(1000) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date NOT NULL,  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
