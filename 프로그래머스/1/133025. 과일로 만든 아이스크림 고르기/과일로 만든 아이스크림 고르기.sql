-- 코드를 입력하세요
SELECT INFO.FLAVOR FROM FIRST_HALF AS HALF
LEFT JOIN ICECREAM_INFO AS INFO 
ON HALF.FLAVOR = INFO.FLAVOR 
WHERE INFO.INGREDIENT_TYPE LIKE 'fruit_based'
AND TOTAL_ORDER>3000 
ORDER BY TOTAL_ORDER DESC;

