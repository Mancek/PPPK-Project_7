package hr.algebra.personmanager.dao

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import java.time.LocalDate

@Entity(tableName = "people")
data class Person(
    @PrimaryKey(autoGenerate = true) var _id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var picturePath: String? = null,
    var birthDate: LocalDate = LocalDate.now(),
    var hairColor: String? = null
){
    override fun toString() = "$firstName $lastName"
}
