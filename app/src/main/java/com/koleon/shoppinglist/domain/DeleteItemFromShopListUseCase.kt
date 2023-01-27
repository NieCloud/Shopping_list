package com.koleon.shoppinglist.domain

class DeleteItemFromShopListUseCase (private val shopListRepository: ShopListRepository) {

    fun deleteItemFromShopList(item: ShopItem): Unit {
        shopListRepository.deleteItemFromShopList(item)
    }
}