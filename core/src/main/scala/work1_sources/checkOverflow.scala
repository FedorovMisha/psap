package work1_sources

def checkStackOverflowFor[A](f: List[A] => List[A],
                             el: A,
                             initial: Int = 100,
                             max: Int = 60_000): (Int, String) =
  var counter = initial
  try
    while counter < max do
      f(List.fill(counter)(el))
      counter += 1
    (counter,  "Стек не переполнился")
  catch
    case e: StackOverflowError => (counter, s"Стек переполнен на размере списка $counter")


