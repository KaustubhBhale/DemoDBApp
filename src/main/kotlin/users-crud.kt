import java.sql.*

fun main() {
    var con = connection()
    val connection = con.getConnection()
    if(connection.isValid(0)){
        println("Successfully connected ")
    }else{
        println("Failed ! ")
    }
    var listOfUsers : ArrayList<User> = ArrayList()

    //inserting data
//    var res = connection.createStatement().executeUpdate("insert into users(name,age,email,phone,city,state,country,pincode) values ('Rohit',33,'rohit770@gmail.com','9850693663','Nagpur','Maharashtra','India',417092)")
//    if(res>0){
//        println("record inserted successfully")
//    }else{
//        println("insertion failed")
//    }

    //updating record for id=3, changing Rohit -> Ramesh,age->40
//    var res = connection.createStatement().executeUpdate("update users set name='Ramesh',age=40 where id=3")
//    if(res>0){
//        println("Record updated successfully")
//    }else{
//        println("Failed to update record")
//    }

    //deleting from table
//    var query1 = "delete from users where id=7"
//    var statement = connection.createStatement()
//    var res = statement.executeUpdate(query1)
//   // var res = connection.createStatement().executeUpdate("delete from users where id=7")
//    if(res>0){
//        println("Record deleted successfully !")
//    }else{
//        println("Deletion failed")
//    }

    //displaying table
    var query = "select * from users"
    var statment = connection.createStatement()
    var result = statment.executeQuery(query)

    while(result.next()){
        var id = result.getInt("id")
        var name=result.getString("name")
        //var age = result.getInt("age")
//        var email = result.getString("email")
//        var phone = result.getString("phone")
//        var city = result.getString("city")
//        var state = result.getString("state")
//        var country = result.getString("country")
//        var pincode = result.getString("pincode")

        val user = User(id,name)
        listOfUsers.add(user)
    }

    println(listOfUsers)
    connection.close()
}