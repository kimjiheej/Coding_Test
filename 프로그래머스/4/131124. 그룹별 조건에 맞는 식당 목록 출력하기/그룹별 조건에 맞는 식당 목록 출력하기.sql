SELECT A.MEMBER_NAME,B.REVIEW_TEXT,DATE_FORMAT(B.REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE
from MEMBER_PROFILE A join REST_REVIEW B
on A.MEMBER_ID = B.MEMBER_ID
WHERE A.MEMBER_ID = (SELECT MEMBER_ID FROM REST_REVIEW
GROUP BY MEMBER_ID
ORDER BY COUNT(*) DESC LIMIT 1)
order by REVIEW_DATE asc, REVIEW_TEXT



