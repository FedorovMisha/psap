package work2_sources

/**
 * Вариант 2 (АВТ)
 * Написать функцию, которая возвращает список, содержащий год рождения всех
 * студентов факультета АВТ, проживающих в общежитии.
 * Написать функцию, которая возвращает список, содержащий имя курс и номер комнат
* */

type Predicate[A] = A => Boolean

def predicate[A](fns: Predicate[A]*)(x: A): Boolean = fns.forall(_(x))

val avtFaculty = (s: Student) => s match {
  case (_, _, _, "AVT", _, _, _) => true
  case _ => false
}

val liveInDormitory = (s: Student) => s match {
  case (_, _, _, _, _, _, true) => true
  case _ => false
}

val studentId = (s: Student) => s._1
val studentsLiveInRoom = (r: Room) => r._3

val avtStudentLivesInDormitoryFilter = (s: Student) => predicate(avtFaculty, liveInDormitory)(s)

val studentBirthDate = (s: Student) => s._3

val avtStudentBirthDatesLivesInDormitory = (lhs: List[Student]) => {
  lhs.filter(avtStudentLivesInDormitoryFilter).map(studentBirthDate)
}