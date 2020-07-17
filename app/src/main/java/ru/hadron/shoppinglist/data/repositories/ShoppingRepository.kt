package ru.hadron.shoppinglist.data.repositories
/**
 * Класс ShoppingRepository - взаимодейсвтие с источниками данных.
 */
import ru.hadron.shoppinglist.data.db.ShoppingDataBase
import ru.hadron.shoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(private val db: ShoppingDataBase) {

    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)
    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}