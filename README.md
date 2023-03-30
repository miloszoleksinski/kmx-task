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
As a Java Developer and DevOps professional, my main goal is to continue to develop my technical skills and stay up-to-date with the latest trends and technologies in the industry. I want to become proficient in different programming languages, gain expertise in software architecture, design patterns and develop a deep understanding of software development methodologies.

I also aspire to become a great software engineer in all directions. This means that I am committed to not only developing my technical skills but also my soft skills such as communication, collaboration, and leadership. I believe that effective communication and collaboration are essential for working in teams and that leadership skills can help me to take on more significant responsibilities in my career.

---
### Task 4
#### Question
What is your favourite programming language, and why?

#### Answer
JAVA - I can list few things
1. Platform independence - Can run my apps on whatever machine with whatever OS, I just need JVM
2. Rich class libraries - Many libraries/frameworks to solve many problems.
3. Community - Huge amount of problems that other developers already solved
4. Garbage collection - Clears space for me so that I'm not going to see StackOverflowException so often
5. Backwards compatibility - I can run my old Java 8 apps written many years ago on Java 19
6. I'm already familiar with syntax
