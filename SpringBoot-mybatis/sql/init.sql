-- 建表语句------------------------------
DROP TABLE IF EXISTS city;
CREATE TABLE `city` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `province_id` int(20) DEFAULT NULL,
  `city_name` varchar(30) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

 -- 初始化 城市表数据-------------------------

INSERT INTO city (province_id, city_name, description) VALUES (001,"石家庄","河北");
INSERT INTO city (province_id, city_name, description) VALUES (002,"郑州","河南");
INSERT INTO city (province_id, city_name, description) VALUES (003,"太原","山西");
INSERT INTO city (province_id, city_name, description) VALUES (004,"济南","山东");
INSERT INTO city (province_id, city_name, description) VALUES (005,"南宁","广西");

-- --------------------------------------------


