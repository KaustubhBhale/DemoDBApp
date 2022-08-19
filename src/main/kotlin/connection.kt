import java.sql.Connection
import java.sql.DriverManager

class connection {

    fun getConnection():Connection{
        val url = "jdbc:mysql://localhost:3306/sampledb"
        var connection :Connection = DriverManager.getConnection(url,"root","root")
        if(connection.isValid(0))
            return connection
        return connection
    }
}