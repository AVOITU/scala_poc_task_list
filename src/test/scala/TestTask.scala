import java.time.LocalDate

class TestTask extends munit.FunSuite{
  
    test("test create Task"){
        val task = new Task(1,"ok","ok",LocalDate.now(),LocalDate.now().plusDays(1))

        assertEquals(task.id, Integer(1))
        assertEquals(task.name, "ok")
        assertEquals(task.description, "ok")
        assertEquals(task.startingDate, LocalDate.now())
        assertEquals(task.endDate, LocalDate.now().plusDays(1))
    }

    test("override tostring"){
        val task = new Task(1,"ok","ok",LocalDate.now(),LocalDate.now().plusDays(1))
        
        val sentenceToString =task.toString()
        val expected = "La tâche a pour nom : ok et est décrite comme suit : ok."
        assertEquals(sentenceToString, expected)
    }
}
