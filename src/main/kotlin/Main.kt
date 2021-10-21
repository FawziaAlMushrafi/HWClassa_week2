fun main(args: Array<String>) {

        var informationCourse=Course("math",1,
            mutableListOf("Sara", "Ali" , "Amal"),"Abdullah Ahamad")
        var professor1=Professor("Abdullah","Ahmad","+996058974", mutableListOf("Mathematics","math"))
        var professor2=Professor("Nawaf","Abdulaziz","+96098643" ,mutableListOf("Mathematics","Math")
        var infoStudent=Student("Fawzia" , "AlMushrafi"),mutableListOf("Mathematics","Math")


        println(course.informationCourse())
        println(professor.fullName())
        println(professor2.fullName())
        println(infoStudent.fullName())
}
//Course
//Attributes: CourseName, number_of_lectures, students, professor.
//Methods:
//int numberOfStudents()
//boolean assignProfessor(Professor p) // assign professor to course. Course can have only one professor.
//string professorName() // return professor full name
//boolean enroll(Student s) // assign student to this course. Student can’t be enrolled to a course if the course has 20 studens
//string courseInfo() // return the course name number of lectures professor and students

    class Course(
        var courseName: String?,
        var numberOfLectures:Int,
        var students: List<String>?,
        var professor: String? )


            //Professor
            //Attributes: firstName, lastName, telephone, courses.
            //Methods: String fullName() // return “firstName lastName”

            class Professor(
                var FtName: String,
                var LtName: String,
                var telephone: String,
                var courses: List<String>
            )

                // class Student
                //Attributes: firstName, lastName, courses.
              // Methods: String fullName() // return “firstName lastName”
                class Student(
                    //Attributes: firstName, lastName, courses.
                    var FName: String,
                      var LName: String,
                    var courses: List<String>

                      // Methods: String fullName() //
                      //return “firstName lastName”
        fun fullName():String ="your full Name is: $FName $LtName"
//Print chek Main
}







