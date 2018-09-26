
/**
 * Author:  jlozano
 * Created: 20/08/2018
 * Sql para las tablas utilizadas en el proyecto
*/ 

CREATE TABLE `usuario` (
  `ID` int(50) NOT NULL,
  `NOMBRE` varchar(50) NOT NULL,
  `APELLIDO` varchar(50) NOT NULL,
  `TIPO_DOCUMENTO` varchar(50) NOT NULL,
  `NUMERO_DOCUMENTO` varchar(50) NOT NULL,
  `DIRECCION` varchar(50) NOT NULL,
  `NUMERO_CELULAR` varchar(50) NOT NULL,
  `BARRIO` varchar(50) NOT NULL,
  `COMUNA` varchar(50) NOT NULL,
  `TELEFONO` varchar(50) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `SEXO` varchar(50) NOT NULL,
  `EPS` varchar(50) NOT NULL,
  `PENSION` varchar(50) NOT NULL,
  `ARL` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Indices de la tabla `USUARIO`

ALTER TABLE `USUARIO`
  ADD PRIMARY KEY (`ID`);
COMMIT;

-- Insert de la tabla 

INSERT INTO `usuario` (`ID`, `NOMBRE`, `APELLIDO`, `TIPO_DOCUMENTO`, `NUMERO_DOCUMENTO`, `DIRECCION`, `NUMERO_CELULAR`, `BARRIO`, `COMUNA`, `TELEFONO`, `EMAIL`, `SEXO`, `EPS`, `PENSION`, `ARL`) VALUES ('1', 'Sebastian', 'lozano', 'Cédula de ciudadanía', '1143861043', 'Diagonal 51 oeste #13-19', '3187279135', 'Cañaveralejo', '20', '5528820', 'jlozano@nexura.com', 'Masculino', 'Coomeva', 'Juvilado', 'Colseguros');
