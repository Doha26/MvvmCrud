package db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Subscriber::class], version = 1)
abstract class SubscribeDatabase : RoomDatabase() {
    abstract val subscriberDAO: SubscriberDAO

    companion object {
        @Volatile
        private var INSTANCE: SubscribeDatabase? = null
        fun getInstance(context: Context): SubscribeDatabase {
            synchronized(this) {
                var instance: SubscribeDatabase? = INSTANCE
                if (instance === null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        SubscribeDatabase::class.java,
                        "subscriber_data_database"
                    ).build()
                }
                return instance
            }
        }
    }
}