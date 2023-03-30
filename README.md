# kmx-task
KMX: task for recruiting

---
### Task 1
#### Question
You have the following API endpoint: https://postman-echo.com/get?foo1=bar1&foo2=bar2
Please set up a quick page using any language. Call the API endpoint and display results

#### Answer
To execute a Java application, it is necessary to build the app from the directory 
"kmx-tasktask1/kmxMiloszOleksinski" using Maven as the building tool. 
After the construction process, you can launch your preferred web browser and access the URL 
"http://localhost:8080/home" to activate home endpoint and view the output.

---
### Task 2
#### Question
Using the below tables, write an SQL query to bring the department description that has the largest salary costs

#### Answer
```sql
SELECT km_department.department_description
FROM km_department d
JOIN km_person p ON d.department_id = p.department_id
JOIN km_salaries s ON p.person_id = s.person_id
GROUP BY d.department_description
ORDER BY SUM(s.salary) DESC
FETCH FIRST 1 ROW ONLY;
```

---
### Task 3
#### Question
What are your goals as a software engineer?

#### Answer
xxx

---
### Task 4
#### Question
What is your favourite programming language, and why?

#### Answer
xxx