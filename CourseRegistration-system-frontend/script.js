function showAvailableCourses() {
   fetch('http://localhost:8080/Course')
     .then(response => response.json())
     .then((courses) => {
           const datatable = document.getElementById("courseTableBody")
             courses.forEach(course => {
                 var row = `<tr>
                 <td>${course.courseId}</td>
                 <td>${course.courseName}</td>
                 <td>${course.trainer}</td>
                 <td>${course.durationInWeek}</td>
                    </tr>`;

                 datatable.innerHTML += row;
             });

        });

    }

 function enrolledStudents() {
   fetch('http://localhost:8080/course/entrolledStudent')
     .then(response => response.json())
     .then((students) => {
           const datatable = document.getElementById("courseTable")
             students.forEach(student => {
                 var row = `<tr>
                 <td>${student.courseName}</td>
                 <td>${student.emailId}</td>
                 <td>${student.name}</td>
                    </tr>`;

                 datatable.innerHTML += row;
             });

        });


    }