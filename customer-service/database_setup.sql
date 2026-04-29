-- ======================================================
-- Food Ordering System - Database Setup Script
-- Author: Mai Sobeih
-- Date: 27/04/2026
-- ======================================================

-- 1. إنشاء قاعدة البيانات 
CREATE DATABASE IF NOT EXISTS foodorder_db;
USE foodorder_db;

-- 2. إنشاء جدول العملاء (Customer)
DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
    id VARCHAR(20) PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(20),
    street VARCHAR(100),
    city VARCHAR(50),
    zip_code VARCHAR(10)
);

-- 3. إدخال البيانات التجريبية
INSERT INTO customer (id, first_name, last_name, email, phone, street, city, zip_code)
VALUES ('12345', 'Mai', 'Sobeih', 'Mai@gmail.com', '0592224524', 'Tel Alhowa', 'Gaza', '00970');

-- 4. (اختياري) عرض البيانات للتأكد
SELECT * FROM customer;