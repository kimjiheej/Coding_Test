-- 코드를 입력하세요
SELECT B.USER_ID, B.NICKNAME, SUM(PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD A 
right join USED_GOODS_USER B 
ON A.WRITER_ID = B.USER_ID
WHERE A.STATUS='DONE'
GROUP BY A.WRITER_ID HAVING SUM(PRICE) >= 700000
ORDER BY TOTAL_SALES ASC;