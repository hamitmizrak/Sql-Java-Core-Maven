
-- Create Database
CREATE SCHEMA `atm` DEFAULT CHARACTER SET utf8 ;

-- Drop  database
drop database `atm` ;

-- use Atm
use atm;

-- Table
CREATE TABLE `atm`.`atm_register` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(250) NULL DEFAULT 'adınızı girmediniz',
  `surname` VARCHAR(250) NULL DEFAULT 'soyadınız girmediniz',
  `email_addres` VARCHAR(250) NULL DEFAULT 'emailinizi girmediniz',
  `password` VARCHAR(250) NULL DEFAULT 'pasword girmediniz',
  `telephone_number` VARCHAR(250) NULL DEFAULT 'telefon numaraınızı girmediniz',
  `created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));
  
  -- Truncate Table
  TRUNCATE `atm`.`atm_register`;

-- INSERT
insert into `atm`.`atm_register` (name,surname,email_addres,password,telephone_number) values ("Hamit","Mızrak","hamitmizrak@gmail.com","root44","+901112223344");
insert into `atm`.`atm_register` (name,surname,email_addres,password,telephone_number) values ("Hamit2","Mızrak2","hamitmizrak2@gmail.com","root44","+901112223344");

-- SELECT
select * from `atm`.`atm_register` ;

-- FIND
select * from `atm`.`atm_register` where id="1" ;

-- UPDATE
update `atm`.`atm_register` set  name="Adı44", surname="soyadı44",email_address="email44@gmail.com",password="şifre44",telephone_number="telefon44" where id=1;


-- DELETE
delete from `atm`.`atm_register` where id="1"
