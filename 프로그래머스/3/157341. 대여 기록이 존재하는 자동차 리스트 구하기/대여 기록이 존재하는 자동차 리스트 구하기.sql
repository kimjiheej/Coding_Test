-- 코드를 입력하세요
SELECT DISTINCT(B.CAR_ID) FROM 
CAR_RENTAL_COMPANY_CAR A 
RIGHT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B
ON A.CAR_ID = B.CAR_ID 
WHERE START_DATE LIKE '2022-10-%' AND A.CAR_TYPE='세단'
ORDER BY A.CAR_ID DESC
