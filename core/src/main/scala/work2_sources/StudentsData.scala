package work2_sources

type Student = (
  Int, // ID
    String, // Имя
    Int, // Год рождения
    String, // Факультет
    Char, // Пол
    Int, // Курс
    Boolean // Проживает ли в общежитии
  )

val students: List[Student] = List(
  (0, "Алёна", 1995, "FIL", 'F', 1, true),
  (1, "Гриша", 1994, "AVT", 'M', 2, true),
  (2, "Настя", 1993, "MTS", 'F', 3, false),
  (3, "Коля", 1997, "MTS", 'M', 1, false),
  (4, "Миша", 1997, "AVT", 'M', 3, true),
  (5, "Оля", 1992, "FIL", 'F', 3, false),
  (6, "Маша", 1991, "AVT", 'F', 5, true),
  (7, "Таня", 1993, "FIL", 'M', 4, true),
  (8, "Женя", 1992, "FIL", 'F', 4, true),
  (9, "Света", 1989, "AVT", 'F', 3, true),
  (10, "Аня", 1996, "MTS", 'F', 4, false),
  (11, "Лена", 1996, "AVT", 'F', 2, true),
  (12, "Сергей", 1994, "FIL", 'M', 3, false),
  (13, "Влад", 1993, "FIL", 'M', 5, false),
  (14, "Гена", 1996, "MTS", 'M', 1, true),
  (15, "Дима", 1995, "AVT", 'M', 5, false),
  (16, "Катя", 1991, "FIL", 'F', 4, false),
  (17, "Артём", 1994, "MTS", 'M', 3, true),
  (18, "Диана", 1995, "FIL", 'M', 4, false)
)

type Room = (
  Int, // Номер комнаты
    Int, // Вместимость комнаты
    List[Int] // ID студентов, проживающих в комнате
  )

val rooms: List[Room] = List(
  (37, 3, List(0, 7, 8)),
  (42, 2, List(1, 4)),
  (43, 3, List(6, 9, 11)),
  (54, 2, List(14, 17))
)