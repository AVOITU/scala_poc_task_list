
import java.time.LocalDate
case class Task (id: Integer,
                name: String,
                description: String,
                startingDate: LocalDate,
                endDate: LocalDate){

    override def toString(): String = 
        s"La tâche a pour nom : $name et est décrite comme suit : $description."
        // s"Elle commence le $startingDate et finit le $endDate"
}