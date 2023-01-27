package com.koleon.shoppinglist.data

import com.koleon.shoppinglist.domain.ShopItem
import com.koleon.shoppinglist.domain.ShopListRepository
import java.lang.Exception

object ShopListRepositoryImpl: ShopListRepository {

    private val shopItemList = mutableListOf<ShopItem>()

    private var numberOfItems = 0;

    override fun addItemToShopList(item: ShopItem) {
        if (item.id == ShopItem.UNCLASSIFIED_ID) {
            item.id = numberOfItems++
        }
        shopItemList.add(item)
    }

    override fun changeItemInShopList(item: ShopItem) {
        val oldObject = shopItemList.get(item.id)
        shopItemList.remove(oldObject)
        addItemToShopList(item)

    }

    override fun deleteItemFromShopList(item: ShopItem) {
        shopItemList.remove(item)
    }

    override fun getShopItemId(shopItemId: Int): ShopItem {
        return shopItemList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found") //Elvis operator - if null then we return expression on the right

    }

    override fun getShopList(): List<ShopItem> {
        return shopItemList.toList()
    }
}