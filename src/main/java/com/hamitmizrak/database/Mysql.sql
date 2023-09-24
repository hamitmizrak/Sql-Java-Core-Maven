
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
  `email_address` VARCHAR(250) NULL DEFAULT 'emailinizi girmediniz',
  `password` VARCHAR(250) NULL DEFAULT 'pasword girmediniz',
  `telephone_number` VARCHAR(250) NULL DEFAULT 'telefon numaraınızı girmediniz',
  `remaining_number` VARCHAR(2) NULL DEFAULT '4',
  `is_passive` VARCHAR(2) NULL DEFAULT '0',
  `created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));
  
  -- tabloya veri eklemek
ALTER TABLE `atm`.`atm_register` 
ADD COLUMN `remaining_number` VARCHAR(2) NULL DEFAULT '4' AFTER `created_date`,
ADD COLUMN `is_passive` VARCHAR(2) NULL DEFAULT 0 AFTER `remaining_number`;

  
  -- Truncate Table
  TRUNCATE `atm`.`atm_register`;

-- INSERT
insert into `atm`.`atm_register` (name,surname,email_address,password,telephone_number,remaining_number,is_passive) values ("Hamit","Mızrak","hamitmizrak@gmail.com","root44","+901112223344","4","0");
insert into `atm`.`atm_register` (name,surname,email_address,password,telephone_number,remaining_number,is_passive) values ("Hamit2","Mızrak2","hamitmizrak2@gmail.com","root422","+901112223344","4","0");


-- SELECT
select * from `atm`.`atm_register` ;

-- FIND
select * from `atm`.`atm_register` where id="1" ;

-- UPDATE
update `atm`.`atm_register` set  name="Adı44", surname="soyadı44",email_address="email44@gmail.com",password="şifre44",telephone_number="telefon44" where id=1;


-- DELETE
delete from `atm`.`atm_register` where id="1"

