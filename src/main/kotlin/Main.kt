import mu.KotlinLogging
import utils.ScannerInput
import java.lang.System.exit

private val logger = KotlinLogging.logger {}


fun main(args: Array<String>) {
    runMenu()
}

fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1  -> addNote()
            2  -> listNotes()
            3  -> updateNote()
            4  -> deleteNote()
            0  -> exitApp()
            else -> System.out.println("Invalid option entered: ${option}")
        }
    } while (true)
}

fun mainMenu() : Int {
    return ScannerInput.readNextInt(""" 
         > ----------------------------------
         > |        NOTE KEEPER APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a note                |
         > |   2) List all notes            |
         > |   3) Update a note             |
         > |   4) Delete a note             |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
}

fun addNote(){
    logger.info { "addNote() function invoked" }
}

fun listNotes(){
    logger.info { "listNotes() function invoked" }
}

fun updateNote(){
    logger.info { "updateNotes() function invoked" }
}

fun deleteNote(){
    logger.info { "deleteNotes() function invoked" }
}

fun exitApp(){
    println("Exiting...bye")
    exit(0)
}