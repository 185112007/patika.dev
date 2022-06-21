#### HW - 07: GROUP BY & HAVING

---

> Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1. film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
2. film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
3. customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir? 
4. city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.

---

> Cevaplar:

1. ```sql
   SELECT rating FROM film
   GROUP BY rating;
   ```
2. ```sql
   SELECT replacement_cost, COUNT(*) FROM film
   GROUP BY replacement_cost
   HAVING COUNT(*) > 50;
   ```
3. ```sql
   SELECT store_id, COUNT(*) FROM customer
   GROUP BY store_id;
   ```
4. ```sql
   SELECT country_id, COUNT(*) FROM city
   GROUP BY country_id
   ORDER BY COUNT(*) DESC
   LIMIT 1;
   ```

---

> Daha fazla bilgi için [app.patika.dev](https://app.patika.dev/courses/sql/Odev7) bakabilirsiniz