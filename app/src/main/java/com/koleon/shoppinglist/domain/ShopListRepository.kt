package com.koleon.shoppinglist.domain

interface ShopListRepository {

    fun addItemToShopList(item: ShopItem): Unit

    fun changeItemInShopList(item: ShopItem)

    fun deleteItemFromShopList(item: ShopItem): Unit

    fun getShopItemId(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>


}