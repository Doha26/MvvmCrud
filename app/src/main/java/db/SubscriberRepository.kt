package db

class SubscriberRepository (private val dao: SubscriberDAO){

    val subscribers = dao.getAllSubscribers();

    suspend fun insertSubscriber(subscriber: Subscriber){
        dao.insertSubscriber(subscriber)
    }

    suspend fun updateSubscriber(subscriber: Subscriber){
        dao.updateSubscriber(subscriber)
    }

    suspend fun deleteSubscriber(subscriber: Subscriber){
        dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAllSusbcriber(){
        dao.deleteAll()
    }
}