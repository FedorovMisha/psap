import work2_sources._

type StudentNeighbour = (
    String,
    Int,
    Int
  )

def getAVTStudentsInSameRoom(students: List[Student], rooms: List[Room]): List[StudentNeighbour] = {
  val avtStudents = students.filter(avtFaculty).map(s => (s._2, s._6, s._1)) // Имя, Курс, ID
  val roomStudents = rooms.flatMap(r => studentsLiveInRoom(r).map(id => (r._1, id))) // Номер комнаты, ID

  val adjacentRooms = rooms.sortBy(_._1).sliding(2).collect {
    case List((room1, _, _), (room2, _, _)) if room2 - room1 == 1 => (room1, room2)
  }.toList

  avtStudents.flatMap { case (name, course, id) =>
    roomStudents.find(_._2 == id).flatMap { case (room, _) =>
      if (adjacentRooms.exists { case (room1, room2) => room == room1 || room == room2 }) {
        Some((name, course, room))
      } else {
        None
      }
    }
  }
}

val avtStudentsInSameRoom = getAVTStudentsInSameRoom(students, rooms)
avtStudentsInSameRoom.foreach { case (name, course, room) =>
  println(s"Имя: $name, Курс: $course, Номер комнаты: $room")
}