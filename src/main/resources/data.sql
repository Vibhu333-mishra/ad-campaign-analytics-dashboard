-- ==========================
-- ADVERTISERS
-- ==========================

INSERT INTO advertisers (advertiser_name, industry, contact_email, created_at) VALUES
('Nike','Sportswear','nike@gmail.com','2026-06-01'),
('Amazon','E-Commerce','amazon@gmail.com','2026-06-01'),
('Swiggy','Food Delivery','swiggy@gmail.com','2026-06-01'),
('Samsung','Electronics','samsung@gmail.com','2026-06-01'),
('Myntra','Fashion','myntra@gmail.com','2026-06-01');



-- ==========================
-- CAMPAIGNS
-- ==========================

INSERT INTO campaigns
(campaign_name,budget,start_date,end_date,status,advertiser_id)
VALUES

('Summer Sale',50000,'2026-06-01','2026-06-30','ACTIVE',1),

('Winter Collection',70000,'2026-07-01','2026-07-31','PAUSED',1),

('Prime Day',150000,'2026-06-15','2026-07-15','ACTIVE',2),

('Mega Festival',180000,'2026-07-10','2026-08-10','ACTIVE',2),

('Food Fiesta',30000,'2026-06-05','2026-06-25','ACTIVE',3),

('Weekend Offers',25000,'2026-06-20','2026-07-05','COMPLETED',3),

('Galaxy Launch',250000,'2026-06-01','2026-07-30','ACTIVE',4),

('Smart TV Fest',120000,'2026-07-05','2026-08-05','PAUSED',4),

('Fashion Carnival',80000,'2026-06-10','2026-07-10','ACTIVE',5),

('End Season Sale',90000,'2026-07-01','2026-08-01','ACTIVE',5);


-- ==========================
-- CAMPAIGN PERFORMANCE
-- ==========================

INSERT INTO campaign_performance
(impressions, clicks, conversions, spend, revenue, country, device_type, campaign_id)
VALUES

(12000,420,80,6500,9800,'India','ANDROID',1),
(15000,530,95,7200,11000,'India','DESKTOP',1),

(18000,670,120,9500,14500,'USA','IOS',2),
(14000,490,85,6800,10100,'Canada','TABLET',2),

(25000,980,180,15000,22000,'India','ANDROID',3),
(22000,870,165,13800,20500,'UAE','IOS',3),

(28000,1100,220,17500,26000,'USA','DESKTOP',4),
(19000,720,145,11200,16800,'Singapore','ANDROID',4),

(11000,390,75,5400,7900,'India','ANDROID',5),
(9000,310,60,4300,6500,'India','TABLET',5);



INSERT INTO campaign_performance
(impressions, clicks, conversions, spend, revenue, country, device_type, campaign_id)
VALUES

(13000,470,88,6100,9300,'UK','DESKTOP',6),
(10000,360,65,4800,7100,'Australia','IOS',6),

(32000,1250,260,21000,31500,'India','ANDROID',7),
(29000,1180,235,19800,29800,'Germany','DESKTOP',7),

(17000,610,120,8700,12900,'USA','TABLET',8),
(15000,540,98,7600,11400,'Canada','ANDROID',8),

(20000,760,150,10800,16000,'India','IOS',9),
(18000,690,132,9800,14600,'Singapore','DESKTOP',9),

(24000,920,185,13600,20500,'India','ANDROID',10),
(21000,810,160,12100,18100,'UAE','IOS',10);