--------------------------------------------------------
--  DDL for View INDICATOR1
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "PRUEBA"."INDICATOR1" ("IND_PERIODO", "IND_CANTIDAD") AS 
  SELECT to_char(FECHA_NACIMIENTO, 'MM/YYYY') IND_PERIODO, 
COUNT(to_char(FECHA_NACIMIENTO, 'MM/YYYY')) IND_CANTIDAD

FROM CUSTOMERS

GROUP BY to_char(FECHA_NACIMIENTO, 'MM/YYYY')
ORDER BY  COUNT(to_char(FECHA_NACIMIENTO, 'MM/YYYY') ) DESC
;
--------------------------------------------------------
--  DDL for View INDICATOR2
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "PRUEBA"."INDICATOR2" ("IND_PERIO_MAX", "IND_CANTI_MAX") AS 
  select IND_PERIODO AS IND_PERIO_MAX, IND_CANTIDAD AS IND_CANTI_MAX from indicator1
where ind_cantidad= (select MAX(ind_cantidad)from indicator1)
;
--------------------------------------------------------
--  DDL for View INDICATOR3
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "PRUEBA"."INDICATOR3" ("IND_PERIO_MIN", "IND_CANTI_MIN") AS 
  select IND_PERIODO AS IND_PERIO_MIN, IND_CANTIDAD AS IND_CANTI_MIN from indicator1
where ind_cantidad= (select MIN(ind_cantidad)from indicator1)
;
--------------------------------------------------------
--  DDL for View INDICATOR4
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "PRUEBA"."INDICATOR4" ("IND_MES", "IND_ANNO", "IND_CANT_MES", "IND_POBLA_TOTAL", "IND_TAZA_NATA") AS 
  select 
(to_char(FECHA_NACIMIENTO, 'MM')) IND_MES, 
(to_char(FECHA_NACIMIENTO, 'YYYY')) IND_ANNO,
COUNT(to_char(FECHA_NACIMIENTO, 'MM/YYYY'))IND_CANT_MES,
(select COUNT(*) from CUSTOMERS)IND_POBLA_TOTAL,
ROUND(((COUNT(to_char(FECHA_NACIMIENTO, 'MM/YYYY'))/(select COUNT(*) from CUSTOMERS))*100),2) IND_TAZA_NATA
FROM CUSTOMERS
where (to_char(FECHA_NACIMIENTO, 'YYYY')) in (select (to_char(FECHA_NACIMIENTO, 'YYYY')) FROM CUSTOMERS GROUP BY to_char(FECHA_NACIMIENTO, 'YYYY'))
GROUP BY (to_char(FECHA_NACIMIENTO, 'YYYY')),(to_char(FECHA_NACIMIENTO, 'MM'))
ORDER BY (to_char(FECHA_NACIMIENTO, 'YYYY')),(to_char(FECHA_NACIMIENTO, 'MM'))
;