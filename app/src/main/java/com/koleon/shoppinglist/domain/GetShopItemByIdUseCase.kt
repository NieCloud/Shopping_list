package com.koleon.shoppinglist.domain

class GetShopItemByIdUseCase (private val shopListRepository: ShopListRepository) {

    fun getShopItemId(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItemId(shopItemId)
    }

}