package com.koleon.shoppinglist.domain

class AddItemToShopListUseCase (private val shopListRepository: ShopListRepository) {

    fun addItemToShopList(item: ShopItem): Unit {
        shopListRepository.addItemToShopList(item)
    }
}