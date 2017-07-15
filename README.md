# IndexBuilder
## Purpose:
1. Split IndexBuilder from SearchAdsDemo
2. Generate Forward Index and Inverted Index
3. Store Forward Index in MySQL DB, Inverted Index in Memcached.

## Run the project:
1. Create two tables in Database "Searchads":
```
### Table: campaign

Columns:
campaignId  int(11) PK
budget      double

### Table: ad

Columns:
adId        int(11) PK
campaignId  int(11)
keyWords    varchar(1024)
bidPrice    double
price       double
thumbnail   mediumtext
description mediumtext
brand       varchar(1024)
detail_url  mediumtext
category    varchar(1024)
title       varchar(2048)

```
2. Change
```
adsDataFilePath,
budgetDataFilePath,
memcachedServer,
mysqlHost,
mysqlDb,
mysqlUser,
mysqlPass
```
  to your own value

3. Start Memcached：
In terminal, type in /usr/local/bin/memcached -d -p 11211

4. Run Main.java file in project

## Problem met:
### Throw exception: 
```Data too long for column 'brand' at row 1. ```
### Solution:
   Change ```brand varchar(100)``` into ```brand varchar(1024)```
